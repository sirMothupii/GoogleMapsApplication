package com.example.mothupii_.googlemapsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    //On click button help
    public void onClick3(View view)
    {
        Intent intent1 = new Intent(Question2.this, Help.class);
        startActivity(intent1);
    }

    //On click image button restaurant
    public void onClickRestuarant(View view)
    {
        Intent intent1 = new Intent(this, ContentProvider.class);
        startActivity(intent1);
    }

    //On click image button ATM
    public void onClickATM(View view)
    {
        Intent intent1 = new Intent(this, ContentProvider.class);
        startActivity(intent1);
    }

    //On click image button Shopping
    public void onClickShopping(View view)
    {
        Intent intent1 = new Intent(this, ContentProvider.class);
        startActivity(intent1);
    }

    //On click image button Transit
    public void onClickTransit(View view)
    {
        Intent intent1 = new Intent(this, ContentProvider.class);
        startActivity(intent1);
    }

    //On click image button Pharmacy
    public void onClickPharmacy(View view)
    {
        Intent intent1 = new Intent(this, ContentProvider.class);
        startActivity(intent1);
    }

    //On click image button gas station
    public void onClickGas(View view)
    {
        Intent intent1 = new Intent(this, ContentProvider.class);
        startActivity(intent1);
    }



}
