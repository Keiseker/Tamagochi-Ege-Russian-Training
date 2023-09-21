package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task21 extends AppCompatActivity {

    TextView title,a1;
    Button btn,back;
    String result,person_answer;
    String index_answer;

    static final String[] answer1 =
            {
                    "\t(1)Городская усадьба Шаховских — Краузе — Осиповых находится на улице Воздвиженка, этот дом сохранился здесь с конца XVIII века. (2)В 1783 году двухэтажный дом с антресольным этажом, с флигелями и парадными воротами с Калашного переулка построил князь Алексей Яковлевич Шаховской. (3)Он был младшим сыном князя Якова Петровича Шаховского, обер-прокурора Святейшего Синода и автора известных автобиографических «Записок». (4)С 1842 года владение перешло в руки известного врача И.И. Краузе. (5)В 1852 году, когда усадьба принадлежала штабс-ротмистру Николаю Яковлевичу Козлакову, архитектор Н.И. Козловский перестроил дом. (6)Изменения в основном касались декора фасада и внутренних помещений, в результате чего усадьба получила очень эффектный фасад в стилистике рококо. (7)В 1868 году усадьбу купил врач Дмитрий Тимофеевич Осиповский, который много лет проработал в Московской городской больнице, в больнице для чернорабочих на Мясницкой и в Мариинской больнице. (8)14 июня 1878 года действительному статскому советнику Дмитрию Тимофеевичу Осиповскому с потомством было высочайше пожаловано дворянство, и с этого времени во фронтоне дома расположился герб Осиповских.",
            };

    static final String[] true_answers = {"567||27"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_21);
        //ищем все элементы
        title = findViewById(R.id.task_title);
        a1 = findViewById(R.id.answer1);
        btn = findViewById(R.id.confirm);
        //конец поиска

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        int index = random.nextInt(answer1.length);

        title.setText("Отредактируйте предложение: исправьте лексическую ошибку, исключив лишнее слово. Выпишите это слово.");
        a1.setText(answer1[index]);
        index_answer = true_answers[index];


        //кнопка назад сверху
        back = findViewById(R.id.backtotask21);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task21.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task21.this, Result21.class);
                    intent.putExtra("result21", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task21.this, Result21.class);
                    intent.putExtra("result21", result);
                    startActivity(intent);
                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task21.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}