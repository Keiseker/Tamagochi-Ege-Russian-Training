package jl.eg.rus.tn.russianege;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tamagochi extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<TamagochiModel>mainModels;
    TamagochiAdapter tamagochiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamagochi);
        recyclerView = findViewById(R.id.recycler_view);

        Integer[] pets = {R.drawable.gray_cat,R.drawable.orange_cat,R.drawable.red_dragon,R.drawable.green_dragon};


        mainModels = new ArrayList<>();
        for (int i=0;i<pets.length;i++){
            TamagochiModel model = new TamagochiModel(pets[i]);
            mainModels.add(model);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                Tamagochi.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        tamagochiAdapter = new TamagochiAdapter(Tamagochi.this,mainModels);
        recyclerView.setAdapter(tamagochiAdapter);
    }
}