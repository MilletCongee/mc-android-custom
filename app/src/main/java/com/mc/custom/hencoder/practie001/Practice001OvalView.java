package com.mc.custom.hencoder.practie001;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * 画椭圆
 */
public class Practice001OvalView extends View {
    public Practice001OvalView(Context context) {
        super(context);
    }

    public Practice001OvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawOval(50, 50, 350, 200,paint);
        }
    }
}
