package com.facebook.http.observer;

import X.4YW;
import X.82M;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdaptiveParameter.class */
public final class AdaptiveParameter implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(4);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AdaptiveParameter() {
        this(0);
    }

    public AdaptiveParameter(int i) {
        this.A0B = false;
        this.A0D = false;
        this.A0C = false;
        this.A06 = 0;
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A05 = 0;
        this.A0A = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A04 = i;
        this.A00 = i;
    }

    public AdaptiveParameter(Parcel parcel) {
        boolean z = true;
        this.A0B = AnonymousClass001.A1N(parcel.readByte());
        this.A0D = 4YW.A0K(parcel);
        this.A0C = parcel.readByte() == 0 ? false : z;
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04);
    }
}
