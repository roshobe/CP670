package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button StartChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StartChat = (Button) findViewById(R.id.StartChatButton);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartChat.setOnClickListener(StartChatListener);


    }

    private View.OnClickListener StartChatListener = v -> {
        // do something when the button is clicked
        // Yes we will handle click here but which button clicked??? We don't know

        Intent intent = new Intent(this, ChatWindow.class);
        startActivity(intent);
    };
}