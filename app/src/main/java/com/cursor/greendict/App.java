package com.cursor.greendict;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

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
    public static final String dbName = "dicts";
    
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;
    
    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
    }
    
    private void initLogger(){
        Logger.prefix = "greenDict";
    }

    /**
     * getDaoMaster
     * * 
     * @param context
     * @return
     */
    public static DaoMaster getDaoMaster(Context context){
        if (daoMaster == null){
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context, dbName, null);
            daoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return daoMaster;
    }

    /**
     * getSession
     * * 
     * @param context
     * @return
     */
    public static DaoSession getDaoSession(Context context){
        if (daoSession == null){
            if (daoMaster == null){
                daoMaster = getDaoMaster(context);
            }
            daoSession = daoMaster.newSession();
        }
        return daoSession;
    }
    
}
