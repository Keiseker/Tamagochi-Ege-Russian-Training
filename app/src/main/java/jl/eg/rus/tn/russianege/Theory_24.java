package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_24 extends AppCompatActivity {
    Button back, previous,next,task;
    TextView before,title,expln,title1,expln1,title2,expln2,links,main;
    String word1;
    ImageView image;

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
        //image
        image = findViewById(R.id.table);

        //важные слова
        word1 = getString(R.string.Main1);
        String example1 = "\tЗапятая ставится:\n1)главное слово существительно или личное местоимение стоит перед причастным оборотом.\nПример:\n\tЯстреб устремили глаза в траву,|пожелтевшую от солнце|.\n\t2)причастный оборот стоит до главного слова, которое является личным местоимением.\nПример:\n\t|Пораженной этой мыслью|, он сидел на крыльце.\n\t3) причастный оборот,который имеет обстоятельственное значение, перед главным словом - существетельным.\nПример:\n\t|Уставшие от перехода|,альпинисты остановились на ночлег.\nОт глагола можно поставить вопрос к причастному обороту: остановились (почему?) потому что устали от перехода.";
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории
        main.setText("Задание 24");
        expln.setText("1)Синонимы — слова одной части речи с полным или частичным совпадением значения\n2) Фразеологизм (идиома) — свойственное определённому языку устойчивое словосочетание, смысл которого не определяется значением отдельно взятых слов, входящих в его состав.\n3)Анто́нимы — это слова одной части речи, различные по звучанию и написанию, имеющие прямо противоположные лексические значения");
        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\n https://www.youtube.com/watch?v=UdiTrbmb93E\n https://www.youtube.com/watch?v=fGkeo8OEf8Y");

        //Кнопка приступить к заданию
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_24.this, Task24.class);
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

                    Intent intent = new Intent(Theory_24.this, Theory_25.class);
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

                    Intent intent = new Intent(Theory_24.this, Theory_23.class);
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

                    Intent intent = new Intent(Theory_24.this, TheoryChoose.class);
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

            Intent intent = new Intent(Theory_24.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}