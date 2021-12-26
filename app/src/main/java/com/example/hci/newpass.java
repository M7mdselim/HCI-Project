package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class newpass extends AppCompatActivity {
EditText pass ;
EditText confPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpass);
        pass = findViewById(R.id.editTextTextPersonName3);
        confPass = findViewById(R.id.editTextTextPersonName4);
    }
    public  void button3(View view){
        if (pass.getText()==(confPass.getText()) ){
        Button button = findViewById(R.id.button3);
            Toast.makeText(this, "Password Changed Successfully", Toast.LENGTH_LONG).show();
        Intent forgot = new Intent(newpass.this , Menu.class);

        startActivity(forgot);}
        else {
            Toast.makeText(this, "Please check ur Entry", Toast.LENGTH_LONG).show();

        }

}}