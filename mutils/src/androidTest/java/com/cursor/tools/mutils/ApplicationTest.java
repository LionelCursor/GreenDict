package com.cursor.tools.mutils;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import com.cursor.tools.mutils.log.Logger;
import com.cursor.tools.mutils.log.SimpleCustomLogger;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
    public void testNormal(){
        Logger.d("custom");
    }
    public void testPrefix(){
        Logger.prefix = "prefix:";
        Logger.d("test");
    }
    
    public void testLevel(){
        Logger.level = Logger.LogLevel.INFO;
        Logger.d("debug");
        Logger.i("assert");
        Logger.wtf("wtf");
        Logger.level = Logger.LogLevel.DEBUG;
    }
    
    public void testCustomLogger(){
        Logger.setCustomLogger(new SimpleCustomLogger(){
            @Override
            public void d(String tag, String content) {
                super.d(tag, content);
                Log.d("test","test custom logger");
            }
        });
    }
}