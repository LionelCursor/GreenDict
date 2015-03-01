package com.cursor.greendict.ui;

import android.app.ActionBar;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.cursor.greendict.R;

import net.simonvt.menudrawer.MenuDrawer;


/**
 * BaseActivity
 * * * 
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public abstract class BaseActivity extends FragmentActivity{
    protected ActionBar actionBar;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        initActionBar();
        initDrawer();
    }
    private void initDrawer(){
        MenuDrawer.attach(this);
    }
    private void initActionBar(){
        actionBar = getActionBar();
        if(actionBar == null) {
            
            return;
        }
        actionBar.setDisplayShowCustomEnabled(true);
        View view = View.inflate(this, R.layout.actionbar_title, null);
        actionBar.setCustomView(view);
    }
}
