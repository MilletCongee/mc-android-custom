package com.mc.custom.hencoder.practie001;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 *  画圆
 */
public class Practice001CircleView extends View {
    public Practice001CircleView(Context context) {
        super(context);
    }

    public Practice001CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //设置颜色
        paint.setColor(Color.BLUE);
        //设置线条宽度
        paint.setStrokeWidth(40);

        //设置抗锯齿开关
        paint.setAntiAlias(true);

        // 设置绘制模式 描边
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(200,200,100,paint);

        // 设置绘制模式 填充
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200,500,100,paint);

        // 设置绘制模式 描边加填充
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(200, 800, 100, paint);
    }
}
