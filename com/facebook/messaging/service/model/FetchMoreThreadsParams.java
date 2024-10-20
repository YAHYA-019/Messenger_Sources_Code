package com.facebook.messaging.service.model;

import X.1BL;
import X.1F9;
import X.1Hb;
import X.1He;
import X.1Hk;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: FetchMoreThreadsParams.class */
public final class FetchMoreThreadsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(41);
    public final int A00;
    public final int A01;
    public final long A02;
    public final 1He A03;
    public final 1F9 A04;
    public final 1Hb A05;
    public final ThreadKey A06;
    public final 1Hk A07;
    public final String A08;
    public final long A09;

    public FetchMoreThreadsParams(1F9 r302, 1Hk r303, int i, long j) {
        this(1He.A02, r302, 1Hb.A02, null, r303, -1, i, j, -1);
    }

    public FetchMoreThreadsParams(1He r302, 1F9 r303, 1Hb r304, ThreadKey threadKey, 1Hk r306, int i, int i2, long j, long j2) {
        this.A04 = r303;
        this.A05 = r304;
        this.A02 = j;
        this.A06 = threadKey;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = j2;
        this.A07 = r306;
        this.A03 = r302;
        this.A08 = null;
    }

    public FetchMoreThreadsParams(Parcel parcel) {
        this.A04 = 1F9.A00(parcel.readString());
        this.A05 = 1Hb.valueOf(parcel.readString());
        this.A02 = parcel.readLong();
        this.A06 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A09 = parcel.readLong();
        this.A07 = 1Hk.valueOf(parcel.readString());
        this.A03 = 1He.valueOf(parcel.readString());
        this.A08 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04.dbName);
        1BL.A12(parcel, this.A05);
        parcel.writeLong(this.A02);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A09);
        1BL.A12(parcel, this.A07);
        parcel.writeString(this.A03.toString());
        parcel.writeString(this.A08);
    }
}
