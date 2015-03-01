package com.cursor.tools.mutils.view;

import android.app.Activity;

import butterknife.ButterKnife;

/**
 * Collection of useful utils 
 * Only what I used
 * 
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: Utils
 * DATE: 2015/3/1
 */
public class ViewUtils {
    /**
     * @param target source for inject
     */
    public static void inject(Activity target){
        ButterKnife.inject(target);
    }
}
