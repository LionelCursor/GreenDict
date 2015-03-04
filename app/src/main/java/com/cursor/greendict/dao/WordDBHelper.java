package com.cursor.greendict.dao;

import android.content.Context;

import com.cursor.greendict.model.Entity;

import java.util.List;

/**
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/3
 */
public class WordDBHelper extends BaseDBHelper{


    private static WordDBHelper instance;

    public BaseDBHelper getInstance(Context context) {
        if (instance == null){

        }
        return null;
    }

    
    public long saveEntity(Entity entity) {
        return 0;
    }

    
    public void saveEntityList(List<Entity> list) {

    }

    
    public Entity getEntity(long id) {
        return null;
    }

    
    public List<com.cursor.greendict.dict> getAllEntity() {
        return null;
    }

    
    public void deleteAllEntity() {

    }

    
    public void deleteEntity(Entity entity) {

    }

    
    public void deleteEntity(long id) {

    }
}
