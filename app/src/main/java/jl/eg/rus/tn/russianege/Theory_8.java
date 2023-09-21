package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_8 extends AppCompatActivity {

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
        ImageView image = findViewById(R.id.table);
        image.setVisibility(View.GONE);
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

        main.setText("Задание 8");
        before.setText("\t\t7 задание требует знания грамматических ошибок.");
        title.setText("Грамматические ошибки");
        expln.setText("I Несогласованное приложение.\nГлавное в этом пункте запомнить, что если вам дан например роман \"Евгений Онегин\", то мы не имеем права изменять словосочетание внутри скобок,а если не указано, то меняем, оставляя кавычки.\nII Деепричастный оборот\nМы должны проверить выполняет ли это действие подлежащее, если нет, то это ошибка.Также деепричастный оборот не употребляется в безличных предложения.\nIII Причастный оборот\n1. Окончания главного слова и причастия должны совпадать, иначе - ошибка.\n2Главное слово не может находится внутри причастного оборота.\n3. Причастие не может находится слишком далеко за другими словами.\nIV Косвенная речь\nВ косвенной речи не могут быть местоимения с лицами 1 и 2\nV Построенеие приложений однородными членами.\nВажно запомнить составные союзы, потому что менять их местами нельзя.\n Однородные члены выражены одной частью речь.\n VI Существительное с предлогом после таких слов как: благодаря соглсно, вопреки - употребляются с Д.п.\nсуществительные с предлогом и заканчивающееся на -ий,-ия,-ие, то в д.п. пишет е или и\nXVIII Сложное предложение, частицы ли неужели\nVIIIВидовременная ошибка\nОднокореннае слова должны стоять в одном времени и форме.\n IX Сложные предложения");
        links.setText("Рекомендую посмотреть эти видеоролики для лучшего понимая этого задания :)\n https://www.youtube.com/watch?v=uJJxIeM4Tp4&t=172s\nhttps://yandex.ru/video/preview/?filmId=16596070122355469995&text=8+задание+егэ+по+русскому&where=all");
        //Кнопка к заданиям
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_8.this, Task8.class);
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

                    Intent intent = new Intent(Theory_8.this, Theory_9.class);
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

                    Intent intent = new Intent(Theory_8.this, Theory_7.class);
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

                    Intent intent = new Intent(Theory_8.this, TheoryChoose.class);
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

            Intent intent = new Intent(Theory_8.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}