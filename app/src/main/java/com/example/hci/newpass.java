package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class newpass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpass);
    }
    public  void button3(View view){
        Button button = findViewById(R.id.button3);
        Intent forgot = new Intent(newpass.this , Menu.class);
        Toast.makeText(this, "Password Changed Successfully", Toast.LENGTH_LONG).show();
        startActivity(forgot);
}}