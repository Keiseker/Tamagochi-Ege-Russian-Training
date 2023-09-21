package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task11 extends AppCompatActivity {

    TextView title,a1,a2,a3,a4,a5,answer;
    Button btn,back,reset;
    String index_answer,person_answer,result1;

    static final String[] answer1 =
            {"1) проповед..вать, (на террасе) свеж..","1) фланел..вый, красн..ватый","1) отта..в, ореш..к",
                    "1) отрасл..вой, мах..нький"

            };
    static final String[] answer2 =
            {"2) напор..стый, запечатл..вать","2) овлад..вая, крупитч..тый","2) вкрадч..вый, меньш..нство",
                    "2) раскра..вай, опрометч..вый",
                            "2) раскра..вай, опрометч..вый"

            };
    static final String[] answer3 =
            {"3) француз..кий, мерз..кий","3) хитр..нький, восьм..ричный","3) запрыг..вать, движ..мый",
                    "3) оранж..вый, син..ватый"

            };
    static final String[] answer4 =
            {"4) обидч..вый, баран..на","4) затм..вающий, со..вый","4) алюмини..вый, пород..стый",
                    "4) остр..нький, крас..вый"

            };
    static final String[] answer5 =
            {"5) лед..ной, глин..стый","5) удва..вавший, податл..вый","5) задумч..вый, гир..вой (спорт)",
                    "5) ткан..вый, лист..к"

            };


    static final String[] true_answers = {"14","345","23","23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_4_9_10_12_16);

        //ищем все элементы
        title = findViewById(R.id.title_task);
        a1 = findViewById(R.id.answer1);
        a2 = findViewById(R.id.answer2);
        a3 = findViewById(R.id.answer3);
        a4 = findViewById(R.id.answer4);
        a5 = findViewById(R.id.answer5);
        btn = findViewById(R.id.confirm);
        answer = findViewById(R.id.answer);
        reset = findViewById(R.id.reset);


        //конец поиска

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        final int index = random.nextInt(answer1.length);

        a1.setText(answer1[index]);
        a2.setText(answer2[index]);
        a3.setText(answer3[index]);
        a4.setText(answer4[index]);
        a5.setText(answer5[index]);
        index_answer = (true_answers[index]);
        title.setText("Укажите варианты ответов, в которых в обоих словах одного ряда пропущена одна и та же буква.Нажмите на номера ответов.");
        answer.setText("Ответ: ");
        person_answer = "";
        answer.setText("Ответ: ");
        person_answer = "";
        //ответ 1
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("1");
                person_answer = person_answer + "1";
            }
        });

        //ответ 2
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("2");
                person_answer = person_answer + "2";
            }
        });

        //ответ 3
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("3");
                person_answer = person_answer + "3";
            }
        });

        //ответ 4
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("4");
                person_answer = person_answer + "4";
            }
        });

        //ответ 5
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("5");
                person_answer = person_answer + "5";
            }
        });
        //кнопка назад сверху
        back = findViewById(R.id.backtomenu2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task11.this,TasksChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //очистка ответов
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("Ответ: ");
                person_answer = "";
            }
        });
        //проверка ответов
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (person_answer.equalsIgnoreCase(index_answer)){
                    result1 = "true";
                    Intent intent = new Intent(Task11.this, Result11.class);
                    intent.putExtra("result11", result1);
                    startActivity(intent);
                }
                else
                {
                    result1 = "false";
                    Intent intent = new Intent(Task11.this, Result11.class);
                    intent.putExtra("result11", result1);
                    startActivity(intent);
                }
                finish();


            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task11.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}