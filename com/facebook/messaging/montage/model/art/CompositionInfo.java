package com.facebook.messaging.montage.model.art;

import X.0S2;
import X.CST;
import X.HIK;
import X.HIL;
import X.I2u;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CompositionInfo.class */
public final class CompositionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(5);
    public final int A00;
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
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;

    public CompositionInfo(I2u i2u) {
        Integer num = i2u.A0C;
        num.getClass();
        this.A0C = num;
        Integer num2 = i2u.A0B;
        num2.getClass();
        this.A0B = num2;
        this.A0D = i2u.A0D;
        this.A00 = i2u.A00;
        this.A05 = i2u.A05;
        this.A0E = i2u.A0E;
        this.A07 = i2u.A07;
        this.A06 = i2u.A06;
        this.A09 = i2u.A09;
        this.A0L = i2u.A0K;
        this.A0A = i2u.A0A;
        this.A0K = i2u.A0J;
        this.A0F = i2u.A0F;
        this.A0I = null;
        this.A0J = i2u.A0I;
        this.A0G = i2u.A0G;
        this.A0H = i2u.A0H;
        this.A08 = i2u.A08;
        this.A01 = i2u.A01;
        this.A02 = i2u.A02;
        this.A03 = i2u.A03;
        this.A04 = i2u.A04;
    }

    public CompositionInfo(Parcel parcel) {
        Integer num;
        Integer num2;
        String readString = parcel.readString();
        Integer[] A00 = 0S2.A00(4);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                num = 0S2.A0N;
                break;
            }
            num = A00[i2];
            if (HIL.A00(num).equals(readString)) {
                break;
            } else {
                i = i2 + 1;
            }
        }
        this.A0C = num;
        String readString2 = parcel.readString();
        Integer[] A002 = 0S2.A00(7);
        int length2 = A002.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length2) {
                num2 = 0S2.A0u;
                break;
            }
            num2 = A002[i4];
            if (HIK.A00(num2).equals(readString2)) {
                break;
            } else {
                i3 = i4 + 1;
            }
        }
        this.A0B = num2;
        this.A00 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0L = parcel.readString();
        this.A0A = parcel.readInt();
        this.A0K = parcel.readString();
        this.A0F = parcel.readString();
        this.A0J = parcel.readString();
        this.A0D = parcel.readString();
        this.A0I = parcel.readString();
        this.A0G = parcel.readString();
        this.A0H = parcel.readString();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(HIL.A00(this.A0C));
        parcel.writeString(HIK.A00(this.A0B));
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0L);
        parcel.writeInt(this.A0A);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
    }
}
