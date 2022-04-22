package com.arif.framelayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView dogImageView, lionImageView,monkeyImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dogImageView = findViewById(R.id.dogImageViewId);
        lionImageView = findViewById(R.id.lionImageViewId);
        monkeyImageView = findViewById(R.id.monkeyImageViewId);

        dogImageView.setOnClickListener(this);
        lionImageView.setOnClickListener(this);
        monkeyImageView.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.dogImageViewId){
            dogImageView.setVisibility(View.GONE);
            lionImageView.setVisibility(View.VISIBLE);
        }
        else if (view.getId()==R.id.lionImageViewId){
            lionImageView.setVisibility(View.GONE);
            monkeyImageView.setVisibility(View.VISIBLE);
        }
        else if (view.getId()==R.id.monkeyImageViewId){
            monkeyImageView.setVisibility(View.GONE);
            dogImageView.setVisibility(View.VISIBLE);
        }


    }

}