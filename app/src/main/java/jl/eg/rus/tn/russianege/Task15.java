package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task15 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {
                    "Путники, задумчивые и восторже(1)ые одновреме(2)о, очутились как бы в ватном облаке, солнце превратилось в маленький оловя(3)ый круг, по которому плыли белесые клочья, пока соверше(4)о не закрыли его.",
                    "Над детской кроваткой висел тка(1)ый коврик, на котором огне(2)ая лиса волочила в зубах растрепа(3)ого белого петуха, уносила его куда-то за синие леса, за высокие горы",
                    "Вдоль стен, вымаза(1)ых синей извёсткой, стояли скамейки, в передней комнате несколько стульев и стол для музыкантов, в задней — десяток столов, составле(2)ых в дли(3)ый ряд для ужина, — вот вся обстановка.",
                    "Шум прибоя растёт, осе(1)ий ледя(2)ой ветер вздымает и беше(3)о срывает волны, разнося по воздуху брызги и резкий запах моря."
            };

    static final String[] true_answers = {"1234","23","123","23"};

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

        title.setText("Укажите все цифры, на месте которых пишется НН.Цифры укажите в порядке возрастания.");
        a1.setText(answer1[index]);
        index_answer = true_answers[index];


        //кнопка назад сверху
        back = findViewById(R.id.backtotask5_7_15_1720);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task15.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task15.this, Result15.class);
                    intent.putExtra("result15", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task15.this, Result15.class);
                    intent.putExtra("result15", result);
                    startActivity(intent);
                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task15.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}