package com.example.alzaraapriliani.zaraproject.ui.testpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.alzaraapriliani.zaraproject.R;
import com.example.alzaraapriliani.zaraproject.ui.bus.BusFragment;
import com.example.alzaraapriliani.zaraproject.ui.hotel.HotelFragment;
import com.example.alzaraapriliani.zaraproject.ui.main.MainFragment;
import com.example.alzaraapriliani.zaraproject.ui.maps.MapsFragment;
import com.example.alzaraapriliani.zaraproject.ui.myinfomation.AboutFragment;
import com.example.alzaraapriliani.zaraproject.ui.restaurant.RestoFragment;
import com.example.alzaraapriliani.zaraproject.ui.splash.SpalshFragment;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public static void go(AppCompatActivity activity) {
        Intent intent = new Intent(activity, TestActivity.class);
        activity.startActivity(intent);
    }

    public void onBus(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new BusFragment()).addToBackStack("aa").commit();
    }

    public void goMaps(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new HotelFragment()).addToBackStack("aa").commit();
    }

    public void goAmusementPark(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).addToBackStack("aa").commit();
    }

    // make sarang
    public void goHotel(View view) {
        // reference here
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MapsFragment()).addToBackStack("aa").commit();
    }

    public void goMain(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new AboutFragment()).addToBackStack("aa").commit();
    }

    public void goLogin(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new RestoFragment()).addToBackStack("aa").commit();
    }

    //TODO:: make scree splash copy like hotel
    public void goSplash(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new /*SplashFragment()*/SpalshFragment()).addToBackStack("aa").commit();
    }
}
