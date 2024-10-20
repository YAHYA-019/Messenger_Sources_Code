package com.google.android.gms.internal.gtm;

import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: zzbk.class */
public final class zzbk implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(28);
    public String A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
