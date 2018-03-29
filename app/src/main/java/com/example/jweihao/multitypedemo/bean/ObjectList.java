package com.example.jweihao.multitypedemo.bean;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/28 0028 5:56
 */

import java.util.List;

public class ObjectList {
    private List<Object> mObjectList;

    public ObjectList(List<Object> objectList) {
        mObjectList = objectList;
    }

    public List<Object> getObjectList() {
        return mObjectList;
    }

    public void setObjectList(List<Object> objectList) {
        mObjectList = objectList;
    }
}
