package com.alisha.takeawayapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.alisha.takeawayapp.R;
import com.alisha.takeawayapp.model.TakeFood;

import java.util.List;

public class TakeFoodAdapter extends RecyclerView.Adapter<TakeFoodAdapter.MyViewHolder> {
    List<TakeFood> mList;
    Context context;
    public TakeFoodAdapter(List<TakeFood> mList, Context context) {
        System.out.println("jndsd");
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        System.out.println("dsksre");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_take_food, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final TakeFood takeFood =mList.get(position);
        holder.sucessImage.setImageResource(takeFood.getFoodImg());
        holder.sucessTitle.setText(takeFood.getFoodTitle());


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        ImageView sucessImage;
        TextView sucessTitle, sucessDesc;
        CardView cardViewSucess;
        public MyViewHolder(View itemView) {
            super(itemView);

            sucessImage = (ImageView) itemView.findViewById(R.id.sucess_image);
            sucessTitle = itemView.findViewById(R.id.sucess_name);
//            sucessDesc = itemView.findViewById(R.id.sucessDesc);
        }


    }
}
