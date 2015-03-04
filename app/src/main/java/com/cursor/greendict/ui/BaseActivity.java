package com.cursor.greendict.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * BaseActivity
 * * * 
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onStop() {
        super.onStop();
        
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
