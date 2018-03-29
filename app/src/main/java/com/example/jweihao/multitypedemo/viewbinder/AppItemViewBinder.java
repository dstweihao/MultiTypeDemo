package com.example.jweihao.multitypedemo.viewbinder;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/27 0027 23:34
 */

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jweihao.multitypedemo.R;
import com.example.jweihao.multitypedemo.bean.App;

import org.w3c.dom.Text;

import me.drakeet.multitype.ItemViewBinder;

public class AppItemViewBinder extends ItemViewBinder<App, AppItemViewBinder.ViewHolder> {

    private Context mContext;

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_app, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull final App item) {
        holder.mImage.setImageResource(item.getAppImage());
        holder.mName.setText(item.getAppName());
        holder.mGrade.setText(item.getAppGrade());
        holder.mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, item.getAppName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView mImage;
        private final TextView  mName;
        private final TextView  mGrade;
        private final View      mItemView;

        public ViewHolder(View itemView) {
            super(itemView);
            mItemView = itemView;
            mContext = itemView.getContext();
            mImage = itemView.findViewById(R.id.imageView);
            mName = itemView.findViewById(R.id.nameTextView);
            mGrade = itemView.findViewById(R.id.ratingTextView);

        }
    }
}
