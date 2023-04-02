package com.example.decimaltobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cal_t0_farenhight extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_t0_farenhight);
        initcomp();
        settinguplistners();
    }

    private void settinguplistners()
    {
        btn.setOnClickListener(view->{
            int cel = Integer.parseInt(num.getText().toString());
            int fah = ((cel*9)/5)+32;
            res.setText("Fahrenheit "+fah);
        });
    }
    private void initcomp()
    {
        num = findViewById(R.id.myNum);
        res = findViewById(R.id.res);
        btn = findViewById(R.id.btnC);
    }
}