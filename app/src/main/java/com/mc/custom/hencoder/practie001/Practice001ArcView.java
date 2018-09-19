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
 * 绘制弧形或扇形
 */
public class Practice001ArcView extends View {
    private Paint paint = new Paint();
    public Practice001ArcView(Context context) {
        super(context);
    }

    public Practice001ArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 填充模式
        paint.setStyle(Paint.Style.FILL);
        // 绘制扇形
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);
        // 绘制弧形
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);
        // 画线模式
        paint.setStyle(Paint.Style.STROKE);
        // 绘制不封口的弧形
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);
    }
}
