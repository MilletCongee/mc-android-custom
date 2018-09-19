package com.mc.custom.hencoder.practie001;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.mc.custom.R;
import com.mc.custom.confirm.pojo.PieData;

import java.util.ArrayList;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Practice001PieChartView extends View {

    private Paint mPaint = new Paint();
    //绘制扇形需要规定一个矩形的范围
    private RectF  mRectF = new RectF();
    private Context context;
    public Practice001PieChartView(Context context) {
        super(context);
    }

    public Practice001PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
    }

    /**
     * startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度）
     * sweepAngle 是弧形划过的角度
     * */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 填充模式
        mPaint.setStyle(Paint.Style.FILL);
        //绘制扇形需要规定一个矩形的范围
        mRectF = new RectF();
        mRectF.set(100,100,500,500);

        mPaint.setColor(ContextCompat.getColor(context,R.color.Green_600));
        // 绘制扇形
        canvas.drawArc(mRectF,-180, 90, true, mPaint);

        mPaint.setColor(ContextCompat.getColor(context,R.color.Teal_600));
        canvas.drawArc(mRectF,-90, 90, true, mPaint);

        mPaint.setColor(ContextCompat.getColor(context,R.color.Light_Blue_600));
        canvas.drawArc(mRectF,0, 60, true, mPaint);

        mPaint.setColor(ContextCompat.getColor(context,R.color.Lime_600));
        canvas.drawArc(mRectF,60, 60, true, mPaint);

        mPaint.setColor(ContextCompat.getColor(context,R.color.Deep_Orange_600));
        canvas.drawArc(mRectF,120, 60, true, mPaint);


    }
}
