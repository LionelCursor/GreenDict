package com.cursor.greendict.dao;

import android.content.Context;

import com.cursor.greendict.DaoMaster;
import com.cursor.greendict.DaoSession;
import com.cursor.greendict.utils.Constants;


/**
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/3
 */
public abstract class BaseDBHelper {
                    
    private static DaoMaster daoMaster;
    protected static DaoSession daoSession;
    protected Context appContext;

    /**
     * 取得DaoMaster
     *
     * @param context context
     * @return master
     */
    public static DaoMaster getDaoMaster(Context context) {
        if (daoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context, Constants.DB_NAME, null);
            daoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return daoMaster;
    }

    /**
     * 取得DaoSession
     *
     * @param context context
     * @return session
     */
    public static DaoSession getDaoSession(Context context) {
        if (daoSession == null) {
            if (daoMaster == null) {
                daoMaster = getDaoMaster(context);
            }
            daoSession = daoMaster.newSession();
        }
        return daoSession;
    }
}
