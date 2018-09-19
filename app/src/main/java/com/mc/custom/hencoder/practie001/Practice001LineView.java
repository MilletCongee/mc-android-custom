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
 * 画线
 */
public class Practice001LineView extends View {
    private Paint paint = new Paint();

    public Practice001LineView(Context context) {
        super(context);
    }

    public Practice001LineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStrokeWidth(20);

        canvas.drawLine(200, 200, 800, 500, paint);
    }
}
