package com.example.lab06.lab06_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                redirect();
            }
        }, 5000);







    }

    void redirect(){

        Intent show = new Intent(this, Main2Activity.class);

        startActivity(show);

        finish();
    }

}
