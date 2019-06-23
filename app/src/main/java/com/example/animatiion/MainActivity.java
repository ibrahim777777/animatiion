package com.example.animatiion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView fff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fff=findViewById(R.id.imageView);
    }

    public void start(View view) {
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.mixanimation);
        fff.startAnimation(animation1);

    }
}
