package com.example.myappfood.adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myappfood.R;
import com.example.myappfood.model.HomeHorModel;
import com.example.myappfood.model.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder >{

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    List<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, List<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horezontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel("Pizza1", R.drawable.pizza4, "10$", "10:00 - 21:00", "5.9"));
            homeVerModels.add(new HomeVerModel("Pizza2", R.drawable.pizza2, "25$", "10:00 - 24:00", "5.9"));
            homeVerModels.add(new HomeVerModel("Pizza3", R.drawable.pizza3, "15$", "10:00 - 22:00", "5.9"));
            homeVerModels.add(new HomeVerModel("Pizza4", R.drawable.pizza1, "30$", "10:00 - 20:00", "5.9"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();
                    if(row_index == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel("Pizza1",R.drawable.pizza4,"10$","10:00 - 21:00","4.9"));
                        homeVerModels.add(new HomeVerModel("Pizza2",R.drawable.pizza2,"25$","10:00 - 24:00","3.9"));
                        homeVerModels.add(new HomeVerModel("Pizza3",R.drawable.pizza3,"15$","10:00 - 22:00","4.9"));
                        homeVerModels.add(new HomeVerModel("Pizza4",R.drawable.pizza1,"30$","10:00 - 20:00","4.9"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if(row_index == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel("Burger1",R.drawable.burger1,"10$","10:00 - 21:00","4.9"));
                        homeVerModels.add(new HomeVerModel("Burger2",R.drawable.burger2,"25$","10:00 - 24:00","3.9"));
                        homeVerModels.add(new HomeVerModel("Burger3",R.drawable.burger4,"30$","10:00 - 20:00","4.9"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if(row_index == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel("Fries1",R.drawable.fries1,"10$","10:00 - 21:00","5.9"));
                        homeVerModels.add(new HomeVerModel("Fries2",R.drawable.fries2,"25$","10:00 - 24:00","5.9"));
                        homeVerModels.add(new HomeVerModel("Fries3",R.drawable.fries3,"30$","10:00 - 20:00","5.9"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if(row_index == 3){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel("Ice cream1",R.drawable.icecream2,"10$","10:00 - 21:00","5.9"));
                        homeVerModels.add(new HomeVerModel("Ice cream2",R.drawable.icecream3,"25$","10:00 - 24:00","5.9"));
                        homeVerModels.add(new HomeVerModel("Ice cream3",R.drawable.icecream4,"30$","10:00 - 20:00","5.9"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }else if(row_index == 4){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel("Sandwich",R.drawable.sandwich1,"10$","10:00 - 21:00","5.9"));
                        homeVerModels.add(new HomeVerModel("Sandwich",R.drawable.sandwich2,"25$","10:00 - 24:00","5.9"));
                        homeVerModels.add(new HomeVerModel("Sandwich",R.drawable.sandwich3,"30$","10:00 - 20:00","5.9"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });//End Click

            if(select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }else{
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pizza_hor_img);
            name = itemView.findViewById(R.id.txt_hor);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
