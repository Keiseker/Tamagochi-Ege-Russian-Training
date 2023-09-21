package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task5 extends AppCompatActivity {

    TextView title,a1,a2,a3,a4,a5;
    Button btn,back;
    String result,person_answer,task;
    String index_answer;

    static final String[] answer1 =
            {
                    "Колледж стал ДИПЛОМАТОМ IV Всероссийского конкурса воспитательных и образовательных учреждений.",
                    "Анализ таких важных исторических событий должен быть всенепременно ФАКТИЧНЫМ и должен строиться только на фактах."
            };
    static final String[] answer2 =
            {
                    "По-юношески беспечные и ИРОНИЧНЫЕ, мы относились к этому несерьёзно, шутили, воспринимали всё как игру.",
                    "Обращение получило практически мгновенный ОТКЛИК: десятки людей готовы были приютить «потеряшку»."
            };
    static final String[] answer3 =
            {
                    "При ВЫРАЩИВАНИИ таких растений на дно горшка обычно кладут большой слой керамзита.",
                    "ПУБЛИЦИСТИЧЕСКИЙ стиль— разновидность литературного языка: один книжных стилей речи, использующийся в сфере политики, общественной, экономической и культурной жизни общества, в средствах массовой информации."
            };
    static final String[] answer4 =
            {
                    "ДИКТАТ традиций оказался очень силён.",
                    " Уголовным кодексом предусмотрена статья за ОТКЛОНЕНИЕ от уплаты налогов."
            };
    static final String[] answer5 =
            {
                    "При синдроме хронической усталости вспышки РАЗДРАЖИТЕЛЬНОСТИ связаны с болезненным переживанием своего состояния.",
                    "ГАРМОНИЧНОЕ развитие личности — ведущая цель системы отечественного образования и воспитания, направляющая ее на создание условий для всестороннего целостного непротиворечивого развития личности учащегося."
            };

    static final String[] true_answers = {"дипломантом","уклонение"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_5_13_14_18);

        //ищем все элементы
        title = findViewById(R.id.task_title);
        a1 = findViewById(R.id.answer1);
        a2 = findViewById(R.id.answer2);
        a3 = findViewById(R.id.answer3);
        a4 = findViewById(R.id.answer4);
        a5 = findViewById(R.id.answer5);
        btn = findViewById(R.id.confirm);

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        int index = random.nextInt(answer1.length);
        title.setText("В одном из приведённых ниже предложений НЕВЕРНО употреблено выделенное слово. Исправьте лексическую ошибку, подобрав к выделенному слову пароним. Запишите подобранное слово.");
        a1.setText(answer1[index]);
        a2.setText(answer2[index]);
        a3.setText(answer3[index]);
        a4.setText(answer4[index]);
        a5.setText(answer5[index]);
        index_answer = true_answers[index];

        //кнопка назад сверху
        back = findViewById(R.id.backtotask5_13_14_18);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task5.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task5.this, Result5.class);
                    intent.putExtra("result5", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task5.this, Result5.class);
                    intent.putExtra("result5", result);
                    startActivity(intent);
                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task5.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}