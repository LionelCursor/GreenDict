package com.cursor.greendict.ui;

import android.app.Activity;
import android.os.Bundle;

import com.cursor.greendict.R;
import com.cursor.greendict.logger.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;

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
        initActionBar();
    }
    
    private void initActionBar(){
        actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(R.layout.actionbar_title);
        ButterKnife.inject(actionBar.getCustomView(),this);
    }
    
    @OnClick(R.id.action_bar_left_button) void operateDrawer(){
        
    }
}
