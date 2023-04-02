package com.example.decimaltobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    EditText num;
    EditText num2345;
    TextView res;
    Button btn;

    Button btn2;

    Button btn3;

    Button btn4;

    Button btn5;

    Button btn6;

    Button btn7;
    Button btn8;

    Button btn9;

    Button btn10;

    Button btn11;

    Button btn12;

    Button btn13;

    Button btn14;

    Button btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        initcomp();
        settinguplistners();
    }

    private void settinguplistners()
    {
        btn.setOnClickListener(view->{
            int num21 = Integer.parseInt(num2345.getText().toString());
            int num20 = Integer.parseInt(num.getText().toString());
            int Addition = num20 + num21;
            res.setText("Result "+Addition);

        });

        btn2.setOnClickListener(view->{
            int num19 = Integer.parseInt(num2345.getText().toString());
            int num18 = Integer.parseInt(num.getText().toString());
            int Subtraction = num18 - num19;
            res.setText("Result "+Subtraction);
        });

        btn3.setOnClickListener(view->{
            int num17 = Integer.parseInt(num2345.getText().toString());
            int num16 = Integer.parseInt(num.getText().toString());
            int Multiplication = num16 * num17;
            res.setText("Result "+Multiplication);
        });

        btn4.setOnClickListener(view->{
            float num15 = Integer.parseInt(num2345.getText().toString());
            float num14 = Integer.parseInt(num.getText().toString());
            float Division = num14 / num15;
            res.setText("Result "+Division);
        });

        btn5.setOnClickListener(view->{
            int num13 = Integer.parseInt(num2345.getText().toString());
            int num12 = Integer.parseInt(num.getText().toString());
            int mod = num12 % num13;
            res.setText("Result "+mod);
        });

        btn6.setOnClickListener(view->{
            double num11 = Integer.parseInt(num2345.getText().toString());
            double num10 = Integer.parseInt(num.getText().toString());
            double power = Math.pow(num10, num11);
            res.setText("Result "+power);
        });

        btn7.setOnClickListener(view->{

            double num9 = Integer.parseInt(num.getText().toString());
            double sin = Math.sin(num9);
            res.setText("Result "+sin);

        });
        btn10.setOnClickListener(view->{

            double num1 = Integer.parseInt(num.getText().toString());
            double log = Math.log(num1);
            res.setText("Result "+log);

        });

        btn11.setOnClickListener(view->{

            double num2 = Integer.parseInt(num.getText().toString());
            double log1 = Math.log10(num2);
            res.setText("Result "+log1);

        });

        btn12.setOnClickListener(view->{

            double num3 = Integer.parseInt(num.getText().toString());
            double ceel = Math.ceil(num3);
            res.setText("Result "+ceel);

        });

        btn9.setOnClickListener(view->{

            double num4 = Integer.parseInt(num.getText().toString());
            double Tan = Math.tan(num4);
            res.setText("Result "+Tan);

        });

        btn8.setOnClickListener(view->{

            double num5 = Integer.parseInt(num.getText().toString());
            double cos = Math.cos(num5);
            res.setText("Result "+cos);

        });

        btn13.setOnClickListener(view->{

            double num6 = Integer.parseInt(num.getText().toString());
            double flor = Math.floor(num6);
            res.setText("Result "+flor);

        });

        btn14.setOnClickListener(view->{

            double num7 = Integer.parseInt(num.getText().toString());
            double sqr = Math.sqrt(num7);
            res.setText("Result "+sqr);

        });

        btn15.setOnClickListener(view->{

            float num8 = Integer.parseInt(num.getText().toString());
            float rnd = Math.round(num8);
            res.setText("Result "+rnd);

        });

    }
    private void initcomp()
    {
        num = findViewById(R.id.myNum);
        num2345 = findViewById(R.id.myNum23456);
        res= findViewById(R.id.res);
        btn = findViewById(R.id.btnC);
        btn2 = findViewById(R.id.btnSub);
        btn3 = findViewById(R.id.btnMul);
        btn4 = findViewById(R.id.btndiv);
        btn5 = findViewById(R.id.btnMod);
        btn6 = findViewById(R.id.btnpow);
        btn7 = findViewById(R.id.btnsin);
        btn8 = findViewById(R.id.btncos);
        btn9 = findViewById(R.id.btntan);
        btn10 = findViewById(R.id.btnlog);
        btn11 = findViewById(R.id.btnlog10);
        btn12= findViewById(R.id.ceiling);
        btn13 = findViewById(R.id.floor);
        btn14 = findViewById(R.id.squareroot);
        btn15 = findViewById(R.id.round);
    }
}