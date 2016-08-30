package com.augmentis.ayp.dnd;

import android.graphics.PointF;

/**
 * Created by Noppharat on 8/30/2016.
 */
public class Box {
    PointF mStart;
    PointF mEnd;


    public PointF getStart() {
        return mStart;
    }

    public void setStart(PointF mStart) {
        this.mStart = mStart;
    }

    public PointF getEnd() {
        return mEnd;
    }

    public void setEnd(PointF mEnd) {
        this.mEnd = mEnd;
    }
}
