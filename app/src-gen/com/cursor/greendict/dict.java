package com.cursor.greendict;

import com.cursor.greendict.model.Entity;

import java.util.List;

import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table DICT.
 */
public class dict extends Entity {

    private Long id;
    private String dict_name;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient dictDao myDao;

    private List<word> words;

    public dict() {
    }

    public dict(Long id) {
        this.id = id;
    }

    public dict(Long id, String dict_name) {
        this.id = id;
        this.dict_name = dict_name;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDictDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDict_name() {
        return dict_name;
    }

    public void setDict_name(String dict_name) {
        this.dict_name = dict_name;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<word> getWords() {
        if (words == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            wordDao targetDao = daoSession.getWordDao();
            List<word> wordsNew = targetDao._queryDict_Words(id);
            synchronized (this) {
                if(words == null) {
                    words = wordsNew;
                }
            }
        }
        return words;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetWords() {
        words = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
