package com.example.fitbalance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {
    CardView workPage,fitPage,socioP,sleepC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        workPage=findViewById(R.id.workCard);
        sleepC=findViewById(R.id.sleepCard);
        fitPage=findViewById(R.id.fitnessC);
        socioP=findViewById(R.id.socioC);
        workPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPage.this, WorkPage.class);
                startActivity(intent);
            }
        });
        sleepC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPage.this, WorkPage.class);
                startActivity(intent);
            }
        });
        fitPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPage.this, WorkPage.class);
                startActivity(intent);
            }
        });
        socioP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPage.this, WorkPage.class);
                startActivity(intent);

            }
        });
    }
}