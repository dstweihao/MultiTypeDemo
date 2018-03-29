package com.example.jweihao.multitypedemo.bean;
/*
 * 创建者 韦豪
 * 创建时间 2018/3/27 0027 22:17
 */

import java.util.List;

public class LabelList {
    private List<Label> mLabelLists;

    public LabelList(List<Label> labelLists) {
        mLabelLists = labelLists;
    }

    public List<Label> getLabelLists() {
        return mLabelLists;
    }

    public void setLabelLists(List<Label> labelLists) {
        mLabelLists = labelLists;
    }
}
