package com.cursor.greendict.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

import com.cursor.greendict.R;
import com.cursor.greendict.logger.Logger;

import net.simonvt.menudrawer.MenuDrawer;
import net.simonvt.menudrawer.Position;

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
    private MenuDrawer mMenuDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActionBar();
        initMenuDrawer();
    }
    
    private void initActionBar(){
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(R.layout.actionbar_title);
        ButterKnife.inject(actionBar.getCustomView(),this);
    }
    
    private void initMenuDrawer(){
        mMenuDrawer = MenuDrawer.attach(this, Position.LEFT);
        mMenuDrawer.setTouchMode(MenuDrawer.TOUCH_MODE_NONE);
        mMenuDrawer.setContentView(R.layout.activity_main);
        mMenuDrawer.setMenuView(R.layout.activity_menu);
        mMenuDrawer.setDropShadowColor(getResources().getColor(android.R.color.transparent));
        mMenuDrawer.setMaxAnimationDuration(1000);
        mMenuDrawer.setHardwareLayerEnabled(false);
        mMenuDrawer.setMenuSize((int)getResources().getDimension(R.dimen.menu_size));
    }
    
    @OnClick(R.id.action_bar_left_button) void operateDrawer(){
        if (mMenuDrawer.isMenuVisible()){
            mMenuDrawer.closeMenu();
        }else{
            mMenuDrawer.openMenu();
        }
    }
}
