package jl.eg.rus.tn.russianege;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button info,start;
    private long backPressedTime;
    private Toast backToast;

    public static final String My_Settings = "my_settings";
    SharedPreferences sp;
    Boolean hasVisited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создание настроек
        sp = getSharedPreferences(My_Settings, Context.MODE_PRIVATE);
        //создание переменной захода в приложение
        hasVisited = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("hasVisited", true);
        //инициализация кнопок
        start = findViewById(R.id.start);
        info = findViewById(R.id.info);
        //проверка в первый ли раз зашли в приложение
        if(hasVisited){//если в первый раз
            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent intent = new Intent(MainActivity.this, AuthorsInfo.class);
                        startActivity(intent);
                        finish();

                    }catch (Exception e) {

                    }
                    getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                            .putBoolean("hasVisited",true).apply();
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,Tamagochi.class));
                    getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                            .putBoolean("hasVisited",false).apply();

                }
            });

        }
        else {//если не в первый раз
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        Intent intent = new Intent(MainActivity.this, Menu.class);
                        startActivity(intent);
                        finish();

                    } catch (Exception e) {

                    }
                }
            });

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        Intent intent = new Intent(MainActivity.this, AuthorsInfo.class);
                        startActivity(intent);
                        finish();

                    }catch (Exception e) {

                    }
                }
            });

        }

    }//конец основных действий

    //Системная кнопка назад
    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(),"Нажмите еще раз чтобы выйти",Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}