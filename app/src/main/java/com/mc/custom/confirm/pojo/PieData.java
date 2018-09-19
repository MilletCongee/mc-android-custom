package com.mc.custom.confirm.pojo;

import android.support.annotation.NonNull;

/**
 * @author mc
 * @darte 2018/9/19
 * @email zzzcy1014@gmail.com
 * @since JDK1.8+
 * 用户关心数据
 */
public class PieData {


    /**
     * name  名字
    * */
    private String name;

    /**
     * value  数值
     * */
    private float value;


    /**
     * percentage  百分比
     * */
    private float percentage;

    /**
     * color  颜色
     * */
    private int color = 0;
    /**
     * angle  角度
     * */
    private float angle = 0;

    public PieData(@NonNull String name, @NonNull float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
