package com.example.newsifier;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;

public class NewsifierMainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_newsifier_main);*/
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_newsifier_main, menu);
        return true;
    }
}
