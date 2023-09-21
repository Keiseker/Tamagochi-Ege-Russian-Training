package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task20 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {
                    "Утверждают (1) что бразильские карнавалы восхищают и завораживают (2) и (3) когда мы впервые увидели его неповторимую яркую красоту ( 4) то сами убедились (5) насколько правы были очевидцы.",
                    "Рядом с тобой всегда люди (1) и (2) даже если тебе очень одиноко (3) ты не сомневайся в том (4) что кто-то сможет выслушать и понять тебя.",
                    "Нужно чаще думать о других (1) и (2) даже если тебе сейчас нелегко (3) ты не забывай о том (4) что кому-то может потребоваться твоё участие.",
                    "Было впечатление (1) что мы волшебным образом побывали в чудесной стране (2) где алые лилии и красная рябина (3) где всё яснее и красивее (4) чем всегда было вокруг."
            };

    static final String[] true_answers = {"1245","1234","1234","1234"};

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

        title.setText("Расставьте все знаки препинания: укажите цифру(-ы), на месте которой(-ых) в предложении должна(-ы) стоять запятая(-ые).");
        a1.setText(answer1[index]);
        index_answer = true_answers[index];


        //кнопка назад сверху
        back = findViewById(R.id.backtotask5_7_15_1720);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task20.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task20.this, Result20.class);
                    intent.putExtra("result20", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task20.this, Result20.class);
                    intent.putExtra("result20", result);
                    startActivity(intent);
                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task20.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}