package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task18 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {
                    "Во времена Шекспира (1) как известно(2) в театре женские роли исполнялись мужчинами.\nВ последние дни(3) однако(4) солнце пригревало сильнее и деревья, приукрасившиеся зеленой дымкой, уже приоткрыли почки и выбросили пушистые сережки или прелестные свежие листочки.",
                    "— Скажи-ка(1) дядя(2) ведь не даром(3)\nМосква, спаленная пожаром,\nФранцузу отдана?\nВедь(4) были ж схватки боевые,\nДа(5)говорят(6) еще какие!\n Недаром (7) помнит вся Россия\nПро день Бородина!"
            };

    static final String[] true_answers = {"1234","1256"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_18);

        //ищем все элементы
        title = findViewById(R.id.task_title);
        a1 = findViewById(R.id.answer1);
        btn = findViewById(R.id.confirm);
        //конец поиска

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        int index = random.nextInt(answer1.length);

        title.setText("Расставьте все недостающие знаки препинания:укажите цифру(-ы), на месте которой(-ых) в предложении должна(-ы) стоять запятая(-ые).");
        a1.setText(answer1[index]);
        index_answer = true_answers[index];


        //кнопка назад сверху
        back = findViewById(R.id.bactotask18);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task18.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task18.this, Result18.class);
                    intent.putExtra("result18", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task18.this, Result18.class);
                    intent.putExtra("result18", result);
                    startActivity(intent);
                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task18.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}