package com.mc.custom.hencoder.practie002;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.mc.custom.R;

/**
 * BitmapShader 用 Bitmap 来着色
 * 用 Bitmap 的像素来作为图形或文字的填
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Practice002BitmapShaderView extends View {
    private Paint paint = new Paint();
    private Paint paint1 = new Paint();
    private Paint paint2 = new Paint();
    public Practice002BitmapShaderView(Context context) {
        super(context);
    }

    public Practice002BitmapShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
        /**
         * bitmap:用来做模板的 Bitmap 对象
         * tileX:横向的 TileMode
         * tileY:纵向的 TileMode
         * */
        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Shader shader1 = new BitmapShader(bitmap, Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);
        Shader shader2 = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);

        paint.setShader(shader);
        paint1.setShader(shader1);
        paint2.setShader(shader2);
        //图形范围
        //canvas.drawRect(0, 0, 800, 800, paint);
        //canvas.drawRect(0, 0, 800, 800, paint);
        canvas.drawRect(0, 0, 800, 800, paint2);
    }
}
