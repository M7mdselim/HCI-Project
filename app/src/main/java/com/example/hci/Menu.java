package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    int numbercafe=0;
    int numbertea =0;
    int numberesprsso=0;
    int numberlate =0;
    int numbermocca=0;
    int numberhot=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void tea(View view) {
        Toast.makeText(this, "Added to Receipt", Toast.LENGTH_SHORT).show();

        numbertea++;
    }
    public void cofe(View view) {

        Toast.makeText(this, "Added to Receipt", Toast.LENGTH_SHORT).show();
        numbercafe++;
    }

    public void latte(View view) {
        Toast.makeText(this, "Added to Receipt", Toast.LENGTH_SHORT).show();
        numberlate++;
    }

    public void esspresso(View view) {
        Toast.makeText(this, "Added to Receipt", Toast.LENGTH_SHORT).show();
        numberesprsso++;
    }

    public void mocca(View view) {
        Toast.makeText(this, "Added to Receipt", Toast.LENGTH_SHORT).show();
        numbermocca++;
    }

    public void hotchocolate(View view) {
        Toast.makeText(this, "Added to Receipt", Toast.LENGTH_SHORT).show();
        numberhot++;
    }
    public void order(View view) {
        Intent go = new Intent(this , Receipt.class);

        go.putExtra("numberoftea",numbertea);
        go.putExtra("numberofcafe",numbercafe);
        go.putExtra("numberoflate",numberlate);
        go.putExtra("numberofespresso",numberesprsso);
        go.putExtra("numberofmocca",numbermocca);
        go.putExtra("numberofhot",numberhot);
        startActivity(go);
}}