package com.example.movie_by_ann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //config for splash screen
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Splash_screen.this, MainActivity.class);
                        startActivity(i);
                        finish(); //finish can not back this activity splash screen
                    }
                },3000); //set 3000 millisecond = 3s
        };
}