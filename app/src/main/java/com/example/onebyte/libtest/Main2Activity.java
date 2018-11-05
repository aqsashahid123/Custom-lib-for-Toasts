package com.example.onebyte.libtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.customlibmodule.CustomToast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    CustomToast customToast;
    Button boomButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boomButton = (Button) findViewById(R.id.boomButton);
        boomButton.setOnClickListener(this);
        customToast = new CustomToast();
       }

    @Override
    public void onClick(View view) {
        customToast.showToast(Main2Activity.this,"MyToast",true);

    }
}
