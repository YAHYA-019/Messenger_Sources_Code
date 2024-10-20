package com.facebook.widget.loadingindicator;

import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LoadingIndicatorState.class */
public final class LoadingIndicatorState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(37);
    public int A00;
    public Integer A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.intValue());
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }
}
