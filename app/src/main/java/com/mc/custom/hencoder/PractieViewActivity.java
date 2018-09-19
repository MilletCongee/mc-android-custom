package com.mc.custom.hencoder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mc.custom.R;
import com.mc.custom.adapter.MilletCindeeAdapter;
import com.mc.custom.base.BaseActivity;
import com.mc.custom.confirm.Confirm001Activity;
import com.mc.custom.confirm.Confirm002Activity;
import com.mc.custom.confirm.Confirm003Activity;
import com.mc.custom.confirm.ConfirmActivity;
import com.mc.custom.hencoder.practie001.Practie001Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class PractieViewActivity extends BaseActivity {
    private RecyclerView mRecyclerView;
    private MilletCindeeAdapter mAdapter;
    List<String> mList;

    @Override
    protected int getContentViewId() {
        return R.layout.confirm_activity;
    }

    @Override
    protected void initView() {
        mRecyclerView = findViewById(R.id.rl_confirm);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        mList = new ArrayList<String>();
        mList.add("Practie001Activity");
        mList.add("Practie002Activity");
        mList.add("Practie003Activity");

        mList.add("4");
        mList.add("5");
        mList.add("6");
        //设置RecyclerView管理器
        mAdapter = new MilletCindeeAdapter(this, mList);
        //设置RecyclerView管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //设置添加或删除item时的动画，这里使用默认动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                recyclerView.removeOnScrollListener(this);
            }
        });

        //设置适配器
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MilletCindeeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(PractieViewActivity.this, Practie001Activity.class));
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
