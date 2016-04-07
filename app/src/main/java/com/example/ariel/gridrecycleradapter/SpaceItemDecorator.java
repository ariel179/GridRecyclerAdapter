package com.example.ariel.gridrecycleradapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Ariel on 4/3/2016.
 */
public class SpaceItemDecorator extends RecyclerView.ItemDecoration {

    private final int mSpace;

    public SpaceItemDecorator(int mSpaceHeight) {
        this.mSpace = mSpaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        outRect.bottom = mSpace;

        outRect.right = mSpace;
        outRect.left = mSpace;


    }
}
