package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class TheoryChoose extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelTheory>mainModels;
    AdapterTheory mainAdapter;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_choose);
        recyclerView = findViewById(R.id.recycler_view);

        back = findViewById(R.id.backtomenu1);
        back.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        try {

                                            Intent intent = new Intent(TheoryChoose.this,Menu.class);
                                            startActivity(intent);
                                            finish();

                                        } catch (Exception e) {

                                        }
                                    }
                                });

                String[] number_array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};
                String[] task_array = {"Определение\nглавной\nинформации\nтекста","Средства связи предложений\nв тексте","Определение лексического\nзначения\nслова","Постановка\nударения","Употребление паронимов","Лексические\nнормы","Морфологические нормы\n(образование форм слова)","Синтаксические нормы\nНормы согласования\nНормы управления","Правописание\nкорней","Правописание приставок","Правописание\nсуффиксов\n(кроме -Н-/-НН-)","Правописание личных\nокончаний глаголов\nи суффиксов причастий","Правописание\nНЕ и НИ","Слитное,дефисное,\nраздельное\nнаписание слов","Правописание\n-Н- и -НН-\nв суффиксах","Пунктуация ССП и\nв предложениях\nс однородными членами","Знаки препинания\nв предложениях\nс обособленными членами","Знаки препинания\nпри словах и конструкциях,\nне связанных с членами'предложения","Знаки препинания\nв сложноподчиненном предложении","Знаки препинания в сложных предложениях\nс разными видами связи","Постановка знаков препинания в различных случаях","Смысловая и композиционная целостность текста","Функционально-смысловые типы речи","Лексическое\nзначение слова","Средства связи\nпредложений\nв тексте","Языковые\nсредства выразительности"};
        String[] btn_array = {"Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию","Перейти к заданию"};

        mainModels = new ArrayList<>();
        for (int i=0;i<number_array.length;i++){
            ModelTheory model = new ModelTheory(number_array[i],task_array[i],btn_array[i]);
            mainModels.add(model);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                TheoryChoose.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new AdapterTheory(TheoryChoose.this,mainModels);
        recyclerView.setAdapter(mainAdapter);
    }
    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(TheoryChoose.this,Menu.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}
