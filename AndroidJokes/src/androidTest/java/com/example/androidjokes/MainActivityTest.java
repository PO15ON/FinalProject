package com.example.androidjokes;

import android.app.Instrumentation;

import static org.junit.Assert.*;

public class MainActivityTest extends Instrumentation {

    public void assertJokeNotEmpty(){
        assertNotNull(MainActivity.jokeText);
    }

}