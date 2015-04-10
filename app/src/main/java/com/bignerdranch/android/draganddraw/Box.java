package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by larrikin on 3/5/15.
 */

 //Maybe theyll work now
//Testing from inside Android studio
//need that error
//Lets try this new issue
//same problem right
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
