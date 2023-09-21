package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task13 extends AppCompatActivity {

    TextView title,a1,a2,a3,a4,a5;
    Button btn,back;
    String result,person_answer;
    String index_answer;


    static final String[] answer1 =
            {"Компьютер (не)подключён к сети.","Мы жили бедно, постоянно (НЕ)ДОЕДАЛИ, меняли на продукты те вещи, которые привезли с собой.",
                    "Этот населённый пункт (не)обозначен ни на одной карте.","Группе учёных предстояло отправиться на ещё (НЕ)ИССЛЕДОВАННЫЙ участок острова."

            };
    static final String[] answer2 =
            {"Гибнущий сад и (не)состоявшаяся любовь — две внутренне связанные темы пьесы.","Натренированный взгляд мой определил, что местность (НЕ)ОБЖИТА, но я всё же решил поискать хоть какие-то признаки человеческого присутствия.",
                    "Но искали они эту правду совсем (не)там, где их идейные противники.","После всего, что Никита услышал в тот вечер, он понял, что его положение отнюдь (НЕ)ВЫГОДНО"

            };
    static final String[] answer3 =
            {"Еще (не)распустившийся цветок особенно красив.","Ещё далеко (НЕ)ЯСНО, ко всем ли и в одинаковой ли мере применим такой критерий оценивания.",
                    "Софья Николаевна (не)очень постарела за это время.","Старый дом, украшенный деревянной резьбой, стоял на (НЕ)ВЫСОКОМ, но почему-то выделявшемся на фоне остальных пригорков холме."

            };
    static final String[] answer4 =
            {"Помещение (не)рассчитано на такое количество людей.","Зоопарк принимает (НЕ)РАСПРОДАННЫЕ на Новый год фрукты, которыми будут лакомиться слоны, кенгуру, медведи и парнокопытные.",
                    "(Не)легко было читателю в то время разбираться в противоречивых оценках.","Некоторые фрагменты рукописи до сих пор (НЕ)НАЙДЕНЫ."

            };
    static final String[] answer5 =
            {"(Не)спрашивая ни о чем, он все понял.","Она – потрясающая русская актриса, он – никому (НЕ)ИЗВЕСТНЫЙ гениальный педагог, и оба – истинные служители театра.",
                    "Куплена (не)дорогая, а дешёвая мебель.","НЕ)РЕШАЯСЬ подойти к отцу, Дениска стоял и переминался с ноги на ногу."

            };


    static final String[] true_answers = {"несостоявшаяся"," недоедали","нелегко","невысоком"};

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
        //конец поиска

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        int index = random.nextInt(answer1.length);

        title.setText("Определите предложение, в котором НЕ со словом пишется СЛИТНО. Раскройте скобки и выпишите это слово.");
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

                    Intent intent = new Intent(Task13.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task13.this, Result13.class);
                    intent.putExtra("result13", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task13.this, Result13.class);
                    intent.putExtra("result13", result);
                    startActivity(intent);
                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task13.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}