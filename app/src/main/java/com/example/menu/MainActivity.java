package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleDialog.ExampleDialoglidtener {
private int numbercafe=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tea(View view) {
        openDialog();
    }
    public void openDialog(){
ExampleDialog exampleDialog=new ExampleDialog();
exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }

    @Override
    public void applyText(String numberofcafe) {
        numbercafe=Integer.getInteger(numberofcafe);
    }
}