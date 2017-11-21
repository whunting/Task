package com.example.hunting.task1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = (TextView) findViewById((R.id.tv_hello));
        tv_hello.setText("hunting");
        tv_hello.setTextColor(Color.LTGRAY);
        tv_hello.setTextSize(30);
    }
}
