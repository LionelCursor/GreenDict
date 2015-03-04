package com.cursor.greendict.dao;

import android.content.Context;

import com.cursor.greendict.word;
import com.cursor.greendict.wordDao;

import java.util.List;

/**
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/3
 */
public class WordDBHelper extends BaseDBHelper{

    private static WordDBHelper instance;
    
    private wordDao wordDao;
    
    private WordDBHelper(){}
    
    public BaseDBHelper getInstance(Context context) {
        if (instance == null){
            instance = new WordDBHelper();
            if (instance.appContext==null){
                instance.appContext = context.getApplicationContext();
            }
            daoSession = getDaoSession(appContext);
            instance.wordDao = daoSession.getWordDao();
        }
        return instance;
    }

    
    public long saveEntity(word entity) {
        return wordDao.insertOrReplace(entity);
    }

    
    public void saveEntityList(final List<word> list) {
        if (list==null||list.isEmpty()){
            return;
        }
        wordDao.getSession().runInTx(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<list.size();i++){
                    wordDao.insertOrReplaceInTx(list.get(i));
                }
            }
        });
   }

    
    public word getEntity(long id) {
        return wordDao.load(id);
    }

    
    public List<word> getAllEntity() {
        return wordDao.loadAll();
    }

    
    public void deleteAllEntity() {
        wordDao.deleteAll();
    }

    
    public void deleteEntity(word entity) {
        wordDao.delete(entity);
    }

    
    public void deleteEntity(long id) {
        wordDao.deleteByKey(id);
    }
}
