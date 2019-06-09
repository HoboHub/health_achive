package com.example.healthapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class App3Activity extends Activity {

    private ProgressBar pgsBar;
    Button button;
    TextView textElement;
    Animation animFadein;
    ImageView PIKA;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        //pgsBar = (ProgressBar) findViewById(R.id.progressBar);
        //pgsBar.getProgress();
        //textElement = (TextView) findViewById(R.id.tv3);
        //textElement.setText((CharSequence) pgsBar);
        //PIKA = (ImageView) findViewById(R.id.imageView3);
        //animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
        //        R.anim.fade_in);
        //PIKA.startAnimation(animFadein);
    }

}
