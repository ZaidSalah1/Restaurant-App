package com.example.myappfood.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.myappfood.R;
import com.example.myappfood.adapter.HomeHorAdapter;
import com.example.myappfood.adapter.HomeVerAdapter;
import com.example.myappfood.adapter.UpdateVerticalRec;
import com.example.myappfood.model.HomeHorModel;
import com.example.myappfood.model.HomeVerModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    RecyclerView recyclerView;
    ArrayList<HomeVerModel> homeVerModelsList;
    HomeVerAdapter homeVerAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        recyclerView = root.findViewById(R.id.home_Ver_rec);

        ///////////////////////////////////Home Vertical Adapter\\\\\\\\\\\\\\\\\\\\\\\\\\

        homeHorModelList = new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"HamBurger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"Fried"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        ///////////////////////////////////Home Vertical Adapter\\\\\\\\\\\\\\\\\\\\\\\\\\

        homeVerModelsList = new ArrayList<>();
        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelsList);
        recyclerView.setAdapter(homeVerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;

    }

    @Override
    public void callBack(int postion, ArrayList<HomeVerModel> list) {
        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(homeVerAdapter);
    }
}