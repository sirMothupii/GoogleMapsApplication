package com.example.mothupii_.googlemapsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContentProvider extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);

        //Content provider to store previously searched data by the user
        //search for restaurants nearby
        Uri restuarantsIntentUri = Uri.parse("geo:0,0?q=My current Location");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, restuarantsIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

        //search for ATM's nearby
        Uri atmIntentUri = Uri.parse("geo:0,0?q=ATM");
        Intent mapIntent2 = new Intent(Intent.ACTION_VIEW, atmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

        //search for malls nearby
        Uri shoppingIntentUri = Uri.parse("geo:0,0?q=Shopping");
        Intent mapIntent3 = new Intent(Intent.ACTION_VIEW, shoppingIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

        //search for transit
        Uri transitIntentUri = Uri.parse("geo:0,0?q=Transit");
        Intent mapIntent4 = new Intent(Intent.ACTION_VIEW, transitIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

        //search for Pharmacies nearby
        Uri pharmarcyIntentUri = Uri.parse("geo:0,0?q=Pharmarcy");
        Intent mapIntent5 = new Intent(Intent.ACTION_VIEW, pharmarcyIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

        //search for Gas stations nearby
        Uri gasIntentUri = Uri.parse("geo:0,0?q=Gas");
        Intent mapIntent6 = new Intent(Intent.ACTION_VIEW, gasIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void onClickSatisfied(View view)
    {
        Intent intent1 = new Intent(this, Question1.class);
        startActivity(intent1);
    }


}
