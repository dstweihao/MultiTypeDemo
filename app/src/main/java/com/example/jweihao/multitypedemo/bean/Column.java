package com.example.jweihao.multitypedemo.bean;

/**
 * Created by weihao on 2018/3/27.
 */

public class Column {
    private int columnImage;
    private String columnName;
    private String moreName;
    private int rightImage;

    public Column(int colimnImage, String columnName, String moreName, int rightImage) {
        this.columnImage = colimnImage;
        this.columnName = columnName;
        this.moreName = moreName;
        this.rightImage = rightImage;
    }

    public int getColimnImage() {
        return columnImage;
    }

    public void setColimnImage(int colimnImage) {
        this.columnImage = colimnImage;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getMoreName() {
        return moreName;
    }

    public void setMoreName(String moreName) {
        this.moreName = moreName;
    }

    public int getRightImage() {
        return rightImage;
    }

    public void setRightImage(int rightImage) {
        this.rightImage = rightImage;
    }
}
