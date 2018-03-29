package com.example.jweihao.multitypedemo.viewbinder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jweihao.multitypedemo.R;
import com.example.jweihao.multitypedemo.bean.Column;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by weihao on 2018/3/27.
 */

public class ColumnItemViewBinder extends ItemViewBinder<Column, ColumnItemViewBinder.ViewHolder> {

    private Context mContext;

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_column, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Column column) {
        holder.mColumn_red.setImageResource(column.getColimnImage());
        holder.mColumn_name.setText(column.getColumnName());
        holder.mColumn_more.setText(column.getMoreName());
        holder.mColumn_right.setImageResource(column.getRightImage());
        holder.mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "电影频道查看更多", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mColumn_red;
        private TextView mColumn_name;
        private TextView mColumn_more;
        private ImageView mColumn_right;
        private final View mItemView;

        public ViewHolder(View itemView) {
            super(itemView);
            mItemView = itemView;
            mContext = itemView.getContext();
            mColumn_red = itemView.findViewById(R.id.column_iv_red);
            mColumn_name = itemView.findViewById(R.id.column_tv_name);
            mColumn_more = itemView.findViewById(R.id.column_tv_more);
            mColumn_right = itemView.findViewById(R.id.column_iv_right);
        }
    }
}
