package com.example.mothupii_.googlemapsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Intent intent1 = new Intent(MainActivity.this, ContentProvider.class);
        startActivity(intent1);
    }

    public void onClick2(View view)
    {
        Intent intent1 = new Intent(MainActivity.this, Question2.class);
        startActivity(intent1);
    }

}
