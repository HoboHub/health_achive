package com.example.healthapp;


import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class App2Activity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox language = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        boolean checked = language.isChecked();

        TextView selection = (TextView) findViewById(R.id.selection);
        // Смотрим, какой именно из флажков отмечен
        switch(view.getId()) {
            case R.id.task1:
                if (checked){
                    selection.setText("Выпить Ношпу");
                    addNotification();
                    //ProgressBar health = (ProgressBar) findViewById(R.id.progressBar);
                    //health.incrementProgressBy(100);

                }
                break;
            case R.id.task2:
                if (checked)
                    selection.setText("Выпить Аспирин");
                    addNotification();
                //ProgressBar health = (ProgressBar) findViewById(R.id.progressBar);
                //health.incrementProgressBy(100);
                break;
        }
    }


    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.star)
                        .setContentTitle("+100 к здоровью")
                        .setContentText("Ваш питомец Вами гордится!");

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}