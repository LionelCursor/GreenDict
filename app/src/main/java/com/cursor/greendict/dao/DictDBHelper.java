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
        return dictDao.insertOrReplace(entity);
    }

    
    public void saveEntityList(final List<dict> list) {
        if (list == null||list.isEmpty()){
            return;            
        }
        dictDao.getSession().runInTx(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<list.size(); i++){ 
                    dictDao.insertOrReplace(list.get(i));
                }
            }
        });
    }

    
    public dict getEntity(long id) {
        return dictDao.load(id);
    }

    
    public List<dict> getAllEntity() {
        return dictDao.loadAll();
    }

    
    public void deleteAllEntity() {
        dictDao.deleteAll();
    }

    
    public void deleteEntity(dict entity) {
        dictDao.delete(entity);
    }

    
    public void deleteEntity(long id) {
        dictDao.deleteByKey(id);
    }
}
