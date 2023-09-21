package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthorsInfo extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authors_info);

        //инициализация кнопки назад и ее работа
        back = findViewById(R.id.backmenu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(AuthorsInfo.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }catch (Exception e) {

                }

            }
        });
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {

            Intent intent = new Intent(AuthorsInfo.this,MainActivity.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}