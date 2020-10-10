package com.example.op_ampcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity4 extends AppCompatActivity {
    EditText v1,v2,fr1,fr2,vo,g;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
        v1=findViewById(R.id.vs1);
        v2=findViewById(R.id.vs2);
        fr1=findViewById(R.id.r1);
        fr2=findViewById(R.id.r2);
        vo=findViewById(R.id.vo);
        g=findViewById(R.id.g);
        b=findViewById(R.id.cl);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double vs1 =Double.parseDouble(v1.getText().toString());
                Double r1=Double.parseDouble(fr1.getText().toString());
                Double r2 =Double.parseDouble(fr2.getText().toString());
                Double vs2 =Double.parseDouble(v2.getText().toString());
                Double gain=(r2/r1);
                Double vd=(vs2)-(vs1);
                Double out=gain*vd;
                g.setText(String.valueOf(gain));
                vo.setText(String.valueOf(out));
            }
        });


    }
}
