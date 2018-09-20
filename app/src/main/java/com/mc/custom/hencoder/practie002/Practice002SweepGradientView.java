package com.mc.custom.hencoder.practie002;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**SweepGradient 扫描渐变
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Practice002SweepGradientView extends View {
    private Paint paint = new Paint();
    private Paint paint1 = new Paint();
    public Practice002SweepGradientView(Context context) {
        super(context);
    }

    public Practice002SweepGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /**
         * cx cy ：扫描的中心
         * color0：扫描的起始颜色
         * color1：扫描的终止颜色
        * */
        Shader shader = new SweepGradient(300, 300, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));
        paint.setShader(shader);
        canvas.drawCircle(300, 300, 200, paint);

        Shader shader1 = new SweepGradient(550, 850, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));
        paint1.setShader(shader1);
        // left, top, right, bottom 是四条边的坐标 rx 和 ry 是圆角的横向半径和纵向半径
        canvas.drawRoundRect(300, 600, 800, 1100,20,20,paint1);
    }
}
