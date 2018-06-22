package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.javajokes.JavaJokes;


public class MainActivity extends AppCompatActivity {

    // TODO: 6/22/18 create res for each flavor (stopped here)
    public static final String TAG = "joke";
    Button jokeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        jokeBtn = findViewById(R.id.joke_btn);
        jokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JavaJokes jokeRetreiver = new JavaJokes();
                String joke = jokeRetreiver.getJoke();

                Log.d(TAG, "tellJoke: " + joke);

                new EndpointsAsyncTask().execute(new Pair<Context, String>(MainActivity.this, joke));

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
