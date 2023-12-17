package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        RelativeLayout button1 = findViewById(R.id.myButton);
        TextView textView = button1.findViewById(R.id.myTextView);
        button1.setOnClickListener(v -> {
            Drawable drawable = getResources().getDrawable(R.drawable.back1);
            button1.setBackground(drawable);
        });
    }


}