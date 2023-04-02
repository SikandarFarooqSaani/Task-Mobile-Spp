package com.example.decimaltobinary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class cmtofeet extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmtofeet);
        initcomp();
        settinguplistners();
    }
    private void settinguplistners()
    {
        btn.setOnClickListener(view->{
            int cm = Integer.parseInt(num.getText().toString());
            float feet = 0.0328f*cm;
            res.setText("Feet "+feet);
//            int cm = Integer.parseInt(num.getText());
//            int feet = 0.0328*cm;
        });
    }
    private void initcomp()
    {
        num = findViewById(R.id.myNum);
        res = findViewById(R.id.res);
        btn = findViewById(R.id.btnC);
    }
}