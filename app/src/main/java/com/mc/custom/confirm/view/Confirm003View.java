package com.mc.custom.confirm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Confirm003View extends View {
    private float x ,y;
    private float RawX,RawY;
    public Confirm003View(Context context) {
        super(context);
    }

    public Confirm003View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Confirm003View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }


    /**
     * Touch事件的相关细节（发生触摸的位置、时间等）被封装成MotionEvent对象
    * */
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return true;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
