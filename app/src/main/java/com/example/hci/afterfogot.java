package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterfogot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterfogot);
    }
    public  void button2(View view){
        Button button = findViewById(R.id.button2);
        Intent forgot = new Intent(afterfogot.this , newpass.class);
        startActivity(forgot);
}}