package com.mc.custom.confirm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.mc.custom.R;
import com.mc.custom.base.BaseActivity;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * 事件分发
 */
public class Confirm003Activity extends BaseActivity {
    protected static final String TAG = "Confirm003Button";
    private Button mButton;

    @Override
    protected int getContentViewId() {
        return R.layout.confirm_003_activity;
    }

    @Override
    protected void initView() {
        mButton = findViewById(R.id.btn_confirm_003);

    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void initData(Bundle savedInstanceState) {
        mButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                switch (action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "onTouch ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "onTouch ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "onTouch ACTION_UP");
                        break;
                    default:
                        break;
                }

                return false;
            }
        });
    }

    /**
     * 如果return true,事件会由当前View的dispatchTouchEvent方法进行消费,同时事件会停止向下传递
    * */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
