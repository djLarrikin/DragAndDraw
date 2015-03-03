package com.bignerdranch.android.draganddraw;

import android.support.v4.app.Fragment;

/**
 * Created by larrikin on 3/3/15.
 */
public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new DragAndDrawFragment();
    }
}
