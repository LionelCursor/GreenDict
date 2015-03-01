package com.cursor.greendict.ui;

import android.app.Activity;
import android.os.Bundle;

import com.cursor.greendict.R;
import com.cursor.greendict.logger.Logger;

import butterknife.ButterKnife;

/**
 * MainActivity
 * * *
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public class MainActivity extends BaseActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }
}
