package com.example.bmicalculator;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button count = (Button) findViewById(R.id.count);
        final EditText height = (EditText) findViewById(R.id.heightField);
        final EditText weight = (EditText) findViewById(R.id.weightField);

        final TextView res = (TextView) findViewById(R.id.result);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int wgh = Integer.parseInt(weight.getText().toString());
            int hgh = Integer.parseInt(height.getText().toString());
            BMICount bmiCount = new BMICount(hgh,wgh);
            bmiCount.bmiCount();
            res.setText(bmiCount.category());

            }
        });
    }


}
