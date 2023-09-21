package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result25 extends AppCompatActivity {
    TextView text;
    Button repeat, back;
    String result;

    static final String[] explanation =
            {
                    "\tПредложение 16 связано с предыдущим с помощью лексического повтора ЦЕННОСТЯХ-ЦЕННОСТЯХ.",
                    "\tПредложение 19 связано с предложением 18 с помощью указательного местоимения «эта» и форм слова «потребность (в предложении 18 в Винительном падеже) — потребность (в 19-м предложении в Именительном падеже.)».",
                    "\tПредложение 21 связано с предыдущим с помощью пары антонимов НЕМНОГО — МНОГО и частицы И т.к. и в данном случае является усиляющей частицей.",
                    "\tПредложение 29 связано с предыдущим с помощью притяжательного местоимения \"его\" ",
                    "\tЛичное местоимение «них» в предложении 22 заменяет существительное «цветы» из предложения 21.",
                    "\tСоюз «но» соединяет предложение 16 с предложением 15.",
                    "\tПредложение 9 «Мне кажется, он сходит с ума — разговаривает сам с собой» связано с предыдущим при помощи личного местоимения ОН (соответствует слову СЫН из предыдущего предложения).",
                    "\tСлова ЕГО и ЕЁ могут быть не только личными, но и притяжательными местоимениями в одном ряду с ИХ, НАШ, ВАШ.",
                    "\tЛичное местоимение «он» в предложении 11 заменяет имя собственное «Чехов» из предложения 10.",
                    "\tПредложение 21 «Но это вполне устраивает сторонников нивелирования личности, которые выделяют безликую толпу бездарных людей и противопоставляют ей людей талантливых» связано с предыдущим с помощью противительного союза НО и указательного местоимения ЭТО.",
                    "",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text = findViewById(R.id.result);
        repeat = findViewById(R.id.repeat);

        Intent intent = getIntent();
        result = intent.getStringExtra("result25");
        if (result.equalsIgnoreCase("true")) {
            text.setText("Ты молодец!Всё правильно");
        } else {
            text.setText("Повтори теорию получше(");
        }

        back = findViewById(R.id.back_result);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Result25.this, TasksChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        repeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Result25.this, Task25.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed() {
        try {

            Intent intent = new Intent(Result25.this, TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}