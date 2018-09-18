package com.mc.custom.confirm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Confirm002View extends View {
    private float x ,y;
    private float RawX,RawY;
    public Confirm002View(Context context) {
        super(context);
    }

    public Confirm002View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Confirm002View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //设置文字的大小
        paint.setTextSize(36);
        // 参数  text 是用来绘制的字符串，x 和 y 是绘制的起点坐标。
        //字体的大小颜色 是paint 决定的
        canvas.drawText("getX() :" + x,200, 100, paint);

        canvas.drawText("getY() :" + y,200, 200, paint);

        canvas.drawText("getRawX() :" + RawX,200, 300, paint);

        canvas.drawText("getRawY() :" + RawY,200, 400, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //触摸点相对于其所在组件坐标系的坐标
        x = event.getX();
        y = event.getY();
        ////触摸点相对于屏幕默认坐标系的坐标
        RawX = event.getRawX();
        RawY = event.getRawY();
        invalidate();
        return true;

    }
}
