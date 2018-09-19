package com.mc.custom.hencoder.practie001;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * 画圆角矩形
 */
public class Practice001RoundRectView extends View {
    private Paint paint = new Paint();
    public Practice001RoundRectView(Context context) {
        super(context);
    }

    public Practice001RoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("NewApi")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 填充模式
        paint.setStyle(Paint.Style.FILL);
        // left, top, right, bottom 是四条边的坐标 rx 和 ry 是圆角的横向半径和纵向半径
        canvas.drawRoundRect(100, 100, 500, 500,20,20,paint);
        // 画线模式
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(100, 600
                , 500, 1000, 50,50,paint);
    }
}
