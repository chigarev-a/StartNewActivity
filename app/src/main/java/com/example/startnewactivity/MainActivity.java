package com.example.startnewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextTextMessage);
    }

    public void onClickSendMessageActivity(View view) {
        Intent intent = new Intent(this, ActivityTwo.class);
        String msg = editTextMessage.getText().toString();
        intent.putExtra("message", msg);
        startActivity(intent);
    }

    public void onClickSendMessage(View view) {
    }
}