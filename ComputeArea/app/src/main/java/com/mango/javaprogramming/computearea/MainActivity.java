package com.mango.javaprogramming.computearea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tvResult);
        tv.setText(String.valueOf(computeArea()));
    }

    double computeArea(){
        double radius;
        double area;
        final double PI = 3.1415926;
        radius = 20;

        area = radius * radius * PI;

        return area;
    }
}
