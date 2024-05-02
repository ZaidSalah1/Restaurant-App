package com.example.myappfood.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myappfood.R;
import com.example.myappfood.adapter.DailyMealAdapter;
import com.example.myappfood.model.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> list;
    DailyMealAdapter dailyMealAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.Daily_RecyclerView);
        list = new ArrayList<>();
        //int image, String name, String discount, String description

        list.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","Discount 20%","description"));
        list.add(new DailyMealModel(R.drawable.lunch,"Lunch","Discount 25%","description"));
        list.add(new DailyMealModel(R.drawable.coffe,"Drinks","Discount 5%","description"));
        list.add(new DailyMealModel(R.drawable.sweets,"Sweets","Discount 10%","description"));

        dailyMealAdapter = new DailyMealAdapter(getActivity(),list);
        recyclerView.setAdapter(dailyMealAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;
    }
}
