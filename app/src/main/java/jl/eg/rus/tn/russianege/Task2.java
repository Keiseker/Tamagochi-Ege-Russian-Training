package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task2 extends AppCompatActivity {

    TextView title,show,hide,text;
    Button btn,back;
    String result,person_answer,task;

    static final String[] text_task =
            {
                    "(1)Причина возникновения мерных, однообразных волн - трение между ветром и водой.(2)Под напором ветра отдельные молекулы воды перескакивают через линию, именуемую уровнем моря, появляются так называемые барашки, а затем они под действием силы тяжести опадают.(3)Как только ветер стихнет совсем, эти барашки исчезнут, ведь сила, удерживающая (...) , слабее поврхностного натяжения моря.",
                    "(1)Морские волны сбегаются к берегу с разных сторон, вблизи береговой линии трудятся о дно.(2)В этот момент разные части волн ведут себя по-разному,(...) сказываеся разница глубин: где море глубже, волна движется быстрее,где мельче - медленнее.(3)Вот почему набегающий гребень волны замедляет свой бег, а спешащая вслед ему подошва волны движется быстрее.",
                    "(1)Весьма любопытны озера, которые словно играют в прятки, то исчезая с лица земли,то снова появляясь;весной благодаря обилию талых вод они разливаются,а летом начинают мелеть и вдруг совсем исчезают.(2)Находятся эти водоёмы в районе карстовых пещер, представляющие собой воронкообразные ямы, в которые, закручиваясь спиралью, уходит вода.(3)Иногда на месте воронок случается обвал, и тогда \"слив\" закупоривается, водоём может существовать(...)нескольких лет, но в конце концов вода всё же растворяет известняковые породы и промывает себе новый путь в подземеье.",
                    "(1)Зыбучий песок - это подвижная песчаная поверхность, способная засосать(...) предмет.(2)Механизм действия зыбучих песков обусловлен электрическими эффектами, в результате которых между песчинками уменьшается трение и песок становится текучим.(3)Если текучесть распространяется на глубину нескольких метров, грунт становится вязким и засасывает любое массивное тело, попавшее в него.",
                    "(1)Чаще всего преломление лучей света в воздухе незначительно,а (...) ложка в стакане чая кажется нам сломанной.(2)Причина заключается в различной плотности воды и воздуха.(3)Поэтому, переходя из одной среды в другую,лучи света преломляются, изменяют прямолинейный путь, отклоняясь по закону физики в сторону более плотной среды.",
                    "(1)Космос и окрестности Солнечной системы насыщены большим количеством\"небесного мусора\", который представляет собой обломки твёрдых пород, подобных камню, куски льда и замороженных газов.(2)Это могут быть астероиды и кометы, вращающиеся вокруг Солнца по сложным орбитам.(3)Такие небесные объекты каждый день бомбардируют Землю, и (...)благодаря атмосфере они чаще всего сгорают, не долетая до поверхности планеты.",
                    "(1)Последствия ударов небесных объектов мы можем наблюдать, взглянуть на Луну.(2)Именно они определили современный вид спутницы(...)планеты.(3)Поверхность Земли могла бы выглядеть так же,если бы не атмосфера и не эрозия почвы,сглаживающие следы ударов пробивающихся метеоритов.",
                    "(1)Каждый знает, что различные тела загораются при разной температуре, но есть (...) вещества, которые самовоспломеняются.(2)К их числу относится фтористый водород, который образуется в результате гниения растительных и животных организмов и, попадая на воздух, вспыхивает и горит светлым пламенем.(3)Поэтому на болотах можно увидеть,как то вспыхивают, то гаснут в разных местах бледные огненные языки.",
                    "(1)Китайцы называют бамбук главным из трёх \"зимних друзей\",куда входят ещё зимняя слива и сосна.(2)(...) троица встречается повсюду в китайском искусстве и литратуре как символ несгибаемости перед лицом трудостей, потому что сливы цветут в период, когда на земле уже лежит снег, сосны произрастаются на бедной почве, цепляясь за утёсы над пропастью.(3)А бамбук остаётся зелёным круглый год, он склоняется под весом зимних снегов,но быстро выпрямляется, когда они тают.",
                    "(1)При комариных укусах появляются припухлости на местах укусов и зуд.(2)Периодически контакты с комарами сопровождаются всё теми же одинаковыми симптомами, но, если эти встречи продолжаются достаточно длительное время, человек может потерять чувствительность к комариным укусам.(3)(...), многолетняя работа учёных-натуралистов на природе, в обществе комаров, приводит к тому, что у них вырабатывается иммунитет, для поддердания которого человек должен получать ежегодно несколько комариных укусов.",
                    "(1)Славящиеся своими достижениями в области электроники японцы тем не менее не обходятся без помощи \"живых приборов\":в реках и озёрах Японии, главной бедой которой являются землетрясения, водится несколько видов рыб-малюток, очень хорошо реагрующих на любые сейсмические процессы.(2)За 5-8 часов до землетрясения всегда спокойные малютки начинют бешено метаться по аквариуму, предупреждая тем самым о грозящей беде.(3)Именно (...) им были спасены десятки тысяч человеческих жизней.",
                    "(1)Многие животные наделены природой удивительными способностями и возможностями.(2)По чувствительности, надёжности, форме и умению приспосабливаться к различным условиям не могут сравниться с биологическими чудо-приборами(...) самые совершенные механизмы,рождённые человеческой мыслью.(3)Поэтому порой их организмы служат образцом для людей,создающих высокоточные приборы и устройства."
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_2);

        //ищем все элементы
        title = findViewById(R.id.task_title);
        show = findViewById(R.id.show_text);
        hide = findViewById(R.id.hide_text);
        text = findViewById(R.id.text_text);
        btn = findViewById(R.id.confirm);

        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        final int index = random.nextInt(text_task.length);
        text.setText(text_task[index]);

        //появление текста
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setVisibility(View.GONE);
                text.setVisibility(View.VISIBLE);
                hide.setVisibility(View.VISIBLE);
            }
        });
        //исчезание текста
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setVisibility(View.VISIBLE);
                text.setVisibility(View.GONE);
                hide.setVisibility(View.GONE);
            }
        });

        //кнопка назад сверху
        back = findViewById(R.id.backtotask2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task2.this,TasksChoose.class);
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
                switch (index){
                    case 1:
                        if (person_answer.equalsIgnoreCase("их")){
                        result = "true";
                        Intent intent = new Intent(Task2.this, Result2.class);
                        intent.putExtra("result2", result);
                        startActivity(intent);
                        }
                        else {
                        result = "false";
                        Intent intent = new Intent(Task2.this, Result2.class);
                        intent.putExtra("result2", result);
                        startActivity(intent);
                        }
                    case 2:
                        if (person_answer.equalsIgnoreCase("потомучто")||
                                person_answer.equalsIgnoreCase("таккак")||
                                person_answer.equalsIgnoreCase("ибо")||
                                person_answer.equalsIgnoreCase("поскольку")||
                                person_answer.equalsIgnoreCase("ведь")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            intent.putExtra("task", task);
                            startActivity(intent);
                        }
                    case 3:
                        if (person_answer.equalsIgnoreCase("втечение")||
                                person_answer.equalsIgnoreCase("впродолжение")||
                                person_answer.equalsIgnoreCase("напротяжении")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 4:
                        if (person_answer.equalsIgnoreCase("любой")||
                                person_answer.equalsIgnoreCase("всякий")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 5:
                        if (person_answer.equalsIgnoreCase("вот")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 6:
                        if (person_answer.equalsIgnoreCase("только")||
                                person_answer.equalsIgnoreCase("лишь")||
                                person_answer.equalsIgnoreCase("именно")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 7:
                        if (person_answer.equalsIgnoreCase("нашей")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 8:
                        if (person_answer.equalsIgnoreCase("такие")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 9:
                        if (person_answer.equalsIgnoreCase("эта")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 10:
                        if (person_answer.equalsIgnoreCase("например")||
                                person_answer.equalsIgnoreCase("кпримеру")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 11:
                        if (person_answer.equalsIgnoreCase("благодаря")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }
                    case 12:
                        if (person_answer.equalsIgnoreCase("даже")){
                            result = "true";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            intent.putExtra("task", task);
                            startActivity(intent);
                        }
                        else{
                            result = "false";
                            Intent intent = new Intent(Task2.this, Result2.class);
                            intent.putExtra("result2", result);
                            startActivity(intent);
                        }

                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task2.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}