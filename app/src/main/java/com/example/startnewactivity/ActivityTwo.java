package com.example.startnewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent intent = getIntent();
        TextView textViewActivityTwo = findViewById(R.id.textViewActivityTwo);
        textViewActivityTwo.setText(intent.getStringExtra("message"));
    }
}