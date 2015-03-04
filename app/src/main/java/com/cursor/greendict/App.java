package com.cursor.greendict;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.cursor.greendict.utils.Constants;
import com.cursor.greendict.utils.logger.Logger;

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
        initLogger();
    }
    
    private void initLogger(){
        Logger.prefix = "greenDict";
    }


}
