package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result11 extends AppCompatActivity {
    TextView text;
    Button repeat,back;
    String result;

    /*static final String[] explanation =
            {
                    "",""
            };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text = findViewById(R.id.result);
        repeat = findViewById(R.id.repeat);

        Intent intent = getIntent();
        result = intent.getStringExtra("result11");
        if(result.equalsIgnoreCase("true")){
            text.setText("Ты молодец!Всё правильно");
        }
        else{
            text.setText("Повтори теорию получше(");
        }

        back = findViewById(R.id.back_result);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Result11.this,TasksChoose.class);
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

                    Intent intent = new Intent(Result11.this,Task11.class);
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

            Intent intent = new Intent(Result11.this,TasksChoose.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }
    }
}
