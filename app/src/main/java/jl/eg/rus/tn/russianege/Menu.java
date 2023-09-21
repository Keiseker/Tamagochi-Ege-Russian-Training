package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuWrapperICS;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.util.LocaleData;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Menu extends AppCompatActivity {
    Button back2,theory,tasks,settings;
    TextView text;
    Dialog settings_window;
    ImageView ind_food;
    int image;
    ImageView pet;

    String get;
    int i;
    public static final String App_Preferences = "my_settings";
    SharedPreferences mSettings;
    public static final String App_Preferences_name = "name";
    public static final String App_Preferences_pet = "pet";

    public static final String Ind_img = "ind_img";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //инициализация объектов
        pet = findViewById(R.id.pet);
        ind_food = findViewById(R.id.indicator2);
        text = (TextView) findViewById(R.id.textV);

        //создание настроек
        mSettings = getSharedPreferences(App_Preferences, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSettings.edit();

        //принимаем имя питомца с Tamagochi.class
        Bundle arguments = getIntent().getExtras();
        //прием изображения
        if (arguments != null){
            image = arguments.getInt("pet");
            SharedPreferences.Editor m1 = mSettings.edit();
            m1.putInt(App_Preferences_pet,image);
            m1.apply();
            pet.setImageResource(image);
        }
        //загрузка изобажения в последующие разы
        if (mSettings.contains(App_Preferences_pet)) {
            pet.setImageResource(mSettings.getInt(App_Preferences_pet, 0));
        }
        //приём имени
        Intent intent = getIntent();
        get = intent.getStringExtra("message");
        //вставка имени
        text.setText(get);

        //Кнопка назад
        back2 = findViewById(R.id.backmenu);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Menu.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                    //пусто
                }

            }
        });

        //создание диалогового окна
        settings_window = new Dialog(this);
        settings_window.requestWindowFeature(Window.FEATURE_NO_TITLE);
        settings_window.setContentView(R.layout.settings);
        Button back2 = settings_window.findViewById(R.id.back_settings);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               settings_window.cancel();
            }
        });
        Button choice = settings_window.findViewById(R.id.choice_pet);
        choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                get = null;
                Intent intent = new Intent(Menu.this,Tamagochi.class);
                intent.putExtra("Choice", false);
                startActivity(intent);
            }
        });

        //кнопка к настройкам
        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settings_window.show();
            }
        });

        //Кнопка к теории
        theory = findViewById(R.id.theory);
        theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Menu.this, TheoryChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }

            }
        });

        //Кнопка к заданиям
        tasks = findViewById(R.id.taskchoose);
        tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(Menu.this,TasksChoose.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }

            }
        });
        /*//изменение индикатора 2
        TextView date_view = findViewById(R.id.date);
        Date date_now = new Date();
        Date data_save = date_now;
        data_save = getSharedPreferences()*/


    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mSettings.contains(App_Preferences_name)){
            get = mSettings.getString(App_Preferences_name,"");
            text.setText(get);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor m = mSettings.edit();
        m.putString(App_Preferences_name,get);
        m.apply();
    }


    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Menu.this,MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            //пусто
        }
    }


}//конец класса