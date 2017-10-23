package com.example.mothupii_.googlemapsapplication;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;

public class Question1 extends AppCompatActivity implements OnMapReadyCallback
{
    //Declarations
    GoogleMap mGoogleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (googleServicesAvailable()) {
            Toast.makeText(this, "Perfect", Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_main);
            initMap();
        }
        else
            {
            //no google maps layout
        }

    }

    private void initMap() {
        //get map fragment
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        //get Map object
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }

    public boolean googleServicesAvailable()
    {
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int isAvailable = api.isGooglePlayServicesAvailable(this);
        if (isAvailable == ConnectionResult.SUCCESS) {
            return true;
        }
        //if google services is not available, show error dialog message
        else if (api.isUserResolvableError(isAvailable)) {
            Dialog dialog;
            dialog = api.getErrorDialog(this, isAvailable, 0);
            //method to show dialog
            dialog.show();
        }
        else
            {
            Toast.makeText(this, "Cannot connect to play services", Toast.LENGTH_LONG).show();
        }
        return false;
    }

    private void show() {

    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        mGoogleMap = googleMap;
        goToLocationZoom(-26.194743,28.032887, 15);

    }
    //Method to get the current location with its coordinates
    private void goToLocation(double lat, double lng)
    {
        LatLng ll = new LatLng(lat, lng);
        //this method also allows the camera to update the coordinates
        CameraUpdate update = CameraUpdateFactory.newLatLng(ll);
        mGoogleMap.moveCamera(update);
    }
    //method to zoom map and get the current location
    private void goToLocationZoom(double lat, double lng, float zoom)
    {
        LatLng ll = new LatLng(lat,lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, zoom);
        mGoogleMap.moveCamera(update);
    }

    public void geoLocation(View view) throws IOException {

        goToLocationZoom(-26.2401547, 27.9148204, 15);
        EditText et = (EditText) findViewById(R.id.editxtSearchLocation);
        String location = et.getText().toString();
        Toast.makeText(this, location, Toast.LENGTH_LONG).show();
        //Intent intents = new Intent(this, Video.class);
        //startActivity(intents);

    }

    }
