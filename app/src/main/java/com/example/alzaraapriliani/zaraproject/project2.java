package com.example.alzaraapriliani.zaraproject;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class project2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);

        /*findViewById(R.id.spinner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(project2.this, RegionSelectActivity.class);
                startActivity(intent);


            }
        });*/

        findViewById(R.id.imageView5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(project2.this, profilemain.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageView3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(project2.this, notifikasion.class);
                startActivity(intent);

            }
        });

        //Add event login button
        findViewById(R.id.imageView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if intent add classname.class it can move another activity
                Intent intent = new Intent(project2.this, loginActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.resto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if intent add classname.class it can move another activity
                Intent intent = new Intent(project2.this, resto_list.class);
                startActivity(intent);
            }
        });
    }
}
