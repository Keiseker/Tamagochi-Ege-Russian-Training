package jl.eg.rus.tn.russianege;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class TamagochiAdapter extends RecyclerView.Adapter<TamagochiAdapter.ViewHolder> {

    ArrayList<TamagochiModel> mainModels;
    Context context;
    public TamagochiAdapter(Context context,ArrayList<TamagochiModel> mainModels){
        this.context = context;
        this.mainModels = mainModels;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_tamagochi,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.imageView.setImageResource(mainModels.get(position).getImage());
    }


    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            linearLayout = itemView.findViewById(R.id.linear_layout);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position == 1) {
                AlertDialog.Builder buil = new AlertDialog.Builder(context);
                final View view1 = LayoutInflater.from(context).inflate(R.layout.dialog_edit,null);
                buil.setView(view1);
                buil.setPositiveButton("Подтвердить", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, Menu.class);
                        EditText editText = view1.findViewById(R.id.edit_text);
                        String getMessage = editText.getText().toString();
                        intent.putExtra("pet", R.drawable.orange_cat);
                        intent.putExtra("message", getMessage);
                        context.startActivity(intent);
                    }//конец onClick для позитивной кнопки диалога
                });//конец onClickListener для позитивной кнопки диалога

                buil.setNegativeButton("Назад", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }//конец onClick для иконки
                });//конец onClickListener для иконки

                AlertDialog ale1 = buil.create();
                ale1.show();
            }
            else if(position == 2){
                AlertDialog.Builder buil = new AlertDialog.Builder(context);
                final View view1 = LayoutInflater.from(context).inflate(R.layout.dialog_edit,null);
                buil.setView(view1);
                buil.setPositiveButton("Подтвердить", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, Menu.class);
                        EditText editText = view1.findViewById(R.id.edit_text);
                        String getMessage = editText.getText().toString();
                        intent.putExtra("pet", R.drawable.red_dragon);
                        intent.putExtra("message", getMessage);
                        context.startActivity(intent);
                    }//конец onClick для позитивной кнопки диалога
                });//конец onClickListener для позитивной кнопки диалога

                buil.setNegativeButton("Назад", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }//конец onClick для иконки
                });//конец onClickListener для иконки

                AlertDialog ale1 = buil.create();
                ale1.show();
            }
            else  if(position == 3){
                AlertDialog.Builder buil = new AlertDialog.Builder(context);
                final View view1 = LayoutInflater.from(context).inflate(R.layout.dialog_edit,null);
                buil.setView(view1);
                buil.setPositiveButton("Подтвердить", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, Menu.class);
                        EditText editText = view1.findViewById(R.id.edit_text);
                        String getMessage = editText.getText().toString();
                        intent.putExtra("pet", R.drawable.green_dragon);
                        intent.putExtra("message", getMessage);
                        context.startActivity(intent);
                    }//конец onClick для позитивной кнопки диалога
                });//конец onClickListener для позитивной кнопки диалога

                buil.setNegativeButton("Назад", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }//конец onClick для иконки
                });//конец onClickListener для иконки

                AlertDialog ale1 = buil.create();
                ale1.show();
            }
            else{
                AlertDialog.Builder buil = new AlertDialog.Builder(context);
                final View view1 = LayoutInflater.from(context).inflate(R.layout.dialog_edit,null);
                buil.setView(view1);
                buil.setPositiveButton("Подтвердить", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, Menu.class);
                        EditText editText = view1.findViewById(R.id.edit_text);
                        String getMessage = editText.getText().toString();
                        intent.putExtra("pet", R.drawable.gray_cat);
                        intent.putExtra("message", getMessage);
                        context.startActivity(intent);
                    }//конец onClick для позитивной кнопки диалога
                });//конец onClickListener для позитивной кнопки диалога

                buil.setNegativeButton("Назад", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }//конец onClick для иконки
                });//конец onClickListener для иконки

                AlertDialog ale1 = buil.create();
                ale1.show();
            }
        }
    }

}

