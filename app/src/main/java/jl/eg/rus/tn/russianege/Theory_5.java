package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_5 extends AppCompatActivity {

    Button back, previous,next,task;
    TextView before,title,expln,title1,expln1,title2,expln2,links,main;
    String word1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        //инициализация
        //кнопки
        back = findViewById(R.id.back_theory);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        task = findViewById(R.id.go_to_task);
        //текст вью
        before = findViewById(R.id.before);
        title = findViewById(R.id.title_rule);
        expln = findViewById(R.id.explanation);
        title1 = findViewById(R.id.title_rule1);
        expln1 = findViewById(R.id.explanation1);
        title2 = findViewById(R.id.title_rule2);
        expln2 = findViewById(R.id.explanation2);
        links = findViewById(R.id.links);
        main = findViewById(R.id.main_title);
        //важные слова
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории
        ImageView image = findViewById(R.id.table);
        image.setVisibility(View.GONE);
        title2.setVisibility(View.GONE);
        expln2.setVisibility(View.GONE);
        main.setText("Задание 5");
        before.setText("\t\t5 задание требует знание паронимов.");
        title.setText("Паронимы");
        expln.setText("Паронимы — это слова, сходные по звучанию и составу, но различающиеся по значению. Например одевать - надевать. Чтобы решить это задание вам необходимо заглянуть в словарик ФИПИ, потому что это задание будет как раз проверяться по этим словам.");
        title1.setText("Алгоритм решения");
        expln1.setText("1.Прочитать предложение и проанализовать правильно ли слово использовать\n2.Дойдя до неправильного слова и подобрать к нему пароним.\n!!!Обязательно проверить все задания!!!");
        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\n https://www.youtube.com/watch?v=6rzfJ_WLLhA\n https://www.youtube.com/watch?v=7Vp5vGuEXpE");
        //Кнопка к заданиям
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_5.this, Task5.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Кнопка вперед
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_5.this, Theory_6.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Кнопка на прошлую теорию
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_5.this, Theory_4.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Кнопка назад
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_5.this, TheoryChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }

            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Theory_5.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
