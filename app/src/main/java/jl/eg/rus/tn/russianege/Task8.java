package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Task8 extends AppCompatActivity {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,h1,h2,h3,h4,h5,h6,h7,h8,h9,result,person_answer,index_answer;
    TextView show1,hide1,show2,hide2,show3,hide3,show4,hide4,show5,hide5,show6,hide6,show7,hide7,
            show8,hide8,show9,hide9,t1,t2,t3,t4,t5,t6,t7,t8,t9,mistakes_area;
    Button back,btn;

    static final String[] sentence1 =
            {
                    "1)Геофизики завершили и познакомили со своим исследованием научную общественность.",
            };
    static final String[] sentence2 =
            {
                    "2)Как известно, понятие «художник» происходит от древнерусского слова «худое», имевшего прежде значение чудесности, колдовства, волшебства.",
            };
    static final String[] sentence3 =
            {
                    "3)Вопреки правил пунктуации, журналисты часто употребляют тире вместо двоеточия.",
            };
    static final String[] sentence4 =
            {
                    "4)Прославив своё имя исследованиями болезней и применением вакцин, у меня сложились замечательные отношения со всеми учеными.",
            };
    static final String[] sentence5 =
            {
                    "5)Провалявшись часов до семи на кушетке, Крюков встал и начал думать, куда идти искать работу.",
            };
    static final String[] sentence6 =
            {
                    "6)Овраги наносят огромный вред сельскому хозяйству, поэтому их в народе называют «болезнью земли».",
            };
    static final String[] sentence7 =
            {
                    "7)Отец геометрии Евклид произносил, когда заканчивал каждый свой математический вывод о том «Что и требовалось доказать».",
            };
    static final String[] sentence8 =
            {
                    "8)Ломоносов столько сделал для русской науки, сколько не сделал ни один учёный за двести с лишним лет.",
            };
    static final String[] sentence9 =
            {
                    "9)Обе маленьких, беззащитных котёнка, сидели, дрожа всеми своими крохотными тельцами, несмотря на то, что их поместили в самое тёплое место в квартире.",
            };
    static final String[] mistakes =
            {
                    "\\tА)ошибка в построении предложения\\nс однородными членами\\n\\n\\tБ)неправильное употребление падежной формы существительного\\nс предлогом\\n\\n\\tВ) ошибка в построении предложения\\nс деепричастным оборотом\\n\\n\\tГ) неправильное построение предложения\\nс косвенной речью\\n\\n\\tД) ошибка в употреблении имени числительного"
            };
    static final String[] true_answers = {"13479","1234","123"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_8);

        //ищем все элементы
            //1
                show1 = findViewById(R.id.show1); hide1 = findViewById(R.id.hide1);
                s1 = getString(R.string.Show1);h1 = getString(R.string.Hide1);
            //2
                 show2 = findViewById(R.id.show2); hide2 = findViewById(R.id.hide2);
                 s2 = getString(R.string.Show2);h2 = getString(R.string.Hide2);
            //3
                show3 = findViewById(R.id.show3); hide3 = findViewById(R.id.hide3);
                s3 = getString(R.string.Show3);h3 = getString(R.string.Hide3);
            //4
                show4 = findViewById(R.id.show4); hide4 = findViewById(R.id.hide4);
                s4 = getString(R.string.Show4);h4 = getString(R.string.Hide4);
            //5
                show5 = findViewById(R.id.show5); hide5 = findViewById(R.id.hide5);
                s5 = getString(R.string.Show5);h5 = getString(R.string.Hide5);
            //6
                show6 = findViewById(R.id.show6); hide6 = findViewById(R.id.hide6);
                s6 = getString(R.string.Show6);h6 = getString(R.string.Hide6);
            //7
                show7 = findViewById(R.id.show7); hide7 = findViewById(R.id.hide7);
                s7 = getString(R.string.Show7);h7 = getString(R.string.Hide7);
            //8
                show8 = findViewById(R.id.show8); hide8 = findViewById(R.id.hide8);
                s8 = getString(R.string.Show8);h8 = getString(R.string.Hide8);

            //9
                show9 = findViewById(R.id.show9); hide9 = findViewById(R.id.hide9);
                s9 = getString(R.string.Show9);h9 = getString(R.string.Hide9);
            //ищем поля предложений
            t1 = findViewById(R.id.sent1);
            t2 = findViewById(R.id.sent2);
            t3 = findViewById(R.id.sent3);
            t4 = findViewById(R.id.sent4);
            t5 = findViewById(R.id.sent5);
            t6 = findViewById(R.id.sent6);
            t7 = findViewById(R.id.sent7);
            t8 = findViewById(R.id.sent8);
            t9 = findViewById(R.id.sent9);
            //поле грамматических ошибок
            mistakes_area = findViewById(R.id.mistacke);
            //кнопка подтвердить
            btn = findViewById(R.id.confirm);
        //Появление случайного задания и правильного ответа на него
        Random random = new Random();
        final int index = random.nextInt(mistakes.length);
        t1.setText(sentence1[index]);
        t2.setText(sentence2[index]);
        t3.setText(sentence3[index]);
        t4.setText(sentence4[index]);
        t5.setText(sentence5[index]);
        t6.setText(sentence6[index]);
        t7.setText(sentence7[index]);
        t8.setText(sentence8[index]);
        t9.setText(sentence9[index]);
        index_answer = true_answers[index];
        //обработка нажайти на поках/скрывание текста
            //1
                show1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show1.setVisibility(View.GONE);
                        show1.setText(null);
                        t1.setVisibility(View.VISIBLE);
                        t1.setText(sentence1[index]);
                        hide1.setVisibility(View.VISIBLE);
                        hide1.setText(h1);
                    }
                });

                hide1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show1.setVisibility(View.VISIBLE);
                        show1.setText(s1);
                        t1.setVisibility(View.GONE);
                        t1.setText(null);
                        hide1.setVisibility(View.GONE);
                        hide1.setText(null);
                    }
                });
            //2
                show2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show2.setVisibility(View.GONE);
                        show2.setText(null);
                        t2.setVisibility(View.VISIBLE);
                        t2.setText(sentence2[index]);
                        hide2.setVisibility(View.VISIBLE);
                        hide2.setText(h2);
                    }
                });

                hide2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show2.setVisibility(View.VISIBLE);
                        show2.setText(s2);
                        t2.setVisibility(View.GONE);
                        t2.setText(null);
                        hide2.setVisibility(View.GONE);
                        hide2.setText(null);
                    }
                });
            //3
                show3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show3.setVisibility(View.GONE);
                        show3.setText(null);
                        t3.setVisibility(View.VISIBLE);
                        t3.setText(sentence3[index]);
                        hide3.setVisibility(View.VISIBLE);
                        hide3.setText(h3);
                    }
                });

                hide3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show3.setVisibility(View.VISIBLE);
                        show3.setText(s3);
                        t3.setVisibility(View.GONE);
                        t3.setText(null);
                        hide3.setVisibility(View.GONE);
                        hide3.setText(null);
                    }
                });
            //4
                show4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show4.setVisibility(View.GONE);
                        show4.setText(null);
                        t4.setVisibility(View.VISIBLE);
                        t4.setText(sentence4[index]);
                        hide4.setVisibility(View.VISIBLE);
                        hide4.setText(h4);
                        hide5.setPaintFlags(hide5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    }
                });

                hide4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show4.setVisibility(View.VISIBLE);
                        show4.setText(s4);
                        show4.setPaintFlags(show4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        t4.setVisibility(View.GONE);
                        t4.setText(null);
                        hide4.setVisibility(View.GONE);
                        hide4.setText(null);
                    }
                });

            //5
                show5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show5.setVisibility(View.GONE);
                        show5.setText(null);
                        t5.setVisibility(View.VISIBLE);
                        t5.setText(sentence5[index]);
                        hide5.setVisibility(View.VISIBLE);
                        hide5.setText(h5);
                        hide5.setPaintFlags(hide5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    }
                });

                hide5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show5.setVisibility(View.VISIBLE);
                        show5.setText(s5);
                        show5.setPaintFlags(show5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        t5.setVisibility(View.GONE);
                        t5.setText(null);
                        hide5.setVisibility(View.GONE);
                        hide5.setText(null);
                    }
                 });

            //6
                show6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show6.setVisibility(View.GONE);
                        show6.setText(null);
                        t6.setVisibility(View.VISIBLE);
                        t6.setText(sentence6[index]);
                        hide6.setVisibility(View.VISIBLE);
                        hide6.setText(h6);
                        hide6.setPaintFlags(hide6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    }
                });

                hide6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show6.setVisibility(View.VISIBLE);
                        show6.setText(s6);
                        show6.setPaintFlags(show6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        t6.setVisibility(View.GONE);
                        t6.setText(null);
                        hide6.setVisibility(View.GONE);
                        hide6.setText(null);
                    }
                });

            //7
                show7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show7.setVisibility(View.GONE);
                        show7.setText(null);
                        t7.setVisibility(View.VISIBLE);
                        t7.setText(sentence7[index]);
                        hide7.setVisibility(View.VISIBLE);
                        hide7.setText(h7);
                        hide7.setPaintFlags(hide7.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    }
                });

                hide7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show7.setVisibility(View.VISIBLE);
                        show7.setText(s7);
                        show7.setPaintFlags(show7.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        t7.setVisibility(View.GONE);
                        t7.setText(null);
                        hide7.setVisibility(View.GONE);
                        hide7.setText(null);
                    }
                });

            //8
                show8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show8.setVisibility(View.GONE);
                        show8.setText(null);
                        t8.setVisibility(View.VISIBLE);
                        t8.setText(sentence8[index]);
                        hide8.setVisibility(View.VISIBLE);
                        hide8.setText(h8);
                        hide8.setPaintFlags(hide8.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    }
                });

                hide8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show8.setVisibility(View.VISIBLE);
                        show8.setText(s8);
                        show8.setPaintFlags(show8.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        t8.setVisibility(View.GONE);
                        t8.setText(null);
                        hide8.setVisibility(View.GONE);
                        hide8.setText(null);
                    }
                });

            //9
                show9.setOnClickListener(new View.OnClickListener() {
                     @Override
                    public void onClick(View v) {
                        show9.setVisibility(View.GONE);
                        show9.setText(null);
                        t9.setVisibility(View.VISIBLE);
                        t9.setText(sentence9[index]);
                        hide9.setVisibility(View.VISIBLE);
                        hide9.setText(h9);
                        hide9.setPaintFlags(hide9.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    }
                });

                hide9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        show9.setVisibility(View.VISIBLE);
                        show9.setText(s9);
                        show9.setPaintFlags(show9.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        t9.setVisibility(View.GONE);
                        t9.setText(null);
                        hide9.setVisibility(View.GONE);
                        hide9.setText(null);
                    }
                });

        //кнопка назад сверху
        back = findViewById(R.id.backtotask8);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Task8.this,TasksChoose.class);
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
                    Intent intent = new Intent(Task8.this, Result8.class);
                    intent.putExtra("result8", result);
                    startActivity(intent);
                }
                else{
                    result = "false";
                    Intent intent = new Intent(Task8.this, Result8.class);
                    intent.putExtra("result8", result);
                    startActivity(intent);
                }
            }
        });
    }
    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(Task8.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}