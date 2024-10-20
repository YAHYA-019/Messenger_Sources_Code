package com.facebook.fbtrace;

import X.0Pz;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbTraceNode.class */
public final class FbTraceNode implements Parcelable {
    public static final FbTraceNode A03 = new FbTraceNode("invalid_id", "invalid_id", "invalid_id");
    public static final Parcelable.Creator CREATOR = new C4Ny(3);
    public final String A00;
    public final String A01;
    public final String A02;

    public FbTraceNode(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String A00() {
        return 0Pz.A0W(this.A02, this.A00);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
