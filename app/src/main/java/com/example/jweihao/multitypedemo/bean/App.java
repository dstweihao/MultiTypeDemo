package com.example.jweihao.multitypedemo.bean;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/27 0027 23:30
 */

public class App {
    private int    appImage;
    private String appName;
    private String appGrade;

    public App(int appImage, String appName, String appGrade) {
        this.appImage = appImage;
        this.appName = appName;
        this.appGrade = appGrade;
    }

    public int getAppImage() {
        return appImage;
    }

    public void setAppImage(int appImage) {
        this.appImage = appImage;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppGrade() {
        return appGrade;
    }

    public void setAppGrade(String appGrade) {
        this.appGrade = appGrade;
    }
}
