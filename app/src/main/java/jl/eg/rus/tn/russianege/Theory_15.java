package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_15 extends AppCompatActivity {

    Button back, previous,next,task;
    TextView before,title,expln,title1,expln1,title2,expln2,links,main;
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
        //важные слова
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории
        ImageView image = findViewById(R.id.table);
        image.setVisibility(View.GONE);
        title1.setVisibility(View.GONE);
        title2.setVisibility(View.GONE);
        expln1.setVisibility(View.GONE);
        expln2.setVisibility(View.GONE);
        main.setText("Задание 15");
        title.setText("Алгоритм задания");
        expln.setText("1.Определить образовано ли слово от глагола.\n2. Если да, то определить вид глагола, если вид совершенный НН\n3)в словах образованных глагола несовершенного вида пишем Н, но если у слова есть суффиксыОВА,ЕВА или зависимые слова, то пишется НН\n4)Если слово не образовано от глагола, то смотрим на гласную в суффиксе. Если это и, а , я, то пишем Н, кроме стеклянный, оловянный, деревянный, если е, о, то пишем НН, исключение ветренный\n5)В кратких причастиях пишем Н, а в кратких прилагательных столько же сколько и в полных.\n6) В наречниях и существительных пишется столько,сколько в полнойслове от которого ");
        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\n https://www.youtube.com/watch?v=tlGzmFt6yv4\n https://www.youtube.com/watch?v=_NOC4czxPyE");
        //Кнопка к заданиям
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_15.this, Task15.class);
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

                    Intent intent = new Intent(Theory_15.this, Theory_16.class);
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

                    Intent intent = new Intent(Theory_15.this, Theory_14.class);
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

                    Intent intent = new Intent(Theory_15.this, TheoryChoose.class);
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

            Intent intent = new Intent(Theory_15.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
