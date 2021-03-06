package com.alisha.takeawayapp.bottomNavItems;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alisha.takeawayapp.R;
import com.alisha.takeawayapp.TakeFoodActivity;
import com.alisha.takeawayapp.TakeMartActivity;

public class SettingFragment extends Fragment {
    TextView textView1, textView2;
    EditText editText;
    Button sendButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragement_setting, container, false);
        editText = view.findViewById(R.id.ediText);
        textView1 = view.findViewById(R.id.tv_1);
        textView2 = view.findViewById(R.id.tv_2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("dksnsd");
                                editText.setText("Water");
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("Food");
            }
        });
        sendButton = view.findViewById(R.id.sendBtn);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Confirm.class);
//        intent.putExtra(CommonConstants.INTENT_EXTRA_MERCHANT_TYPE, CommonConstants.DEAL_TYPE_TAKE_FOOD);
                startActivity(intent);
            }
        });
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), Confirm.class);
//                startActivity(intent);
//            }
//        });
        return view;
    }
}
