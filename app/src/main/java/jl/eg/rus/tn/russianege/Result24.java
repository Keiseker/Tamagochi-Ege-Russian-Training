package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result24 extends AppCompatActivity {
    TextView text;
    Button repeat, back;
    String result;

    static final String[] explanation =
            {
                    "\tТ.к. антонимы — слова с противоположным значением, то предложении 15 такими являются вопрос-ответ.",
                    "\tФразеологизм — устойчивое словосочетание, обладающее неделимым смыслом и извлекаемое из нашей памяти в готовом виде.\n\tВ предложении 5 есть несколько фразеологизмов: «хлопот полон рот», «с другой стороны», «что называется», «на досуге».Так что можно выписать любой.",
                    "\tТ.к. антонимы — слова с противоположным значением, то предложении 2 такими являются снаружи-изнутри.",
                    "\tФразеологизм в  этом предложении \"под самым носом\"",
                    "\tВ предложении 10 «Вещь может быть дорогой, но некрасивой, безвкусной» слова «некрасивой» и «безвкусной» являются контекстными синонимами.\n\tОтвет: некрасивой» и безвкусной",
                    "\tВ переносном значении употреблено слово «арсенал». Арсенал знаний = склад знаний.",
                    "\tВ предложении 30 «Мне тоже в своё время пришлось пройти через период раздражения и недовольства» используются синонимы «раздражение» и «недовольство».",
                    "\t«устарелым» и «несовременным».",
                    "\tбездарных — талантливых",

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text = findViewById(R.id.result);
        repeat = findViewById(R.id.repeat);

        Intent intent = getIntent();
        result = intent.getStringExtra("result24");
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

                    Intent intent = new Intent(Result24.this, TasksChoose.class);
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

                    Intent intent = new Intent(Result24.this, Task24.class);
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

            Intent intent = new Intent(Result24.this, TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}