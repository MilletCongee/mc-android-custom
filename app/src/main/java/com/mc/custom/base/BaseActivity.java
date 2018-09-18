package com.mc.custom.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author mc
 * @darte 2018/9/18
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected BaseActivity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        setContentView(getContentViewId());
        setFullscreenLayout();
        initView();
        initData(savedInstanceState);
    }
    protected void setFullscreenLayout() {
        View decor = getWindow().getDecorView();
        int flags = decor.getSystemUiVisibility();
        flags |= View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
        decor.setSystemUiVisibility(flags);
    }

    private void startMainActivity(Context mContext, Class target) {
        Intent i = new Intent(mContext, target);
        mContext.startActivity(i);
    }
    /**
     * fetch data by rule id
     * @return R.layout.xxx
     */
    protected abstract int getContentViewId();

    /**
     * 初始化布局
     */
    protected abstract void initView();

    /**
     * 初始化数据
     * @param savedInstanceState 保存实例状态
     */
    protected abstract void initData(Bundle savedInstanceState);
}
