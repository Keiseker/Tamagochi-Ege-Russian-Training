package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_9 extends AppCompatActivity {

    Button back, previous,next,task;
    TextView before,title,expln,title1,expln1,title2,expln2,links,main,expln3;
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
        expln3 = findViewById(R.id.explanation3);
        links = findViewById(R.id.links);
        main = findViewById(R.id.main_title);
        //важные слова
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории

        ImageView image = findViewById(R.id.table);
        image.setVisibility(View.GONE);
        main.setText("Задание 9");
        before.setText("Правила безударной гласной.");
        title.setText("Безударная череующаяся гласная гласная");
        expln.setText("1) Выбор зависит от согласного на конце корня:\nКорни; -раст-,-рос,-ращ-\nПримеры: заросли,расти, выращенный\nИсключения:Ростов,росток,ростовщик,отрасль,на вырост. \nКорни; -скач-,-скоч\nПримеры: скакать,выскочить\nИсключения:скачок\nКорни; -лаг-,-лож\nПримеры: изложить,излагать\nИсключения: полог");
        expln1.setText("2) Зависит от ударения \nКорни; -гАр-,-гор\nПримеры: угар,угореть\nИсключения: нагревать,огонь\nКорни; -твАр--твор-,-клАн--клон\nПримеры: творить,кланятся\nИсключения: утварь\nКорни; -зар-зОр-,-плов-плав-плыв\nПримеры: заря,плавательный\nИсключения: пловец,плывуны, пловчиха, зоревать");
        expln2.setText("3)От лексического значения\nКорни; -мак(погрузить)-мок(впитывать-,-равн(одинаковый-ровн(прямой)\nПримеры: уровень,поравнять\nИсключения: равнина,уровень, поровну, ровесник");
        expln2.setText("4) Зависит от суффикса А\nКорни; -кос-кас-, ...им - ....ин,бер-бир,дер-дир,мер мир,пер -пио,тер тир-,-равн(одинаковый-ровн(прямой)\\nПримеры: прикоснутся,стереть\nКорни; -блест-блист-, -жег - .жиг,стел-стил, чет,чит-\nПримеры: блестящий, блистать,вычитать\");");

        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\n https://www.youtube.com/watch?v=9KYCBIxuoWA&t=13s\n https://www.youtube.com/watch?v=51oVWIr87rk");
        //Кнопка к заданиям
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_9.this, Task9.class);
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

                    Intent intent = new Intent(Theory_9.this, Theory_10.class);
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

                    Intent intent = new Intent(Theory_9.this, Theory_8.class);
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

                    Intent intent = new Intent(Theory_9.this, TheoryChoose.class);
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

            Intent intent = new Intent(Theory_9.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
