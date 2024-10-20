package com.facebook.messaging.memories.share;

import X.11T;
import X.C04v;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MemoryShareMetadata.class */
public final class MemoryShareMetadata extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(41);
    public final long A00;
    public final long A01;
    public final Long A02;
    public final String A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public MemoryShareMetadata(Long l, Long l2, String str, String str2, String str3, long j, long j2) {
        C3o5.A0k(str, 3, str2);
        this.A02 = l;
        this.A01 = j;
        this.A03 = str;
        this.A00 = j2;
        this.A05 = str2;
        this.A06 = str3;
        this.A04 = l2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        C3o5.A0g(parcel, this.A02);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C3o5.A0g(parcel, this.A04);
    }
}
