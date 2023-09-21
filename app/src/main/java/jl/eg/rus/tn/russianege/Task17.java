package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task17 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {
                    "Издали (1) он увидел дом (2) непохожий на другие (3) построенный (4) каким-то итальянским архитектором.",
                    "Город (1) вдали сверкающий на солнце (2) синие леса (3) окаймляющие берега залива (4) казались мне особенно торжественными.",
                    "Воробей (1) неожиданно взлетев (2) исчез в светлой зелени сада (3) прозрачно сквозившей (4) на предвечернем небе.",
                    "Перелистывая страницы (1) принесённой из кабинета (2) книги (3) отец остановился у приоткрытой двери (4) прислушиваясь к разговору на кухне."
            };

    static final String[] true_answers = {"23","1234","123","34"};

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

        title.setText("Расставьте все знаки препинания:укажите цифру(-ы), на месте которой(-ых) в предложении должна(-ы) стоять запятая(-ые).");
        a1.setText(answer1[index]);
        index_answer = true_answers[index];


        //кнопка назад сверху
        back = findViewById(R.id.backtotask5_7_15_1720);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task17.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task17.this, Result17.class);
                    intent.putExtra("result17", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task17.this, Result17.class);
                    intent.putExtra("result17", result);
                    startActivity(intent);
                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task17.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}