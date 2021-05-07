package com.android.a34expandablerecyclerview.ViewHolders;

import android.view.View;
import android.widget.TextView;

import com.android.a34expandablerecyclerview.R;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

public class TitleChildsViewHolder extends ChildViewHolder {

    public TextView option1,option2;

    public TitleChildsViewHolder(View itemView) {
        super(itemView);
        option1 = (TextView)itemView.findViewById(R.id.option1);
        option2 = (TextView)itemView.findViewById(R.id.option2);
    }
}
