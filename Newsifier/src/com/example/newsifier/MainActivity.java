package com.example.newsifier;

import org.apache.cordova.DroidGap;

import android.R;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		super.loadUrl("file:///android_asset/www/index.html");
	}

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/

	/*@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		this.postMessage("onPrepareOptionsMenu", menu);
		return true;
	}*/
}
