package com.cursor.greendict;

import android.app.Application;

import com.cursor.greendict.logger.Logger;

/**
 * Instance of application
 * * *
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.prefix = "greenDict";
        Logger.d("");
    }
}
