package com.example.googlemapapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap mapAPI;
    SupportMapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapFragment =(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapAPI = googleMap;
        LatLng MadhyaPradesh = new LatLng(23.199300, 77.4365226);
        mapAPI.addMarker(new MarkerOptions().position(MadhyaPradesh).title("MadhyaPradesh"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(MadhyaPradesh));
    }
}
