package com.facebook.webrtc.models;

import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbWebrtcGenericDataMessage.class */
public final class FbWebrtcGenericDataMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(35);
    public final String A00;
    public final byte[] A01;

    public FbWebrtcGenericDataMessage(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }

    public FbWebrtcGenericDataMessage(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
