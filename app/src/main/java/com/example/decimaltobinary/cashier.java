package com.example.decimaltobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cashier extends AppCompatActivity {

    EditText num;

    Button btn;

    TextView res100;
    TextView res50;
    TextView res10;
    TextView res1;
    TextView restot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier);
        initcomp();
        settinguplistners();
    }

    private void settinguplistners()
    {
        btn.setOnClickListener(view -> {
            int amount = Integer.parseInt(num.getText().toString());
            int samount = amount * 100;

            int notes100 = samount / 10000;
            samount %= 10000;


            int notes50 = samount / 5000;
            samount %= 5000;


            int notes10 = samount / 1000;
            samount %= 1000;


            int notes1 = samount / 100;


            int totalnotes = notes100 + notes50 + notes10 + notes1;

            res100.setText("Notes of 100 = "+notes100);
            res50.setText("Notes of 50 = "+notes50);
            res10.setText("Notes of 10 = "+notes10);
            res1.setText("Notes of 1 = "+notes1);
            restot.setText("Total no of Notes = "+totalnotes);
        });
    }
    private void initcomp()
    {
        num = findViewById(R.id.myNumm);
        btn = findViewById(R.id.btnCC);
        res100 = findViewById(R.id.res100);
        res50 = findViewById(R.id.res50);
        res10 = findViewById(R.id.res10);
        res1 = findViewById(R.id.res1);
        restot = findViewById(R.id.resTot);
    }
}