package com.cursor.greendict.view.textview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * USER: ldx
 * EMAIL: danxionglei@foxmail.com
 * PROJECT_NAME: GreenDict
 * DATE: 2015/3/1
 */
public abstract class BaseTextView extends TextView {
    public BaseTextView(Context context) {
        super(context);
    }

    public BaseTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BaseTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    
    
}
