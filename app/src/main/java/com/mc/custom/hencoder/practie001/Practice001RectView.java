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
 * 矩形
 */
public class Practice001RectView extends View {
    public Practice001RectView(Context context) {
        super(context);
    }

    public Practice001RectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paintFill = new Paint();
        Paint paintStroke = new Paint();

        paintFill.setStyle(Paint.Style.FILL);
        paintStroke.setStyle(Paint.Style.STROKE);

        canvas.drawRect(100, 100, 500, 500, paintFill);
        canvas.drawRect(100, 600
                , 500, 1000, paintStroke);

    }
}
