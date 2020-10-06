package com.alisha.takeawayapp.bottomNavItems;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alisha.takeawayapp.R;
import com.alisha.takeawayapp.TakeFoodActivity;
import com.alisha.takeawayapp.TakeMartActivity;

public class HomeFragment extends Fragment {
    FrameLayout takeFood, takeMart, takeSend;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragement_home, container, false);
        takeFood = view.findViewById(R.id.menuTkFood);
        takeMart = view.findViewById(R.id.menuTkMart);
        takeSend = view.findViewById(R.id.menuTkSnd);

        takeFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TakeFoodActivity.class);
//        intent.putExtra(CommonConstants.INTENT_EXTRA_MERCHANT_TYPE, CommonConstants.DEAL_TYPE_TAKE_FOOD);
                startActivity(intent);
            }
        });

        takeMart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TakeMartActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
