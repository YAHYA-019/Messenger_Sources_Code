package com.facebook.drawingview.model;

import X.1BK;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedList;

/* loaded from: Stroke.class */
public final class Stroke implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = FKX.A00(64);
    public static final long serialVersionUID = 0;
    public LinkedList mDrawPoints;
    public boolean mIsCancelled;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(1BK.A17(this.mDrawPoints));
    }
}
