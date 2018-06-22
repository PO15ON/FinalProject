package com.example.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String joke;
    public static TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeText = findViewById(R.id.joke_text2);

        joke = getIntent().getStringExtra("joke");

        jokeText.setText(joke);
    }
}
