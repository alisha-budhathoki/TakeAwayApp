package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.alisha.takeawayapp.Adapter.TakeFoodAdapter;
import com.alisha.takeawayapp.model.TakeFood;

import java.util.ArrayList;

public class TakeFoodActivity extends AppCompatActivity {
    private int[] myFoodImg = new int[]{R.drawable.img_sign_in, R.drawable.img_sign_in,R.drawable.img_sign_in, R.drawable.img_sign_in,R.drawable.img_sign_in};
    private String[] myFoodTitle = new String[]{"KFC","John Doe" ,"John Doe","John Doe","John Doe"};
    Context context;
    TakeFoodAdapter takeFoodAdapter;
    RecyclerView recyclerViewTakeFood;
    ArrayList<TakeFood> mListTakeFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_food);
        recyclerViewTakeFood = findViewById(R.id.recyclerTakeFood);
        mListTakeFood = seeFoods();
        takeFoodAdapter = new TakeFoodAdapter(mListTakeFood, context);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 3);
        recyclerViewTakeFood.setAdapter(takeFoodAdapter);
        recyclerViewTakeFood.setLayoutManager(linearLayoutManager);

    }

    private ArrayList<TakeFood> seeFoods() {
        System.out.println("dsjns");

        ArrayList<TakeFood> listFood = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TakeFood takeFood = new TakeFood();
            takeFood.setFoodTitle(myFoodTitle[i]);
            takeFood.setFoodImg(myFoodImg[i]);
//            System.out.println("ms"+takeFood.getFoodImg());
            listFood.add(takeFood);
        }
        return listFood;
    }
}