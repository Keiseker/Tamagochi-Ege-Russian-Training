package jl.eg.rus.tn.russianege;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterTheory extends RecyclerView.Adapter<AdapterTheory.ViewHolder> {

    ArrayList<ModelTheory> mainModels;
    Context context;

    public AdapterTheory(Context context, ArrayList<ModelTheory> mainModels) {
        this.context = context;
        this.mainModels = mainModels;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.task.setText(mainModels.get(position).getTask());
        holder.number.setText(mainModels.get(position).getNumber());
        holder.btn.setText(mainModels.get(position).getBtn());
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView task, number, btn;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.btn);
            task = itemView.findViewById(R.id.task);
            number = itemView.findViewById(R.id.number);
            linearLayout = itemView.findViewById(R.id.linear_layout);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position == 1) {
                Intent intent = new Intent(context, Theory_2.class);
                context.startActivity(intent);
            }
            else if (position == 2) {
                    Intent intent2 = new Intent(context, Theory_3.class);
                    context.startActivity(intent2);
            } else if (position == 3) {
                    Intent intent3 = new Intent(context, Theory_4.class);
                    context.startActivity(intent3);
            } else if (position == 4) {
                    Intent intent4 = new Intent(context, Theory_5.class);
                    context.startActivity(intent4);
            } else if (position == 5) {
                    Intent intent5 = new Intent(context, Theory_6.class);
                    context.startActivity(intent5);
            } else if (position == 6) {
                    Intent intent6 = new Intent(context, Theory_7.class);
                    context.startActivity(intent6);
            } else if (position == 7) {
                    Intent intent7 = new Intent(context, Theory_8.class);
                    context.startActivity(intent7);
            } else if (position == 8) {
                    Intent intent8 = new Intent(context, Theory_9.class);
                    context.startActivity(intent8);
            } else if (position == 9) {
                    Intent intent9 = new Intent(context, Theory_10.class);
                    context.startActivity(intent9);
            } else if (position == 10) {
                    Intent intent10 = new Intent(context, Theory_11.class);
                    context.startActivity(intent10);
            } else if (position == 11) {
                    Intent intent11 = new Intent(context, Theory_12.class);
                    context.startActivity(intent11);
            } else if (position == 12) {
                    Intent intent12 = new Intent(context, Theory_13.class);
                    context.startActivity(intent12);
            } else if (position == 13) {
                    Intent intent13 = new Intent(context, Theory_14.class);
                    context.startActivity(intent13);
            } else if (position == 14) {
                    Intent intent14 = new Intent(context, Theory_15.class);
                    context.startActivity(intent14);
               } else if (position == 15) {
                    Intent intent15 = new Intent(context, Theory_16.class);
                    context.startActivity(intent15);
            } else if (position == 16) {
                    Intent intent16 = new Intent(context, Theory_17.class);
                    context.startActivity(intent16);
            } else if (position == 17) {
                    Intent intent17 = new Intent(context, Theory_18.class);
                    context.startActivity(intent17);
            } else if (position == 18) {
                    Intent intent18 = new Intent(context, Theory_19.class);
                    context.startActivity(intent18);
            } else if (position == 19) {
                    Intent intent19 = new Intent(context, Theory_20.class);
                    context.startActivity(intent19);
            } else if (position == 20) {
                    Intent intent20 = new Intent(context, Theory_21.class);
                    context.startActivity(intent20);
            } else if (position == 21) {
                    Intent intent21 = new Intent(context, Theory_22.class);
                    context.startActivity(intent21);
            } else if (position == 22) {
                    Intent intent22 = new Intent(context, Theory_23.class);
                    context.startActivity(intent22);
            } else if (position == 23) {
                    Intent intent23 = new Intent(context, Theory_24.class);
                    context.startActivity(intent23);
            } else if (position == 24) {
                    Intent intent24 = new Intent(context, Theory_25.class);
                    context.startActivity(intent24);
               } else if (position == 25) {
                    Intent intent25 = new Intent(context, Theory_26.class);
                    context.startActivity(intent25);
            } else {
                    Intent intent1 = new Intent(context, Theory_1.class);
                    context.startActivity(intent1);
            }



        }
    }
}

