package com.android.a34expandablerecyclerview;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

public class TitleParent implements ParentObject {

    private List<Object> childrentList;
    private UUID id;
    private String title;

    public TitleParent(String title) {
        this.title = title;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Object> getChildObjectList() {
        return childrentList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        childrentList = list;
    }
}
