package com.example.decimaltobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView res;
    EditText num;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initcomponent();
        print();
        settinguplistners();
    }
    private void print()
    {

    }

    private void settinguplistners()
    {
        btn.setOnClickListener(view->{

            int decimal = Integer.parseInt(num.getText().toString());
            String binary = Integer.toBinaryString(decimal);

            Integer.toBinaryString(decimal);
            res.setText("Binary = "+binary);
        });

    }

    private void initcomponent()
    {
        num = findViewById(R.id.myNum);
        res = findViewById(R.id.res);
        btn = findViewById(R.id.btnC);
    }
}