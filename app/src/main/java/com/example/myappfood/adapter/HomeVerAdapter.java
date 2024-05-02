package com.example.myappfood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myappfood.R;
import com.example.myappfood.model.HomeVerModel;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.ViewHoler> {


    Context context;
    ArrayList<HomeVerModel> list;

    public HomeVerAdapter(Context context, ArrayList<HomeVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeVerAdapter.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //This is where you inflate the layout (Giving a look at our rows)
        return new ViewHoler(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVerAdapter.ViewHoler holder, int position) {
        //assigning values to the view we created in the recyclerViewRow layout file
        //based on the postion of the recycler view
        holder.imageView.setImageResource(list.get(position).getImg());
        holder.tvName.setText(list.get(position).getName());
        holder.tvPrice.setText(list.get(position).getPrice());
        holder.tvRate.setText(list.get(position).getRate());
        holder.tvTime.setText(list.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHoler extends RecyclerView.ViewHolder {
        //grabbing the view from our recycler layout file
        //Kinda like the onCreate method

        ImageView imageView;
        TextView tvName, tvPrice, tvRate, tvTime;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pizza_ver_img);
            tvName = itemView.findViewById(R.id.txtNameVer);
            tvPrice = itemView.findViewById(R.id.txtPriceVer);
            tvTime = itemView.findViewById(R.id.txtTimeVer);
            tvRate = itemView.findViewById(R.id.rating);
        }
    }
}

