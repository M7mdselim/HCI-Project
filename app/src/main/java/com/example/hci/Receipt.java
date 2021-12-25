package com.example.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Receipt extends AppCompatActivity {
    private TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        int nt=getIntent().getIntExtra("numberoftea",0);
        int nc=getIntent().getIntExtra("numberofcafe",0);
        int nl=getIntent().getIntExtra("numberoflate",0);
        int ne=getIntent().getIntExtra("numberofespresso",0);
        int nm=getIntent().getIntExtra("numberofmocca",0);
        int nh=getIntent().getIntExtra("numberofhot",0);
        textView1=findViewById(R.id.one);
        textView1.setText(("Tea.........................."+nt+"\n"+"Coffee........................"+nc+"\n"+"late........................."+nl+"\n"+"Espresso....................."+ne+"\n"+"Mocca........................"+nm+"\n"+"Hot Chocolate................"+nh).toString());


    }
public void button4(View view){
    Intent restart = new Intent(Receipt.this, Menu.class);
    startActivity(restart);

}
}