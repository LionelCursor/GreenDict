package com.cursor.greendict.ui;

import android.app.ActionBar;
import android.os.Bundle;

import com.cursor.greendict.R;
import com.cursor.greendict.view.textview.TitleTextView;

import net.simonvt.menudrawer.MenuDrawer;
import net.simonvt.menudrawer.Position;

import butterknife.ButterKnife;
import butterknife.InjectView;
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
    @InjectView(R.id.action_bar_title)
    TitleTextView mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        initActionBar();
        initMenuDrawer();
        ButterKnife.inject(this);
        mTitle.setText(getResources().getString(R.string.action_bar_title));
    }
    
    private void initActionBar(){
        ActionBar actionBar = getActionBar();
        if (actionBar == null) return;
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(R.layout.actionbar_title);
    }
    
    private void initMenuDrawer(){
        mMenuDrawer = MenuDrawer.attach(this,MenuDrawer.Type.BEHIND, Position.START, MenuDrawer.MENU_DRAG_WINDOW);
        mMenuDrawer.setTouchMode(MenuDrawer.TOUCH_MODE_NONE);
        mMenuDrawer.setContentView(R.layout.activity_main);
        mMenuDrawer.setMenuView(R.layout.activity_menu);
        mMenuDrawer.setDropShadowEnabled(false);
        mMenuDrawer.setAnimationCacheEnabled(true);
        mMenuDrawer.setDrawOverlay(false);
        mMenuDrawer.setMaxAnimationDuration(1000);
        mMenuDrawer.setHardwareLayerEnabled(true);
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
