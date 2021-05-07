package com.android.a34expandablerecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.a34expandablerecyclerview.R;
import com.android.a34expandablerecyclerview.TitleChild;
import com.android.a34expandablerecyclerview.TitleParent;
import com.android.a34expandablerecyclerview.ViewHolders.TitleChildsViewHolder;
import com.android.a34expandablerecyclerview.ViewHolders.TitleParentsViewHolder;
import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentsViewHolder, TitleChildsViewHolder> {

    //todo 1
    LayoutInflater inflater;

    //todo 2 constructor inflater
    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater = LayoutInflater.from(context);
    }

    //todo 3
    @Override
    public TitleParentsViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_parent,viewGroup,false);
        return new TitleParentsViewHolder(view);
    }

    //todo 4
    @Override
    public TitleChildsViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View  view = inflater.inflate(R.layout.list_child,viewGroup,false);
        return new TitleChildsViewHolder(view);
    }

    //todo 5
    @Override
    public void onBindParentViewHolder(TitleParentsViewHolder titleParentsViewHolder, int i, Object o) {
        TitleParent titleParent = (TitleParent) o;
        titleParentsViewHolder.textView.setText(titleParent.getTitle());
    }

    //todo 6
    @Override
    public void onBindChildViewHolder(TitleChildsViewHolder titleChildsViewHolder, int i, Object o) {
        TitleChild titleChild = (TitleChild) o;
        titleChildsViewHolder.option1.setText(titleChild.getOption1());
        titleChildsViewHolder.option2.setText(titleChild.getOption2());
    }
}
