package com.mc.custom.hencoder.practie004;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class Practice004TranslateView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public Practice004TranslateView(Context context) {
        super(context);
    }

    public Practice004TranslateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice004TranslateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
