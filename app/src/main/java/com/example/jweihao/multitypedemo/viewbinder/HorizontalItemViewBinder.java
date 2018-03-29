package com.example.jweihao.multitypedemo.viewbinder;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/28 0028 5:46
 */

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jweihao.multitypedemo.bean.Label;

import me.drakeet.multitype.ItemViewBinder;

public class HorizontalItemViewBinder extends ObjectListItemViewBinder {

    private final Class          itemClass;
    private final ItemViewBinder itemViewBinder;

    public HorizontalItemViewBinder(Class labelClass, ItemViewBinder labelItemViewBinder) {
        itemClass = labelClass;
        itemViewBinder = labelItemViewBinder;
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
        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        return layoutManager;
    }
}
