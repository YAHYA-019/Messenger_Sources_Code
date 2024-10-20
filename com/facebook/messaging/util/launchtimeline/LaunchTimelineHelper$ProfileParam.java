package com.facebook.messaging.util.launchtimeline;

import X.AbN;
import X.BLY;
import X.BLk;
import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LaunchTimelineHelper$ProfileParam.class */
public final class LaunchTimelineHelper$ProfileParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(87);
    public final BLk A00;
    public final BLY A01;
    public final String A02;
    public final boolean A03;

    public LaunchTimelineHelper$ProfileParam(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = AbN.A1U(parcel);
        this.A01 = C53v.A07(parcel, BLY.class);
        this.A00 = C53v.A07(parcel, BLk.class);
    }

    public LaunchTimelineHelper$ProfileParam(String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        C53v.A0J(parcel, this.A01);
        C53v.A0J(parcel, this.A00);
    }
}
