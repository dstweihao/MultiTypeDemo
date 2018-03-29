package com.example.jweihao.multitypedemo.viewbinder;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/27 0027 22:18
 */

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jweihao.multitypedemo.R;
import com.example.jweihao.multitypedemo.bean.Label;
import com.example.jweihao.multitypedemo.bean.LabelList;
import com.example.jweihao.multitypedemo.bean.ObjectList;

import java.util.List;

import me.drakeet.multitype.ItemViewBinder;
import me.drakeet.multitype.MultiTypeAdapter;

public abstract class ObjectListItemViewBinder extends ItemViewBinder<ObjectList, ObjectListItemViewBinder.ViewHolder> {

    private MultiTypeAdapter mMultiTypeAdapter;

    @NonNull
    @Override
    protected ObjectListItemViewBinder.ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ObjectListItemViewBinder.ViewHolder holder, @NonNull ObjectList item) {
        holder.setItemList(item.getObjectList());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            RecyclerView itemRecyclerView = itemView.findViewById(R.id.item_recyclerview);
//            LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
//            layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            itemRecyclerView.setLayoutManager(setLayoutManager(itemView));

            mMultiTypeAdapter = new MultiTypeAdapter();
            mMultiTypeAdapter.register(setItemClass(), setItemViewBinder());
            itemRecyclerView.setAdapter(mMultiTypeAdapter);
        }

        public void setItemList(List<Object> objectList) {
            mMultiTypeAdapter.setItems(objectList);
            mMultiTypeAdapter.notifyDataSetChanged();
        }
    }



    //设置Item条目显示样式
    public abstract RecyclerView.LayoutManager setLayoutManager(View itemView);

    protected abstract Class setItemClass();


    protected abstract ItemViewBinder setItemViewBinder();
}
