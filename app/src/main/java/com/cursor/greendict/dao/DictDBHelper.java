package com.cursor.greendict.dao;

import android.content.Context;

import com.cursor.greendict.dict;
import com.cursor.greendict.dictDao;
import com.cursor.greendict.model.Entity;

import java.util.List;

/**
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/3
 */
public class DictDBHelper extends BaseDBHelper {
    private static DictDBHelper instance;
    private dictDao dictDao;
    private DictDBHelper(){}
    
    public static BaseDBHelper getInstance(Context context) {
        if (instance == null){
            instance = new DictDBHelper();
            if (instance.appContext == null){
                instance.appContext = context.getApplicationContext();
            }
            daoSession = getDaoSession(instance.appContext);
            instance.dictDao = daoSession.getDictDao();
        }
        return instance;
    }

    
    public long saveEntity(dict entity) {
        dictDao.insertOrReplace(entity);
        return 0;
    }

    
    public void saveEntityList(List<Entity> list) {

    }

    
    public dict getEntity(long id) {
        return dictDao.load(id);
    }

    
    public List<dict> getAllEntity() {
        return dictDao.loadAll();
    }

    
    public void deleteAllEntity() {

    }

    
    public void deleteEntity(Entity entity) {

    }

    
    public void deleteEntity(long id) {

    }
}
