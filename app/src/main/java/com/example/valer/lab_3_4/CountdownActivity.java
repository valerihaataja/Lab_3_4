package com.example.valer.lab_3_4;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CountdownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

        Intent intent = getIntent();
        String aika = intent.getStringExtra("aika");

        final TextView timer_textview = findViewById(R.id.timer_textview);


        long kesto = Integer.parseInt(aika)*1000;       //kerrotaan tuhannella->millis

        new CountDownTimer(kesto,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer_textview.setText(String.valueOf(millisUntilFinished/1000));       //muutetaan sekunneiksi
            }

            @Override
            public void onFinish() {
                finish();
                Toast.makeText(CountdownActivity.this, "Aika päättyi", Toast.LENGTH_LONG).show();
            }
        }.start();
    }
}
