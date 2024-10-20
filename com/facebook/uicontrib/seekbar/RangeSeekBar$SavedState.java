package com.facebook.uicontrib.seekbar;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: RangeSeekBar$SavedState.class */
public final class RangeSeekBar$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = FKe.A00(91);
    public float A00;
    public float A01;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}
