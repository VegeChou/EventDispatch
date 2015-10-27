package com.android.eventdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Sensoro on 15/10/27.
 */
public class TouchEventChild extends LinearLayout {

    public TouchEventChild(Context context) {
        super(context);
    }

    public TouchEventChild(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchEventChild(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TouchEventChild(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("zwz", "Child | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(event.getAction()));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("zwz", "Child | onTouchEvent --> " + TouchEventUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("zwz", "Child | onInterceptTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }
}
