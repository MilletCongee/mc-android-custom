package com.mc.custom.confirm;

import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import com.mc.custom.R;
import com.mc.custom.base.BaseActivity;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * View的坐标系统是相对于父控件的
 */
public class Confirm001Activity extends BaseActivity {

    private LinearLayout mLinearLayoutOne,mLinearLayoutTwo,mLinearLayoutThree;
    @Override
    protected int getContentViewId() {
        return R.layout.confirm_001_activity;
    }

    @Override
    protected void initView() {
        mLinearLayoutOne = findViewById(R.id.ln_confirm_one);
        mLinearLayoutTwo = findViewById(R.id.ln_confirm_two);
        mLinearLayoutThree = findViewById(R.id.ln_confirm_three);
        Logger.addLogAdapter(new AndroidLogAdapter());
    }


    @Override
    protected void initData(Bundle savedInstanceState) {
        //程序刚开始绘制 view 的时候,你马上使用代码去捕获上面的值,这个时候,由于view 是刚开始绘制的,你得到的就会是 0.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //View的坐标系统是相对于父控件而言的

                //获取子View左上角距父View顶部的距离
                int onetop = mLinearLayoutOne.getTop();
                //获取子View左上角距父View左侧的距离
                int oneleft = mLinearLayoutOne.getLeft();
                //获取子View右下角距父View顶部的距离
                int onebottom = mLinearLayoutOne.getBottom();
                //获取子View右下角距父View左侧的距离
                int oneright = mLinearLayoutOne.getRight();


                /**
                 * onetop_0
                 * oneleft_0
                 * onebottom_2160
                 * oneright_1080
                * */
                Logger.e( " onetop_"+onetop+"\n oneleft_"+oneleft
                        +"\n onebottom_"+onebottom+"\n oneright_"+oneright
                );

                int twotop = mLinearLayoutTwo.getTop();
                int twoleft = mLinearLayoutTwo.getLeft();
                int twobottom = mLinearLayoutTwo.getBottom();
                int tworight = mLinearLayoutTwo.getRight();

                /**
                 * twotop_805
                 * twoleft_265
                 * twobottom_1355
                 * tworight_815
                * */
                Logger.e( " twotop_"+twotop+"\n twoleft_"+twoleft
                        +"\n twobottom_"+twobottom+"\n tworight_"+tworight
                );

                int threetop = mLinearLayoutThree.getTop();
                int threeleft = mLinearLayoutThree.getLeft();
                int threebottom = mLinearLayoutThree.getBottom();
                int threeright = mLinearLayoutThree.getRight();

                /**
                 * threetop_206
                 * threeleft_206
                 * threebottom_344
                 * threeright_344
                * */
                Logger.e( " threetop_"+threetop+"\n threeleft_"+threeleft
                        +"\n threebottom_"+threebottom+"\n threeright_"+threeright
                );

            }
        },5000);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.clearLogAdapters();
    }
}
