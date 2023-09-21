package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task10 extends AppCompatActivity {

    TextView title,answer,a1,a2,a3,a4,a5;
    Button btn,back,reset;
    String index_answer,person_answer,result1;

    static final String[] answer1 =
            {"1) пр..добрый, гостепр..имный, правопр..емник","1) пр..общиться, пр..школьный, пр..встать"


            };
    static final String[] answer2 =
            {"2) н..дломить, поз..бросил, з..ночевать","2) вз..браться, п..забавить, р..ссказ;",



            };
    static final String[] answer3 =
            {"3) бе..срочный, и..черченный, ра..пущенный","3) ни..вергать, и..черпать, в..дрогнуть",
                    "","","","","","","","","","","","","",""


            };
    static final String[] answer4 =
            {"4) зав..южило, фамил..ярный, гнездов..е","4) об..явить, с..ёмка, суб..ект;",
                    "","","","","","","","","","","","","",""


            };
    static final String[] answer5 =
            {"5) вз..скание, без..нтересный, меж..нститутский","5) от..всюду, нар..спашку,п..дсветка.",
                    "","","","","","","","","","","","","",""


            };

    static final String[] true_answers = {
            "234","14","34","35","","","","","","","","","","","","","",""
    };

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
        title.setText("Укажите варианты ответов, в которых во всех словах одного ряда пропущена одна и та же буква. Нажмите на номера ответов");
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

                    Intent intent = new Intent(Task10.this,TasksChoose.class);
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
                    Intent intent= new Intent(Task10.this, Result10.class);
                    intent.putExtra("result10", result1);
                    startActivity(intent);
                }
                else
                {
                    result1 = "false";
                    Intent intent = new Intent(Task10.this, Result10.class);
                    intent.putExtra("result10", result1);
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

            Intent intent = new Intent(Task10.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}