package com.mc.custom.hencoder.practie002;

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
 * Paint:
 *   1. 颜色
 *   2.效果
 *   3.drawText()
 *   4.初始化
 */
public class Practie002Activity extends BaseActivity {
    TabLayout tabLayout;
    ViewPager pager;
    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.string.title_linear_gradient, R.layout.practice_002_linear_gradient));
        pageModels.add(new PageModel(R.string.title_radial_gradient, R.layout.practice_002_radial_gradient));
        pageModels.add(new PageModel(R.string.title_sweep_gradient, R.layout.practice_002_sweep_gradient));
        pageModels.add(new PageModel(R.string.title_bitmap_shader, R.layout.practice_002_bitmap_shader));
        pageModels.add(new PageModel(R.string.title_compose_shader, R.layout.practice_002_compose_shader));

        pageModels.add(new PageModel(R.string.title_lighting_color_filter, R.layout.practice_002_lighting_color_filter));
        pageModels.add(new PageModel(R.string.title_color_matrix_color_filter, R.layout.practice_002_mask_filter));
        pageModels.add(new PageModel(R.string.title_xfermode, R.layout.practice_002_xfermode));
        pageModels.add(new PageModel(R.string.title_stroke_cap, R.layout.practice_002_stroke_cap));
        pageModels.add(new PageModel(R.string.title_stroke_join, R.layout.practice_002_stroke_join));

        pageModels.add(new PageModel(R.string.title_stroke_miter, R.layout.practice_002_stroke_miter));
        pageModels.add(new PageModel(R.string.title_path_effect, R.layout.practice_002_path_effect));
        pageModels.add(new PageModel(R.string.title_shader_layer, R.layout.practice_002_shadow_layer));
        pageModels.add(new PageModel(R.string.title_mask_filter, R.layout.practice_002_mask_filter));
        pageModels.add(new PageModel(R.string.title_fill_path, R.layout.practice_002_fill_path));

        pageModels.add(new PageModel(R.string.title_text_path, R.layout.practice_002_text_path));
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
                return PractieViewFragment.newInstance(Practie002Activity.this,pageModel.practiceLayoutRes);
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
