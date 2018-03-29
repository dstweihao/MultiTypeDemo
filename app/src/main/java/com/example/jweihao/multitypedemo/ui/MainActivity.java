package com.example.jweihao.multitypedemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jweihao.multitypedemo.R;
import com.example.jweihao.multitypedemo.bean.App;
import com.example.jweihao.multitypedemo.bean.AppList;
import com.example.jweihao.multitypedemo.bean.Column;
import com.example.jweihao.multitypedemo.bean.Label;
import com.example.jweihao.multitypedemo.bean.LabelList;
import com.example.jweihao.multitypedemo.bean.ObjectList;
import com.example.jweihao.multitypedemo.viewbinder.AppItemViewBinder;
import com.example.jweihao.multitypedemo.viewbinder.AppListItemViewBinder;
import com.example.jweihao.multitypedemo.viewbinder.ColumnItemViewBinder;
import com.example.jweihao.multitypedemo.viewbinder.GridLayoutItemViewBinder;
import com.example.jweihao.multitypedemo.viewbinder.HorizontalItemViewBinder;
import com.example.jweihao.multitypedemo.viewbinder.LabelItemViewBinder;
import com.example.jweihao.multitypedemo.viewbinder.LabelListItemViewBinder;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class MainActivity extends AppCompatActivity {

    private MultiTypeAdapter mMultiTypeAdapter;
    private Items mItems = new Items();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        mMultiTypeAdapter = new MultiTypeAdapter();
        //注册类型和View的对应关系
//        //RecyclerView嵌套RecyclerView,水平滑动，只需提供数据bean，初始化布局ItemViewBinder即可。
//        mMultiTypeAdapter.register(ObjectList.class, new HorizontalItemViewBinder(Label.class,new LabelItemViewBinder()));
        //RecyclerView嵌套RecyclerView,网格布局，只需提供数据bean，初始化布局ItemViewBinder即可。
//        mMultiTypeAdapter.register(ObjectList.class, new GridLayoutItemViewBinder(Label.class,new LabelItemViewBinder(),4));
        mMultiTypeAdapter.register(LabelList.class, new LabelListItemViewBinder());
        mMultiTypeAdapter.register(Column.class, new ColumnItemViewBinder());
        mMultiTypeAdapter.register(AppList.class, new AppListItemViewBinder());
//        mMultiTypeAdapter.register(ObjectList.class, new HorizontalItemViewBinder(App.class,new AppItemViewBinder()));

        recyclerView.setAdapter(mMultiTypeAdapter);

        //初始化数据
        //标签数据
        List<Label> labelList = new ArrayList<>();
        labelList.add(new Label("排行榜"));
        labelList.add(new Label("游戏"));
        labelList.add(new Label("类别"));
        labelList.add(new Label("家庭"));
        labelList.add(new Label("抢先体验"));
        labelList.add(new Label("编辑精选"));
        labelList.add(new Label("付费内容"));
        mItems.add(new LabelList(labelList));
//        //标签数据
//        List<Object> labelList = new ArrayList<>();
//        labelList.add(new Label("排行榜"));
//        labelList.add(new Label("游戏"));
//        labelList.add(new Label("类别"));
//        labelList.add(new Label("家庭"));
//        labelList.add(new Label("抢先体验"));
//        labelList.add(new Label("编辑精选"));
//        labelList.add(new Label("付费内容"));
//        mItems.add(new ObjectList(labelList));


        //添加栏目
        mItems.add(new Column(
                R.drawable.shape_red_rectangles,
                "专门为您推荐",
                "更多",
                R.mipmap.tv_right
        ));

        //App数据
        List<App> appLists = new ArrayList<>();
        appLists.add(new App(R.drawable.ic_docs_48dp, "Docs", "4.5"));
        appLists.add(new App(R.drawable.ic_drive_48dp, "Drive", "3.5"));
        appLists.add(new App(R.drawable.ic_gmail_48dp, "Gmail", "2.8"));
        appLists.add(new App(R.drawable.ic_google_48dp, "Google+", "4.9"));
        appLists.add(new App(R.drawable.ic_hangouts_48dp, "Hangouts", "3.2"));
        appLists.add(new App(R.drawable.ic_inbox_48dp, "Inbox", "2.1"));
        appLists.add(new App(R.drawable.ic_keep_48dp, "Keep", "1.7"));
        appLists.add(new App(R.drawable.ic_messenger_48dp, "Messenger", "4.7"));
        appLists.add(new App(R.drawable.ic_photos_48dp, "Photos", "3.5"));
        appLists.add(new App(R.drawable.ic_sheets_48dp, "Sheets", "3.6"));
        appLists.add(new App(R.drawable.ic_slides_48dp, "Slides", "4.7"));
        mItems.add(new AppList(appLists));

//        //App数据,优化写法
//
//        List<Object> objects = new ArrayList<>();
//        objects.add(new App(R.drawable.ic_docs_48dp, "Docs", "4.5"));
//        objects.add(new App(R.drawable.ic_drive_48dp, "Drive", "3.5"));
//        objects.add(new App(R.drawable.ic_gmail_48dp, "Gmail", "2.8"));
//        objects.add(new App(R.drawable.ic_google_48dp, "Google+", "4.9"));
//        objects.add(new App(R.drawable.ic_hangouts_48dp, "Hangouts", "3.2"));
//        objects.add(new App(R.drawable.ic_inbox_48dp, "Inbox", "2.1"));
//        objects.add(new App(R.drawable.ic_keep_48dp, "Keep", "1.7"));
//        objects.add(new App(R.drawable.ic_messenger_48dp, "Messenger", "4.7"));
//        objects.add(new App(R.drawable.ic_photos_48dp, "Photos", "3.5"));
//        objects.add(new App(R.drawable.ic_sheets_48dp, "Sheets", "3.6"));
//        objects.add(new App(R.drawable.ic_slides_48dp, "Slides", "4.7"));
//        mItems.add(new ObjectList(objects));

        mMultiTypeAdapter.setItems(mItems);
        mMultiTypeAdapter.notifyDataSetChanged();
    }
}
