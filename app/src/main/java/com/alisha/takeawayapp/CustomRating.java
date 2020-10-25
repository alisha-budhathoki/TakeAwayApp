package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class CustomRating extends AppCompatActivity {
    Handler defaultRatingBarHandler ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_rating);
        setTitle("dev2qa.com - RatingBar Example");

        // Get first rating bar.
//        final RatingBar ratingBarDefault = (RatingBar)findViewById(R.id.ratingBarDefault);

        // First rating bar can not be modified manually.
//        ratingBarDefault.setIsIndicator(true);

        // Set first rating bar's listener.
//        ratingBarDefault.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            TextView ratingBarDefaultInfo = (TextView)findViewById(R.id.ratingBarDefaultInfo);
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float ratingValue, boolean fromUser) {
//                int currentProgress = ratingBarDefault.getProgress();
//                ratingBarDefaultInfo.setText("Current start number is " + ratingValue + ", Progress number is " + currentProgress);
//            }
//        });

//        defaultRatingBarHandler = new Handler(){
//            @Override
//            public void handleMessage(Message msg) {
//                if(msg.what==1) {
//                    float currRating = ratingBarDefault.getRating();
//                    if(currRating==ratingBarDefault.getNumStars())
//                    {
//                        currRating = 0;
//                    }
//                    float stepSize = ratingBarDefault.getStepSize();
//
//                    float newRating = currRating + stepSize;
//                    ratingBarDefault.setRating(newRating);
//                }
//            }
//        };

//        new Thread(){
//            @Override
//            public void run() {
//                try {
//                    while(true) {
//                        Message msg = new Message();
//                        msg.what = 1;
//                        defaultRatingBarHandler.sendMessage(msg);
//                        Thread.sleep(1000);
//                    }
//                }catch (Exception ex)
//                {
//                    ex.printStackTrace();
//                }
//            }
//        }.start();
//

        // Second rating bar is customized.
        final RatingBar ratingBarCustom = (RatingBar)findViewById(R.id.ratingBarCustom);
        TextView tvBabReview = findViewById(R.id.badReview);
        Button btnContinue = findViewById(R.id.btn_submit);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(CustomRating.this, UploadPicture.class);
                startActivity(intent);
            }
        });
        tvBabReview.setPaintFlags(tvBabReview.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        ratingBarCustom.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float ratingValue, boolean fromUser) {
                System.out.println("dsjanjhsabhsj"+ratingBar.getRating());
                int currentProgress = ratingBarCustom.getProgress();
//                ratingBarCustomInfo.setText("Current start number is " + ratingValue + ", Progress number is " + currentProgress);
            }
        });
    }
}