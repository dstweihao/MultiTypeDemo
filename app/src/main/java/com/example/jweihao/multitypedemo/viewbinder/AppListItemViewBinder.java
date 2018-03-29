package com.example.jweihao.multitypedemo.viewbinder;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/27 0027 23:31
 */

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jweihao.multitypedemo.R;
import com.example.jweihao.multitypedemo.bean.App;
import com.example.jweihao.multitypedemo.bean.AppList;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.List;

import me.drakeet.multitype.ItemViewBinder;
import me.drakeet.multitype.MultiTypeAdapter;

public class AppListItemViewBinder extends ItemViewBinder<AppList, AppListItemViewBinder.ViewHolder> {

    private MultiTypeAdapter mMultiTypeAdapter;

    @NonNull
    @Override
    protected AppListItemViewBinder.ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull AppListItemViewBinder.ViewHolder holder, @NonNull AppList item) {
        holder.setItemList(item.getAppLists());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            RecyclerView recyclerview = itemView.findViewById(R.id.item_recyclerview);

//            SnapHelper snapHelper = new LinearSnapHelper();
//            snapHelper.attachToRecyclerView(recyclerview);
            //回收效果设置
            recyclerview.setLayoutManager(new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL, false));
            SnapHelper snapHelperStart = new GravitySnapHelper(Gravity.START);
            snapHelperStart.attachToRecyclerView(recyclerview);

            mMultiTypeAdapter = new MultiTypeAdapter();
            mMultiTypeAdapter.register(App.class, new AppItemViewBinder());
            recyclerview.setAdapter(mMultiTypeAdapter);

        }

        public void setItemList(List<App> appLists) {
            mMultiTypeAdapter.setItems(appLists);
            mMultiTypeAdapter.notifyDataSetChanged();
        }
    }
}
