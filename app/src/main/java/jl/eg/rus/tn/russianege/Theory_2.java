package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_2 extends AppCompatActivity {

    Button back, previous,next,task;
    TextView before,title,expln,title1,expln1,title2,expln2,links,main;
    ImageView imageView;

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
        imageView =findViewById(R.id.table);
        //важные слова
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории
        imageView.setVisibility(View.GONE);
        main.setText("Задание 2");
        before.setText("\t\tВторое задание требует значительные количество знаний на средства связи в предложении.");
        title.setText("Союзы");
        expln.setText("Сочинительные союзы:\n1)соединительные(если связано с соединением,единством):\n\tи, да(в значении И), тоже, также...\n2) противительные(против чего-то):\n\tа, но, да(в значении НО), зато, однако....\n3)разделительные союзы:\n\tили, либо, то...то....\nПодчинительные союзы:\n1)изъяснительные(поясненящие):\n\tчто, чтобы, как...\n2)временные(когда)\n\tкогда, пока, едва...\n3)причинные(почему?)\n\tпотому что, так как....\n4)целевые(зачем?)\n\tчтобы...\n5)условные(при каком условии?)\n\tесли...\n6)уступительные\n\tхотя, несмотря на...\n7)сравнительные\n\tкак, как будто, точно, словно...\n8)следственные\n\tтак что....");
        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\nОбъяснение теории:\n https://www.youtube.com/watch?v=Uzbmq8S7rMk&list=PLsFA6mM3DNubqum4Xa9qqdYfSHacvo-2T&index=5\n https://www.youtube.com/watch?v=wTljEJ6gxTU&list=PLsFA6mM3DNubqum4Xa9qqdYfSHacvo-2T&index=6\n https://www.youtube.com/watch?v=sNkRMNXfAyk&list=PLsFA6mM3DNubqum4Xa9qqdYfSHacvo-2T&index=7\n https://www.youtube.com/watch?v=OyEXbHvu2t4&list=PLsFA6mM3DNubqum4Xa9qqdYfSHacvo-2T&index=8\nПрактика:\n https://www.youtube.com/watch?v=bM-O9C0Hq5M&list=PLsFA6mM3DNubqum4Xa9qqdYfSHacvo-2T&index=9");
        title1.setText("Местоимения");
        expln1.setText("1)личные\n\tя, мы, ты,вы, он, она,они\n2)возвратные\n\tсебя\n3)вопросительно-относительные\n\tкто, что, какой, чей, который,сколько, какой...\n4) указательные\n\tтот, этот, такой, таков, столько....\n5)притяжательные(чей?)\n\tзадаем вопрос личным местоимениям и возвратному и меняем их(я (чей?) мой)\n6)определительные\n\tсам, самый, весь, всякий, каждый, иной, любой, другой\n7)отрицание(отсутствие чего-либо)\n\tприставки НЕ и НИ и 3 пункт(кто - никто или некто\n8)неопреденные\n\t приставка кое или не и пункт 3(кое-кто),суффиксы -то,-либо,-нибудь и пункт 3(что-то, какой-нибудь");
        title2.setText("Частица");
        expln2.setText("1)вопросительная\n\tли, разве, неужели...\n2)восклицательные\n\tчто за...!, как...!\n3)указательные\n\tвот, вон\n4)уточняющие\n\tименно, как раз\n5)ограничительные\n\tлишь, только, почти\n6)сомнения\n\t едва ли, вряд ли\n\t7)усилительные\n\t даже");

        //Кнопка к заданиям
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_2.this, Task2.class);
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

                    Intent intent = new Intent(Theory_2.this, Theory_3.class);
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

                    Intent intent = new Intent(Theory_2.this, Theory_1.class);
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

                    Intent intent = new Intent(Theory_2.this, TheoryChoose.class);
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

            Intent intent = new Intent(Theory_2.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
