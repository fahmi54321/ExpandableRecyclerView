package com.android.a34expandablerecyclerview.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.a34expandablerecyclerview.R;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

public class TitleParentsViewHolder extends ParentViewHolder {

    public TextView textView;
    public ImageButton imageButton;

    public TitleParentsViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.parentTitle);
        imageButton = (ImageButton) itemView.findViewById(R.id.expandArrow);
    }
}
