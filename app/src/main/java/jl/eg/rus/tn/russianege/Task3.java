package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class Task3 extends AppCompatActivity {
    TextView title,show,hide,text,answer,name,a1,a2,a3,a4,a5;
    Button btn,back,reset;
    String index_answer,person_answer,result2,task;

    static final String[] answer1 =
            {
                    "1) Величина, являющаяся мерой механического взаимодействия тел,вызывающего их ускорение или деформация;характеристика интенсивности физических процессов(спец.)Единица.Центробежная с. С. тяжести. С. тока. С.света."


            };

    static final String[] answer2 =
            {
                    "2) Способность живых существ,напряжением мышц производить физические действия,движения;физическая или моральная возможность активно действовать.Большая с.в руках. Толкнуть с с. Нет больше с. Лишиться с."


            };

    static final String[] answer3 =
            {
                    "3)Материальное или духовное начало как источник энергии,деятельности. С.природы. Творческие с. народа."
            };

    static final String[] answer4 =
            {
                    "4) Способность проявления какой-н. деятельности,состояния,\nотличающиеся определённой степенью\nнапряжённости,устремлённости.\nС.воли.С.воображения."

            };

    static final String[] answer5 =
            {
                    "5) Могущество,влияние,власть.\nМогучая с.слова. С. убеждения.\nНепобедимая с. народа"

            };

    static final String[] text_task =
            {
                    "(1)Причина возникновения мерных, однообразных волн - трение между ветром и водой.(2)Под напором ветра отдельные молекулы воды перескакивают через линию, именуемую уровнем моря, появляются так называемые барашки, а затем они под действием силы тяжести опадают.(3)Как только ветер стихнет совсем, эти барашки исчезнут, ведь сила, удерживающая (...) , слабее поврхностного натяжения моря.",

            };

    static final String[] true_answers = {"1"};
    static final String[] task_name = {"СИЛА,-ы,ж."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_3);

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
        show = findViewById(R.id.show_text);
        hide = findViewById(R.id.hide_text);
        text = findViewById(R.id.text_text);
        name = findViewById(R.id.task_name);

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        final int index = random.nextInt(text_task.length);
        a1.setText(answer1[index]);
        a2.setText(answer2[index]);
        a3.setText(answer3[index]);
        a4.setText(answer4[index]);
        a5.setText(answer5[index]);
        name.setText(task_name[index]);
        index_answer = (true_answers[index]);
        //вставка текста задания
        if (index == 1){
            title.setText("Прочитайте фрагмент словарной статьи.Определите значение, в котором это слово употреблено в первом (1) предложении текста. Выпишите цифру, соответствующую этому значению в данном фрагменте.");
        }
        if(index == 2){
            title.setText("Прочитайте фрагмент словарной статьи.Определите значение, в котором это слово употреблено во втором (2) предложении текста. Выпишите цифру, соответствующую этому значению в данном фрагменте.");
        }

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

        //появление текста
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setVisibility(View.GONE);
                text.setVisibility(View.VISIBLE);
                text.setText(text_task[index]);
                hide.setVisibility(View.VISIBLE);
                hide.setText("Скрыть текст");
            }
        });
        //исчезание текста
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setVisibility(View.VISIBLE);
                show.setText("Показать текст");
                text.setVisibility(View.GONE);
                text.setText(null);
                hide.setVisibility(View.GONE);
            }
        });

        //кнопка назад сверху
        back = findViewById(R.id.backtotask3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task3.this,TasksChoose.class);
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
                    result2 = "Ты молодец!Всё правильно!";
                    Intent intent = new Intent(Task3.this, Result3.class);
                    intent.putExtra("result3", result2);
                    startActivity(intent);
                }
                else
                {
                    result2 = "Повтори тему получше!(";
                    Intent intent = new Intent(Task3.this, Result3.class);
                    intent.putExtra("result3", result2);
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

            Intent intent = new Intent(Task3.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}