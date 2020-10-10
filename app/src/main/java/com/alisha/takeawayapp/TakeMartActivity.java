package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TakeMartActivity extends AppCompatActivity {
TextView sdhd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);
//        sdhd = findViewById(R.id.sdmjdns);
//        sdhd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CustomDialogClass cdd = new CustomDialogClass(TakeMartActivity.this);
//                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
////                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                cdd.show();
//            }
//        });
    }
}