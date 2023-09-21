package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task19 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {
                    "Одинокий путник (1) приближение (2) которого (3) я слышал ранее среди чуткого безмолвия морозной ночи (4) соблазнился моим веселым огнем.",
                    "Утром горы (1) лежали в тумане (2) сквозь (3) который (4) едва виднелись их очертания.",
                    "Большие (1) светлые здания (2) окна которых (3) отражали первые солнечные лучи (4) бежали по обе стороны дороги.",
                    "Сочетание лексического и грамматического значений (1) может образовывать сложные смысловые образы (2) анализ которых (3) позволяет глубже проникнуть в содержание стихотворения."
            };

    static final String[] true_answers = {"14","2","24","2"};

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

                    Intent intent = new Intent(Task19.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task19.this, Result19.class);
                    intent.putExtra("result19", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task19.this, Result19.class);
                    intent.putExtra("result19", result);
                    startActivity(intent);
                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task19.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}