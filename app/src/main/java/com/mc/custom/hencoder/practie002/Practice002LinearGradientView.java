package com.mc.custom.hencoder.practie002;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.mc.custom.R;

/**
 * LinearGradient 线性渐变
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 *
 */
public class Practice002LinearGradientView extends View {
    /**
     * ANTI_ALIAS_FLAG用于绘制时抗锯齿
     */
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Context context;
    public Practice002LinearGradientView(Context context) {
        super(context);
    }

    public Practice002LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setShader(new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP));

        paint1.setShader(new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.MIRROR));

        paint2.setShader(new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.REPEAT));

        canvas.drawCircle(300, 300, 100, paint);

        canvas.drawCircle(600, 600, 100, paint);

        //在设置了 Shader 的情况下， Paint.setColor/ARGB() 所设置的颜色就不再起作用
        paint.setColor(ContextCompat.getColor(context,R.color.Teal_600));
        canvas.drawCircle(300, 900, 100, paint);


        //MIRROR 镜像模式
        canvas.drawCircle(300, 1200, 100, paint1);

        //REPEAT 重复模式
        canvas.drawCircle(600, 1200, 100, paint2);
    }

}
