package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
public  void button1(View view){
    Button button = findViewById(R.id.button);
    Intent forgot = new Intent(forgotPassword.this , afterfogot.class);
    startActivity(forgot);


}
}