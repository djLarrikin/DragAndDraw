package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by larrikin on 3/5/15.
 */
 //This comment fixes the jira test issue
 //This one really closes it for real
 //My bad its not closed its done
 //I don't even think comments are working
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = mCurrent = origin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin(){
        return mOrigin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }
}
