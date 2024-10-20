package com.facebook.messaging.tincan.database.models;

import X.11T;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RawTincanMessageContent.class */
public final class RawTincanMessageContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(84);
    public final long A00;
    public final long A01;
    public final String A02;
    public final byte[] A03;
    public final byte[] A04;

    public RawTincanMessageContent(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A04 = parcel.createByteArray();
        this.A03 = parcel.createByteArray();
        this.A02 = parcel.readString();
    }

    public RawTincanMessageContent(byte[] bArr, byte[] bArr2, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A02 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeByteArray(this.A04);
        parcel.writeByteArray(this.A03);
        parcel.writeString(this.A02);
    }
}
