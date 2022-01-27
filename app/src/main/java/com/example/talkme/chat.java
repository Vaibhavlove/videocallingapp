package com.example.talkme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;




public class chat extends AppCompatActivity {

    EditText secretCode;
    Button joinBtn, shareBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        secretCode = findViewById(R.id.secretCode);
        joinBtn = findViewById(R.id.joinbtn);
        shareBtn = findViewById(R.id.sharebtn);




    }
}