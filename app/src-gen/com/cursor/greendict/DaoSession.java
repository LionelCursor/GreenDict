package com.cursor.greendict;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dictDaoConfig;
    private final DaoConfig wordDaoConfig;

    private final dictDao dictDao;
    private final wordDao wordDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dictDaoConfig = daoConfigMap.get(dictDao.class).clone();
        dictDaoConfig.initIdentityScope(type);

        wordDaoConfig = daoConfigMap.get(wordDao.class).clone();
        wordDaoConfig.initIdentityScope(type);

        dictDao = new dictDao(dictDaoConfig, this);
        wordDao = new wordDao(wordDaoConfig, this);

        registerDao(dict.class, dictDao);
        registerDao(word.class, wordDao);
    }
    
    public void clear() {
        dictDaoConfig.getIdentityScope().clear();
        wordDaoConfig.getIdentityScope().clear();
    }

    public dictDao getDictDao() {
        return dictDao;
    }

    public wordDao getWordDao() {
        return wordDao;
    }

}