package com.quintet.littleweather.config;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by CHENQIAO.
 */
        //自定义item之间的间隔
public class SpacesItemDecoration extends RecyclerView.ItemDecoration
{
    private int space;
    public SpacesItemDecoration(int space)
    {
        this.space=space;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state)
    {
        outRect.left=space;
        outRect.right=space;
        outRect.bottom=space;
        if(parent.getChildAdapterPosition(view)==0)
        {
            outRect.top=space;
        }
    }
}