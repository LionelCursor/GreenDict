package com.cursor.generator;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.ToMany;

public class DaoGenerator {
    public static void main(String[] args) throws Exception{
        Schema schema = new Schema(1,"com.cursor.greendict");
        createWordAndDict(schema);
        new de.greenrobot.daogenerator.DaoGenerator().generateAll(schema,"app/src/main/java/com/cursor/greendict/model");
    }
    
    private static void createWordAndDict(Schema schema){
        Entity dict = schema.addEntity("dict");
        dict.addIdProperty();
        dict.addStringProperty("dict_name");

        Entity word = schema.addEntity("word");
        word.addIdProperty();
        word.addStringProperty("raw_word").notNull();
        word.addStringProperty("interpretation");
        Property wordSequence = word.addIntProperty("sequence").notNull().getProperty();
        Property dictId = word.addLongProperty("dictId").notNull().getProperty();
        word.addToOne(dict,dictId);

        ToMany dictToWord  = dict.addToMany(word, dictId);
        dictToWord.setName("words");
        dictToWord.orderAsc(wordSequence);
    }
    
}
