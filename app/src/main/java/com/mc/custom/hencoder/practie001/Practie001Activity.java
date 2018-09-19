package com.mc.custom.hencoder.practie001;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.mc.custom.R;
import com.mc.custom.base.BaseActivity;
import com.mc.custom.hencoder.PractieViewFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 */
public class Practie001Activity extends BaseActivity {
    TabLayout tabLayout;
    ViewPager pager;
    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.string.title_draw_color, R.layout.practice_001_color));
        pageModels.add(new PageModel(R.string.title_draw_circle, R.layout.practice_001_circle));
        pageModels.add(new PageModel(R.string.title_draw_rect, R.layout.practice_001_rect));
        pageModels.add(new PageModel(R.string.title_draw_point, R.layout.practice_001_point));
        pageModels.add(new PageModel(R.string.title_draw_oval, R.layout.practice_001_oval));
        pageModels.add(new PageModel(R.string.title_draw_line, R.layout.practice_001_line));
        pageModels.add(new PageModel(R.string.title_draw_round_rect, R.layout.practice_001_round_rect));
        pageModels.add(new PageModel(R.string.title_draw_arc, R.layout.practice_001_arc));
        pageModels.add(new PageModel(R.string.title_draw_path, R.layout.practice_001_path));
        pageModels.add(new PageModel(R.string.title_draw_histogram, R.layout.practice_001_histogram));
        pageModels.add(new PageModel(R.string.title_draw_pie_chart, R.layout.practice_001_pie_chart));
    }
    @Override
    protected int getContentViewId() {
        return R.layout.hencoder_practie001_activity;
    }

    @Override
    protected void initView() {
        pager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                return PractieViewFragment.newInstance(Practie001Activity.this,pageModel.practiceLayoutRes);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });
        tabLayout.setupWithViewPager(pager);
    }

    private class PageModel {
        @StringRes
        int titleRes;
        @LayoutRes int practiceLayoutRes;
        PageModel(@StringRes int titleRes, @LayoutRes int practiceLayoutRes) {
            this.titleRes = titleRes;
            this.practiceLayoutRes = practiceLayoutRes;
        }
    }
}
