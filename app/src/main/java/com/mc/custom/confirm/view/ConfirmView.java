package com.mc.custom.confirm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * 不含子View
 */
public class ConfirmView extends View {


    /**
     * 1. View 初始化
     * 一般在直接New一个View的时候调用
     * */
    public ConfirmView(Context context) {
        super(context);
    }

    /**
     * 1. View 初始化
     * 一般在layout文件中使用的时候会调用,关于它的所有属性(包括自定义属性)都会包含在attrs中传递进来
     * */
    public ConfirmView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ConfirmView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 2.测量 View 大小
     *
     * MeasureSpec.UNSPECIFIED 父控件没有给子view任何限制,子View可以设置为任意大小
     * MeasureSpec.EXACTLY 表示父控件已经确切的指定了子View的大小
     * MeasureSpec.AT_MOST 表示子View具体大小没有尺寸限制,但是存在上限,上限一般为父View大小
     *
     * */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        //取出宽度的确切数值
        int widthsize   = MeasureSpec.getSize(widthMeasureSpec);
        //取出高度的确切数值
        int heightsize = MeasureSpec.getSize(heightMeasureSpec);

        //取出宽度的测量模式
        int widthmode =   MeasureSpec.getMode(widthMeasureSpec);
        //取出高度的测量模式
        int heightmode  =  MeasureSpec.getMode(heightMeasureSpec);


    }

    /**
     * 3.确定 View 大小
     * */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    /**
     * 4.确定子View 布局(包含子View时用)
     * */
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
    /**
     * 5.实际绘制内容
     * */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
    /**
     * 6.提供接口
     * 控制View或监听View某些状态
     * */

}
