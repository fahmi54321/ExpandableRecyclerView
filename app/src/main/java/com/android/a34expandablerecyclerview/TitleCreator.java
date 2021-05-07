package com.android.a34expandablerecyclerview;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {

    static TitleCreator titleCreator;
    List<TitleParent> titleParents;

    //todo 2
    public TitleCreator(Context context) {
        titleParents = new ArrayList<>();
        for (int i = 1; i<=100;i++){
            TitleParent title = new TitleParent(String.format("Caller #%d",i));
            titleParents.add(title);
        }
    }


    //todo 1
    public static TitleCreator get(Context context) {
        if (titleCreator == null){
            titleCreator = new TitleCreator(context);
        }
        return titleCreator;
    }

    // todo function dari get All MainActivity
    public List<TitleParent> getAll() {
        return titleParents;
    }
}
