package com.example.jweihao.multitypedemo.viewbinder;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/28 0028 5:46
 */

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import me.drakeet.multitype.ItemViewBinder;

public class GridLayoutItemViewBinder extends ObjectListItemViewBinder {

    private final Class          itemClass;
    private final ItemViewBinder itemViewBinder;
    private final int            spanCount;

    public GridLayoutItemViewBinder(Class labelClass, ItemViewBinder labelItemViewBinder, int spanCount) {
        itemClass = labelClass;
        itemViewBinder = labelItemViewBinder;
        this.spanCount = spanCount;
    }

    @Override
    protected ItemViewBinder setItemViewBinder() {
        return itemViewBinder;
    }

    @Override
    protected Class setItemClass() {
        return itemClass;
    }

    @Override
    public RecyclerView.LayoutManager setLayoutManager(View itemView) {
        GridLayoutManager layoutManager = new GridLayoutManager(itemView.getContext(), spanCount);
        return layoutManager;
    }
}
