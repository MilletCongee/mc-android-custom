package com.mc.custom.confirm;

import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import com.mc.custom.R;
import com.mc.custom.base.BaseActivity;
import com.mc.custom.confirm.view.Confirm002View;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * MotionEvent中 get 和 getRaw 的区别
 */
public class Confirm002Activity extends BaseActivity {
    private Confirm002View mCv;

    @Override
    protected int getContentViewId() {
        return R.layout.confirm_002_activity;
    }

    @Override
    protected void initView() {
        mCv = findViewById(R.id.cv_002);
        Logger.addLogAdapter(new AndroidLogAdapter());
    }


    @Override
    protected void initData(Bundle savedInstanceState) {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    int cvleft = mCv.getLeft();
                    /**
                     *   cvleft 240
                     *   467 - 227 = 240
                    * */
                    Logger.e( " cvleft"+cvleft);
                }
            },5000);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.clearLogAdapters();
    }
}
