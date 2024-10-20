package com.facebook.rtc.interfaces;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RtcCallVideoOptions.class */
public final class RtcCallVideoOptions implements Parcelable {
    public static RtcCallVideoOptions A02 = new RtcCallVideoOptions(true, false);
    public static final Parcelable.Creator CREATOR = new FKW(94);
    public final boolean A00;
    public final boolean A01;

    public RtcCallVideoOptions(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
