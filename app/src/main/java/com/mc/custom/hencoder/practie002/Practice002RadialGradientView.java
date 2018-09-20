package com.mc.custom.hencoder.practie002;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**RadialGradient 辐射渐变 从中心向周围辐射状的渐变
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Practice002RadialGradientView extends View {
    private Paint paint = new Paint();
    private Paint paint1 = new Paint();
    private Paint paint2 = new Paint();
    public Practice002RadialGradientView(Context context) {
        super(context);
    }

    public Practice002RadialGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /**
         *  centerX centerY：辐射中心的坐标
         *  radius：辐射半径
         *  centerColor：辐射中心的颜色
         *  edgeColor：辐射边缘的颜色
         *  tileMode：辐射范围之外的着色模式。
         * */
        Shader shader = new RadialGradient(300, 300, 200, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(300, 300, 200, paint);

        Shader shader1 = new RadialGradient(300, 300, 200, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.MIRROR);
        paint1.setShader(shader1);
        canvas.drawCircle(800, 800, 200, paint1);

        Shader shader2 = new RadialGradient(300, 300, 200, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.REPEAT);
        paint2.setShader(shader2);
        canvas.drawCircle(300, 1200, 200, paint2);
    }
}
