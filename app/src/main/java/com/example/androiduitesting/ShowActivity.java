package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity  {

    TextView cityText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityText = findViewById(R.id.city_text);
        backButton = findViewById(R.id.button_back);

        /*
        Author: Kenneth https://stackoverflow.com/users/196522/kenneth
        Title: Android : When do we use getIntent()?
        Answer: https://stackoverflow.com/a/26722103
        Date: 2014-11-03
        License: CC-BY-SA 3.0
        */

        Intent intent = getIntent();
        String cityName = intent.getStringExtra("cityName");
        cityText.setText(cityName);

        backButton.setOnClickListener(v -> finish());
    }
}
