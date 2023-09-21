package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task14 extends AppCompatActivity {

    TextView title,a1,a2,a3,a4,a5;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {"Исходя из предопределённости, можно (НА)ПЕРЁД оправдать любой поступок человека, СКОЛЬ(БЫ) отталкивающим или преступным он нам ни казался.",
                    "Но мне ТО(ЖЕ) кажется, что Лежнёв не стал бы говорить (ПО)ПУСТУ, не взвесив то, что говорит.",
                    "Кто-то из туристов забыл на базе рюкзак с консервами, и (ПО) ЭТОМУ провизии оставалось (В) ОБРЕЗ.",
                    "(И)ТАК, вам угодно спорить, я это понял в ТО(ЖЕ) самое мгновение, как только вы вошли."

            };
    static final String[] answer2 =
            {"Поэт тоскует по гармонии, ТАК(КАК) она недоступна для него, и именно (ПО)ТОМУ, что в его душе гордыня борется с желанием примирения.",
                    "Очередную партию дед с внуком сыграли (В)НИЧЬЮ, внук просил сыграть ещё, но дедушка молча встал с кресла и отправился во двор, так что уговаривать его теперь было уже (БЕЗ)ТОЛКУ.",
                    "Со стороны трудно было понять, (ПО) ЧЕМУ от лёгкого удара огромный камень раскололся (НА) ДВОЕ.","ЧТО(БЫ) не пропустить самое интересное, Сергей ТОТ(ЧАС) побежал к реке."

            };
    static final String[] answer3 =
            {"И КАК(БЫ) ни маскировалось зло, добрый, чистый душой человек способен его почувствовать, распознать, а ТАК(ЖЕ) пресечь.",
                    "Андрей, (ПО)МИМО французского, английского, немецкого, итальянского языков, хорошо знал китайский, который он изучал (НА)ПРОТЯЖЕНИИ четырёх лет.",
                    "(В) ЦЕЛЯХ безопасности каждого члена делегации провели через рамку сканера, багаж был выставлен на транспортёр и ТО (ЖЕ) досмотрен.",
                    "ЧТО(БЫ) ни происходило вокруг, ТАК(ЖЕ), как и много веков назад, шепчет берёза о быстротечности жизни, о чём-то очень важном."

            };
    static final String[] answer4 =
            {"(В)ТЕЧЕНИЕ двадцати лет изъездил я Россию по всем направлениям, но ВСЁ(ЖЕ) лучшего места, чем отчий край, не нашёл.",
                    "ЧТО(БЫ) ни говорили Никите завистливые люди, ОН(ТАКИ) сумел добиться своего.",
                    "ЧТО (БЫ) не заблудиться, (НА) ПРОТЯЖЕНИИ всего маршрута были установлены стрелки и указатели.",
                    "Я ТО(ЖЕ) был взволнован и ТАК(ЖЕ), как все собравшиеся здесь, ловил каждое слово диктора."

            };
    static final String[] answer5 =
            {"И (ТОТ) ЧАС же хлынул дождь, да такой проливной, какой (ЗА)ЧАСТУЮ бывает только в тропических лесах.",
                    "Дамир рос любознательным ребёнком, (ПО)ЭТОМУ, приходя к кому-либо в гости, (С)ХОДУ засыпал хозяев вопросами.",
                    "Пришлось отказаться (ОТ)ТОГО, что было задумано, (ПО)СКОЛЬКУ планы изменились.",
                    "(ПО)НАЧАЛУ его деятельности в нашем институте трудно было судить о том, что он предпримет (В)ПОСЛЕДСТВИИ."


            };


    static final String[] true_answers = {"тотчасзачастую","тожепопусту","почемунадвое","чтобытотчас"};

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

        title.setText("Определите предложение, в котором оба выделенных слова пишутся СЛИТНО. Раскройте скобки и выпишите эти два слова без пробелов и запятых.");
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

                    Intent intent = new Intent(Task14.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task14.this, Result14.class);
                    intent.putExtra("result14", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task14.this, Result14.class);
                    intent.putExtra("result14", result);
                    startActivity(intent);
                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task14.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}