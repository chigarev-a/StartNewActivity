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
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String msg = editTextMessage.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(chosenIntent);
    }
}