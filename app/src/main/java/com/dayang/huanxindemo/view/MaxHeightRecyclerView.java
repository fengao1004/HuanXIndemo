package com.dayang.huanxindemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

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
        int mode = MeasureSpec.getMode(heightSpec);
        int size = MeasureSpec.getSize(heightSpec);
        if(mode==MeasureSpec.AT_MOST){
            Log.i("fengao", "onMeasure: AT_MOST");
        }
        if(mode==MeasureSpec.EXACTLY){
            Log.i("fengao", "onMeasure: EXACTLY");
        }
        if(mode==MeasureSpec.UNSPECIFIED){
            Log.i("fengao", "onMeasure: UNSPECIFIED");
        }
        Log.i("fengao", "onMeasure: "+size);
        if(size<500){
            MeasureSpec.makeMeasureSpec(size, mode);
        }else {
            MeasureSpec.makeMeasureSpec(size, mode);
        }
        super.onMeasure(widthSpec, heightSpec);
    }
}
