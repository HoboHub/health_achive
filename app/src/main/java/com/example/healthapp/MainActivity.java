package com.example.healthapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        //button1.getBackground().setColorFilter(Color.parseColor("#89ba3a"), PorterDuff.Mode.MULTIPLY);
        //button2.getBackground().setColorFilter(Color.parseColor("#89ba3a"), PorterDuff.Mode.MULTIPLY);
        //button3.getBackground().setColorFilter(Color.parseColor("#89ba3a"), PorterDuff.Mode.MULTIPLY);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);

            }

        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App3Activity.class);
                startActivity(intent);

            }

        });

        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App4Activity.class);
                startActivity(intent);

            }

        });

    }

}