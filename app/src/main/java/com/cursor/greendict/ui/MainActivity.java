package com.cursor.greendict.ui;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.cursor.greendict.R;

import butterknife.ButterKnife;

/**
 * MainActivity
 * 
 * 
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public class MainActivity extends BaseActivity{
    
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }
}
