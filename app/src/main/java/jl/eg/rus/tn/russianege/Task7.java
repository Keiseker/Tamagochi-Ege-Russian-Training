package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task7 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer,task;
    String index_answer;

    static final String[] answer1 =
            {
                    "домашняя ТУФЛЯ\nпо ПРИЕЗДЕ в город\nПОКЛАДИ на стол\nШЕСТЬЮДЕСЯТЬЮ годами\nбез ПОГОН",
                    "пара ТУФЕЛЬ\nу ОБЕИХ сестёр\nЛЯГТЕ на коврик\nЛОПНУТЫЕ пружины\nШЕСТЬЮСТАМИ листами",
                    "здоровые ДЁСНЫ\nрастёт в ГРУНТЕ\nЛЯЖЬТЕ\nболее ШИРОКО\nПОЧЕРК",
                    "с ТРЕМЯСТАМИ новобранцами\nжареные ТЕТЕРЕВА\nпара ДЖИНС\nЛЯГТЕ на кушетку\nбез ПОГОН"
            };

    static final String[] true_answers = {"положи","лопнувшие","лягте","джинсов"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_67_15_17_1920);

        //ищем все элементы
        title = findViewById(R.id.task_title);
        a1 = findViewById(R.id.answer1);
        btn = findViewById(R.id.confirm);
        //конец поиска

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        int index = random.nextInt(answer1.length);

        title.setText("В одном из выделенных ниже слов допущена ошибка в образовании формы слова. Исправьте ошибку и запишите слово правильно.");
        a1.setText(answer1[index]);
        index_answer = true_answers[index];


        //кнопка назад сверху
        back = findViewById(R.id.backtotask5_7_15_1720);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task7.this,TasksChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //сравнение ответов
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText answer = findViewById(R.id.answer_area);
                person_answer = answer.getText().toString();
                if (person_answer.equalsIgnoreCase(index_answer)){
                    result = "true";
                    Intent intent = new Intent(Task7.this, Result7.class);
                    intent.putExtra("result7", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task7.this, Result7.class);
                    intent.putExtra("result7", result);
                    startActivity(intent);
                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task7.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}