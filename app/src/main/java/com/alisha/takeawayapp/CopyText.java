package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CopyText extends AppCompatActivity {
    EditText enteredText;
    EditText copiedText;
    Button Copy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_text);
        Copy = (Button) findViewById(R.id.button1);
        enteredText = (EditText) findViewById(R.id.editText1);
        copiedText = (EditText) findViewById(R.id.editText2);
        Copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copiedText.setText(enteredText.getText().toString());
            }
        });}}

