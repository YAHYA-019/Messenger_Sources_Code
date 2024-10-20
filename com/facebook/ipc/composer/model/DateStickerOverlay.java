package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.AbI;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DateStickerOverlay.class */
public final class DateStickerOverlay implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(80);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public DateStickerOverlay(Parcel parcel) {
        this.A06 = 7zU.A0l(parcel, this);
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A05 = AbI.A0z(parcel);
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
    }

    public DateStickerOverlay(Integer num, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5) {
        C1pq.A08("color", str);
        this.A06 = str;
        C1pq.A08("dateStickerType", str2);
        this.A07 = str2;
        C1pq.A08("dateString", str3);
        this.A08 = str3;
        this.A00 = d;
        this.A01 = d2;
        C1pq.A08("timestamp", num);
        this.A05 = num;
        this.A02 = d3;
        this.A03 = d4;
        this.A04 = d5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DateStickerOverlay)) {
                return false;
            }
            DateStickerOverlay dateStickerOverlay = (DateStickerOverlay) obj;
            if (!11T.A0O(this.A06, dateStickerOverlay.A06) || !11T.A0O(this.A07, dateStickerOverlay.A07) || !11T.A0O(this.A08, dateStickerOverlay.A08) || this.A00 != dateStickerOverlay.A00 || this.A01 != dateStickerOverlay.A01 || !11T.A0O(this.A05, dateStickerOverlay.A05) || this.A02 != dateStickerOverlay.A02 || this.A03 != dateStickerOverlay.A03 || this.A04 != dateStickerOverlay.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A04, C1pq.A00(this.A03, C1pq.A00(this.A02, C1pq.A04(this.A05, C1pq.A00(this.A01, C1pq.A00(this.A00, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A03(this.A06)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A05.intValue());
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
    }
}
