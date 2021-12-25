package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username;
EditText password;
Button login;
TextView crtNewAcc;
TextView forgotPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.txt_user);
        password = findViewById(R.id.txt_pass);
        login = findViewById(R.id.btn_login);






    }

    public void click(View view) {
        setLogin();
    }
    public void setLogin(){
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();
        if (user.equals("admin") && pass.equals("admin")){
            Toast.makeText(this, "Username and Password Matched", Toast.LENGTH_LONG).show();

Intent menu = new Intent(MainActivity.this , Menu.class);

startActivity(menu);
        }
        else  {
            Toast.makeText(this, "Username and Password dosen't Matched", Toast.LENGTH_LONG).show();

        }
    }

    public void click_signup(View view) {
        Intent intent = new Intent(MainActivity.this , MainActivity2.class);
        startActivity(intent);

    }

    public void click_forgotPasswrod(View view) {
        Intent intent = new Intent(MainActivity.this , forgotPassword.class);
        startActivity(intent);

    }


}