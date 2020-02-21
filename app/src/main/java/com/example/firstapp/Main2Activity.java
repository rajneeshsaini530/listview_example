package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent in = getIntent();

        String name = in.getStringExtra("Name");
        String mobile = in.getStringExtra("Value");

        Toast.makeText(this, "Name : "+name+"\nMobile : "+mobile, Toast.LENGTH_SHORT).show();

        TextView textView = findViewById(R.id.text);
        textView.setText("Name : "+name+"\nMobile : "+mobile);
    }
}
