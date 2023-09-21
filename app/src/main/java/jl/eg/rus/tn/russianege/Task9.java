package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task9 extends AppCompatActivity {

    TextView title,answer,a1,a2,a3,a4,a5;
    Button btn,back,reset;
    String index_answer,person_answer,result1;

    static final String[] answer1 =
            {"1) дивизия, солдат, отпереть","1) вычисление, разочарованный, ягодный",
                    "1) увековечить, исполнитель, прославлять","1) раскраснеться, подсмотреть, ходовой",
                    "1) привидение(в доме),воображение,зар..жать","1) сокращение(текста),препроводить,загореый",
                    "1) выстиранное(бельё),равнины,заклинания", "1) композиция,мавзолей,поджимает",
                    "1) сгорать,блистательно,закоренелый","1) гречишный,одичавший,поласкать(ребёнка)"

            };
    static final String[] answer2 =
            {"2) касание, передвижение, степная","2) вермишель, желание, макать (в воду)",
                    "2) возрастной, невразумительно, творец","2) претензия, макулатура, приложение",
                    "2) дефективный,покаяние,сопровождение","2) гамоничный,застраховаться,конференция",
                    "2)горделивый,жестикулировать,разгадать","2)медальон,беспрецедентный,предпринимательство",
                    "2) поджимает,припоминает,депутат","2) залепить(дыру),растрепать(волосы),обновлённый",
                    "","","","","",""

            };
    static final String[] answer3 =
            {"3) натереть, росток, подрастает","3) замереть, обмакнуть, приложение",
                    "3) оснащение, озаряться, располагающийся","3) предлагать, зарница, обмакните (перо)",
                    "3) успокоение,развиваются(дети),уклоняться","3) отраслевой,зарница,скакун",
                    "3) воссоединение,неоспоримый,восстановитель", "3) морфология,бетон,металл",
                    "3) выдирают(корни),заложил(кирпичом),выровнять(грядку)","3) пренебрежительный,лекарство,вереница","","","","","",""

            };
    static final String[] answer4 =
            {"4) обещавший, голова, поклониться","4) положение, пловец, вытворять",
                    "4) формализм, убедить, подражание","4) примирение, замечать (детали), поласкать (собаку)",
                    "4) замечать(детали),уплотнить,избиратели","4) поклонение,вычеты,обмирать","4) аттестат,колонна,заниматься",
                    "4) бумеранг,бадминтон,шеренга","4) поплавок,зарастают,обжигающий(ветер)",
                    "4) деpентерия","","","","","",""

            };
    static final String[] answer5 =
            {"5) растение, прилагательное, скакать","5) опираясь, изменение, растирать",
                    "5) преподаватель, разгадать, примерять (вещи)","5) убедительно, фиолетовый, наваждение",
                    "5) обвинять,прославлять,неприкасаемый","5)налагаются(обязательства),вымирающие(животные),выскочили",
                    "5) завоевание,отгородиться,запоздалый","5)располагайтесь,эпиграмма,разминаем","","","","","","","",""

            };

    static final String[] true_answers = {"35","34","15","14","","","","","","","","","","","",""};

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
        title.setText("Укажите номера предложений, в которых верно передана ГЛАВНАЯ информация, содержащаяся в тексте. Запишите номера этих предложений.");
        answer.setText("Ответ: ");
        person_answer = "";
        answer.setText("Ответ: ");
        person_answer = "";

       if (index == 1||index == 2||index == 6||index == 9||index == 13||index == 16){
            title.setText("Укажите варианты ответов, в которых во всех словах одного ряда пропущена безударная чередующаяся гласная корня. Запишите номера ответов.");
        }
        if (index ==3|| index == 4||index == 5||index == 7||index == 10||index == 11||index == 12||index == 14||index == 15){
            title.setText("Укажите варианты ответов, в которых во всех словах одного ряда содержится безударная проверяемая гласная корня. Запишите номера ответов.");
        }
        if (index == 8){
            title.setText("Укажите варианты ответов, в которых во всех словах одного ряда содержится непроверяемая гласная корня. Запишите номера ответов.");
        }
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

                    Intent intent = new Intent(Task9.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task9.this, Result9.class);
                    intent.putExtra("result9", result1);
                    startActivity(intent);
                }
                else
                {
                    result1 = "false";
                    Intent intent = new Intent(Task9.this, Result9.class);
                    intent.putExtra("result9", result1);
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

            Intent intent = new Intent(Task9.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}