package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task16 extends AppCompatActivity {

    TextView title,answer,a1,a2,a3,a4,a5;
    Button btn,back,reset;
    String index_answer,person_answer,result1;

    static final String[] answer1 =
            {"1) Поезд с трудом прорывался через сырые потоки и безнадёжно опаздывал.","1) Перед обедом из окон высовывались мамы и бабушки и звали детей домой.",
                    "1) К вечеру руки ноги плечи ныли и тосковали по отдыху.","1) Из-за протечек в крыше во всех трёх спальнях на верхнем этаже стояла сырость и пахло плесенью."
            };
    static final String[] answer2 =
            {"2) А над лугами шёл холодный дождь и ветер налетал косыми ударами.","2) На другой день бабушка проснулась ни свет ни заря.",
                    "2) Там были нарциссы и тюльпаны анютины глазки и незабудки георгины и астры.",
                    "2) Цветы росли возле самого снега и даже сквозь снег пробивались нежные зелёные ростки."

            };
    static final String[] answer3 =
            {"3) Переправляемся на пароме через Оку и за широкой полосой приокских лугов нас встречают Мещёрские леса.",
                    "3) На столе всегда можно было увидеть исписанные листы или открытую тетрадь или папку с рукописью.",
                    "3) Нам обещали увлекательное путешествие по заповедному Красному берегу цветущим степям и предгорьям Крыма.",
                    "3) Сосед мой явно не был расположен к общению и разговорам предпочёл сосредоточенное чтение газеты."

            };
    static final String[] answer4 =
            {"4) Станции завалены смолистыми брёвнами и пахнут свежей порубкой и дикими лесными цветами.",
                    "4) Шофёр или не расслышал моих слов или не обратил на них внимания.","4) Гончаров стремится изобразить национальную сущность русского человека и его природные свойства.",
                    "4) Станислав не расслышал вопроса или не захотел на него отвечать."

            };
    static final String[] answer5 =
            {"5) Я вырывал в сене глубокую нору залезал в неё и всю ночь спал в стогу.","5) В минуты меланхолии грозный генерал становился беспомощнее ребёнка и многие спешили выместить на нём свои обиды.",
                    "5) На Байкале уникален как животный так и растительный мир.","5) Танюше стало холодно и она проснулась."

            };


    static final String[] true_answers = {"35","45","35","25"};

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
        title.setText("Расставьте знаки препинания. Нажмите на номера предложений, в которых нужно поставить ОДНУ запятую.");
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

                    Intent intent = new Intent(Task16.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task16.this, Result16.class);
                    intent.putExtra("result16", result1);
                    startActivity(intent);
                }
                else
                {
                    result1 = "false";
                    Intent intent = new Intent(Task16.this, Result16.class);
                    intent.putExtra("result16", result1);
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

            Intent intent = new Intent(Task16.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}