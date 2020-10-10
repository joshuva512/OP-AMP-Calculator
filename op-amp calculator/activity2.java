package com.example.op_ampcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity2 extends AppCompatActivity {
    EditText vi,r1,r2,vo,g;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        vi=findViewById(R.id.vin);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r1);
        vo=findViewById(R.id.vo);
        g=findViewById(R.id.g);
        b=findViewById(R.id.cl);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double vin =Double.parseDouble(vi.getText().toString());
                Double rf=Double.parseDouble(r1.getText().toString());
                Double ri =Double.parseDouble(r2.getText().toString());
                Double gain=-1*(rf/ri);
                Double out=gain*vin;
                g.setText(String.valueOf(gain));
                vo.setText(String.valueOf(out));
            }
        });



    }
}
