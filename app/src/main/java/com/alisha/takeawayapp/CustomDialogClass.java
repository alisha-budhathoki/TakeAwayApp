package com.alisha.takeawayapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomDialogClass extends Dialog {
    public Activity c;
    public Dialog d;
    public Button yes, no;
    Button login;
    Context context;
    ImageView crossImg;

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
//        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("dnsdsda");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_take_mart);
            crossImg = findViewById(R.id.img_cross);

//        login = findViewById(R.id.btnLoginLL);
        crossImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("sjs");
                dismiss();
            }
        });

    }
}
