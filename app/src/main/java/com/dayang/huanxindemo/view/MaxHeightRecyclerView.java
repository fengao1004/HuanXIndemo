package com.dayang.huanxindemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

import com.dayang.huanxindemo.util.FontDisplayUtil;

/**
 * Created by 冯傲 on 2017/2/10.
 * e-mail 897840134@qq.com
 */

public class MaxHeightRecyclerView extends RecyclerView {
    public MaxHeightRecyclerView(Context context) {
        super(context);
    }

    public MaxHeightRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MaxHeightRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        float width = getWidth();
        float height = width * 0.8f;
        int maxHeightSpec = MeasureSpec.makeMeasureSpec((int) height, MeasureSpec.AT_MOST);
        super.onMeasure(widthSpec, maxHeightSpec);
    }
}
