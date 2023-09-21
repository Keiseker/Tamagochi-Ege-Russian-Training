package jl.eg.rus.tn.russianege;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Theory_17 extends AppCompatActivity {
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
        word1 = getString(R.string.Main1);
        String example1 = "\tЗапятая ставится:\n1)главное слово существительно или личное местоимение стоит перед причастным оборотом.\nПример:\n\tЯстреб устремили глаза в траву,|пожелтевшую от солнце|.\n\t2)причастный оборот стоит до главного слова, которое является личным местоимением.\nПример:\n\t|Пораженной этой мыслью|, он сидел на крыльце.\n\t3) причастный оборот,который имеет обстоятельственное значение, перед главным словом - существетельным.\nПример:\n\t|Уставшие от перехода|,альпинисты остановились на ночлег.\nОт глагола можно поставить вопрос к причастному обороту: остановились (почему?) потому что устали от перехода.";
        /*SpannableString example_1 = new SpannableString(example1);
        ForegroundColorSpan color_red = new ForegroundColorSpan(Color.GREEN);
        example_1.setSpan(color_red,114,119, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        //вставка теории
        ImageView image = findViewById(R.id.table);
        image.setVisibility(View.GONE);
        main.setText("Задание 17");
        before.setText("\t\tВ 17 задании основной уклон делается на запятые при причастных и деепричастных оборотах.");
        title.setText("Причастный оборот(какой?)");
        expln.setText(example1);
        title1.setText("Обособленное опеределение");
        expln1.setText("\tОбособленное определение является прилагательным с зависимыми словами, без них или несколькими однородными прилагательными, стоящими после главного слова.\n\tЗапятая ставится:\n1)после существительного или личного местоимения\nПример:\n\tНочи,|ясные|,|звёздные|,не давали заснуть.\n\t2)после главного слова, когда выражено парой однородных прилагательных.\nПример:\n\tМне нравится её речь,простая и эмоциональная.");
        title2.setText("Деепричастный оборот(что делая?что сделав?)");
        expln2.setText("\tЗапятая ставится:1)перед и после одиночного причастия или деепричастного оборота\nПример:\n\tМальчик бежал,|смотря по сторонам|.\n\t2)после 1 оборота и в конце 2, если между ними есть союз\"и\".\nПример:\n\tВетер мгновенно наполнил парус,|свистя в ушах| и |обдавая прохладой|.3)после каждого оборота, если они относятся к разным глаголам.\nПример:\n\tДевушка волновалась,|готовясь к выступлению|,и,|выйдя на трибуну|,немного растерялась.");
        links.setText("Если остались вопросы, советую посмотреть эти видеоролики :)\n https://www.youtube.com/watch?v=bjWWc759Z80\nЧасть1\n https://www.youtube.com/watch?v=4wH9qJZuVR4&list=PLHL4stKQKGdc2H0rwOQLC0CmU5AuxvkmH&index=41 \nЧасть 2\n https://www.youtube.com/watch?v=do8rZ0_DAxE&t=222s\nЧасть 3\n https://www.youtube.com/watch?v=bdFg6CTmOfc");

        //Кнопка приступить к заданию
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Theory_17.this, Task17.class);
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

                    Intent intent = new Intent(Theory_17.this, Theory_18.class);
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

                    Intent intent = new Intent(Theory_17.this, Theory_16.class);
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

                    Intent intent = new Intent(Theory_17.this, TheoryChoose.class);
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

            Intent intent = new Intent(Theory_17.this,TheoryChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
