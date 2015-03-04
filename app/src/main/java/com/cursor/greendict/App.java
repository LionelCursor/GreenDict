package com.cursor.greendict;

import android.app.Application;

import com.cursor.greendict.dao.BaseDBHelper;
import com.cursor.greendict.dao.DictDBHelper;
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
        preInitDBHelper();
        initDictDB();
    }
    
    private void initLogger(){
        Logger.prefix = "greenDict";
    }

    private void preInitDBHelper(){
        BaseDBHelper.preInitHelper(this);
    }
    
    private void initDictDB(){
        dict aDict = new dict((long)1, Constants.initDict);
        DictDBHelper.getInstance(this).saveEntity(aDict);
    }

}
