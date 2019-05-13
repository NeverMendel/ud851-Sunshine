package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView weatherDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent originatingIntent = getIntent();

        weatherDisplayTextView = (TextView) findViewById(R.id.weather_display);

        if(originatingIntent.hasExtra(Intent.EXTRA_TEXT)){
            weatherDisplayTextView.setText(originatingIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}