package com.mc.custom.hencoder.practie001;

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
 * 画点
 */
public class Practice001PointView extends View {
    public Practice001PointView(Context context) {
        super(context);
    }

    public Practice001PointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);

        Paint paint1 = new Paint();
        paint1.setStrokeWidth(20);
        paint1.setStrokeCap(Paint.Cap.SQUARE);

        canvas.drawPoint(50, 50,paint);

        canvas.drawPoint(100, 100,paint1);

        Paint paint2 = new Paint();
        paint2.setStrokeWidth(50);
        // 绘制四个点：(200, 200) (200, 400) (400, 200) (400, 400)
        float[] points = {200, 200, 200, 400, 400, 200, 400, 400};
        /** 跳过两个数，即前两个 0
         * 一共绘制 4 个点
         * */
        canvas.drawPoints(points,paint2);
    }
}
