package com.example.op_ampcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.b1);
        b = findViewById(R.id.b2);
        c = findViewById(R.id.b3);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencctivity3();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity4();
            }
        });
    }

    public void openactivity2() {
        Intent i = new Intent(this, activity2.class);
        startActivity(i);
    }

    public void opencctivity3() {
        Intent i = new Intent(this, activity3.class);
        startActivity(i);
    }

    public void openactivity4() {
        Intent i = new Intent(this, activity4.class);
        startActivity(i);
    }
}






