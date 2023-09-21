package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task4 extends AppCompatActivity {

    TextView title,a1,a2,a3,a4,a5;
    Button btn,back;
    String person_answer;
    String index_answer,result;
    int index;

    static final String[] answer1 =
            {"откУпорил","вероисповЕдание","мозАичный","гналА","шофЁр","отключЁнный","прожИвший","зАгнутый","облилАсь","убыстрИть",
                    "прИняты","срЕдства","бухгалтерОв","катАлог","обогналА"

            };
    static final String[] answer2 =
            {"снЯта","мозАичный","грАжданство", "баловАть","Отрочество","дОверху","дОнельзя","аэропортЫ","мозАичный",
                    "свеклА","понЯвший","вероисповЕдание","положИл","красИвее","вручИт"

            };
    static final String[] answer3 =
            {"красИвее","лгалА","лЕкторов","цепОчка","шофЁр","позвАла","отключЁнный","недУг","дОверху",
                    "облегчИт","окрУжит","повторЁнный","рвалА","намерЕние","опломбИровать"

            };
    static final String[] answer4 =
            {"корЫсть","нАчатый","сОгнутый","нАчали","Оптовый","слИвовый","прибЫв","оптОвый","сОгнутый",
                    "кУхонный","крАны","обострИть","оклЕить","балУясь","дефИс"

            };
    static final String[] answer5 =
            {"хозЯева","созЫв","зАсветло","рАвны","новостЕй","ободренА","чЕлюстей","угубИть","жалюзИ",
                    "корЫсть","исчЕрпав","сирОты","принУдить","накренИт","опОшлят"

            };

    static final String[] true_answers = {"снята","мозаичный","гражданство","оптовый","равны","позвала","донельзя",
            "аэропорты","мозаичный","свекла","окружит","бухгалтеров","каталог","намерение","опломбировать"};
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
        index = random.nextInt(answer1.length);

        title.setText("В одном из приведённых ниже слов допущена ошибка в постановке ударения: НЕВЕРНО выделена буква, обозначающая ударный гласный звук. Выпишите это слово.");
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

                    Intent intent = new Intent(Task4.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task4.this, Result4.class);
                    intent.putExtra("result4", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task4.this, Result4.class);
                    intent.putExtra("result4", result);
                    startActivity(intent);
                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task4.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}