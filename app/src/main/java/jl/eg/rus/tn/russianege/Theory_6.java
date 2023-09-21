package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_6 extends AppCompatActivity {

    Button back, previous,next,task;
    TextView before,title,expln,title1,expln1,title2,expln2,links,main;
    String word1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        //инициализация
        //кнопки
        back = findViewById(R.id.back_theory);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        task = findViewById(R.id.go_to_task);
        //текст вью
        before = findViewById(R.id.before);
        title = findViewById(R.id.title_rule);
        expln = findViewById(R.id.explanation);
        title1 = findViewById(R.id.title_rule1);
        expln1 = findViewById(R.id.explanation1);
        title2 = findViewById(R.id.title_rule2);
        expln2 = findViewById(R.id.explanation2);
        links = findViewById(R.id.links);
        main = findViewById(R.id.main_title);
        //важные слова
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории
        ImageView image = findViewById(R.id.table);
        image.setVisibility(View.GONE);
        title1.setVisibility(View.GONE);
        title2.setVisibility(View.GONE);
        expln1.setVisibility(View.GONE);
        expln2.setVisibility(View.GONE);
        main.setText("Задание 6");
        before.setText("\t\t6 задание требует хороший словарный запас.");
        title.setText("Алгоритм выполнения задания");
        expln.setText("1.Внимательно читаем условие задания( исключить или заменить.\n2.Если в условии изменить, то внимательно прочитай предложение, найди в нем словосочетания в котором допущена речевая избыточность(лишние слова).\n\tПример:Мы поднялись по леснице вверх.\nСлово вверх лишнее т.к. лексическое значение слова подниматься уже означает подниматься наверх.\n\t3.Вспомни лексическое значение слов, которые входят в  это словочетание.\n\t4.Убери лишнее слово и проверь изменится ли смысл.\n2.Если условие связано с заменой. то необходимо выявить речевую ошибку и заменить это слово правильным.");
        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\n https://www.youtube.com/watch?v=jFazn2CYb08\n https://www.youtube.com/watch?v=EeXf86rAi_g");
        //Кнопка к заданиям
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_6.this, Task6.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Кнопка вперед
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_6.this, Theory_7.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Кнопка на прошлую теорию
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_6.this, Theory_5.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Кнопка назад
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_6.this, TheoryChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }

            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Theory_6.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
