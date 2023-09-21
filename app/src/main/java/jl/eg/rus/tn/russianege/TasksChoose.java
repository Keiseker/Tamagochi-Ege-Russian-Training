package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TasksChoose extends AppCompatActivity {

    Button back,random;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,
            t25,t26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_choose);

        back = (Button) findViewById(R.id.backtomenu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    Intent intent = new Intent(TasksChoose.this,Menu.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }

            }
        });
        random = (Button) findViewById(R.id.random);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String first_task = "1";
                    Intent intent = new Intent(TasksChoose.this, Task1.class);
                    intent.putExtra("first", first_task);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    //пусто
                }
            }
        });
        //Переход на 1 задание
        t1 = findViewById(R.id.title1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task1.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 2 задание
        t2 = findViewById(R.id.title2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task2.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 3 задание
        t3 = findViewById(R.id.title3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task3.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 4 задание
        t4 = findViewById(R.id.title4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task4.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 5 задание
        t5 = findViewById(R.id.title5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task5.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 6 задание
        t6 = findViewById(R.id.title6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task6.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 7 задание
        t7 = findViewById(R.id.title7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task7.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 8 задание
        t8 = findViewById(R.id.title8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task8.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 9 задание
        t9 = findViewById(R.id.title9);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task9.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 10 задание
        t10 = findViewById(R.id.title10);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task10.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 11 задание
        t11 = findViewById(R.id.title11);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task11.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 12 задание
        t12 = findViewById(R.id.title12);
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task12.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 13 задание
        t13 = findViewById(R.id.title13);
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task13.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 14 задание
        t14 = findViewById(R.id.title14);
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task14.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 15 задание
        t15 = findViewById(R.id.title15);
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task15.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 16 задание
        t16 = findViewById(R.id.title16);
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task16.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 17 задание
        t17 = findViewById(R.id.title17);
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task17.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 18 задание
        t18 = findViewById(R.id.title18);
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task18.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

        //Переход на 19 задание
        t19 = findViewById(R.id.title19);
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task19.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 20 задание
        t20 = findViewById(R.id.title20);
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task20.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 21 задание
        t21 = findViewById(R.id.title21);
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task21.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 22 задание
        t22 = findViewById(R.id.title22);
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task22.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 23 задание
        t23 = findViewById(R.id.title23);
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task23.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 24 задание
        t24 = findViewById(R.id.title24);
        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task24.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 25 задание
        t25 = findViewById(R.id.title25);
        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task25.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });
        //Переход на 26 задание
        t26 = findViewById(R.id.title26);
        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent intent = new Intent(TasksChoose.this, Task26.class);
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

            Intent intent = new Intent(TasksChoose.this,Menu.class);
            startActivity(intent);
            finish();

        } catch (Exception e) {

        }

    }
}