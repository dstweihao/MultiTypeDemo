package com.example.jweihao.multitypedemo.bean;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/27 0027 23:30
 */

import java.util.List;

public class AppList {

    private List<App> mAppLists;

    public AppList(List<App> appLists) {
        mAppLists = appLists;
    }

    public List<App> getAppLists() {
        return mAppLists;
    }

    public void setAppLists(List<App> appLists) {
        mAppLists = appLists;
    }
}
