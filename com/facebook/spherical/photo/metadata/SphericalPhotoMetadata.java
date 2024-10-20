package com.facebook.spherical.photo.metadata;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SphericalPhotoMetadata.class */
public final class SphericalPhotoMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(30);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final double A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;

    public SphericalPhotoMetadata(Parcel parcel) {
        this.A08 = C3o5.A01(parcel, this);
        this.A09 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A0J = AbN.A1U(parcel);
        this.A0C = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
        this.A05 = parcel.readDouble();
        this.A06 = parcel.readDouble();
        this.A07 = parcel.readDouble();
        this.A0E = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0H = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A0I = C3o5.A0O(parcel);
        this.A0G = parcel.readInt();
    }

    public SphericalPhotoMetadata(String str, String str2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        this.A08 = i;
        this.A09 = i2;
        this.A0A = i3;
        this.A0B = i4;
        this.A0J = z;
        this.A0C = i5;
        this.A0D = i6;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        this.A03 = d4;
        this.A04 = d5;
        this.A05 = d6;
        this.A06 = d7;
        this.A07 = d8;
        this.A0E = i7;
        this.A0F = i8;
        this.A0H = str;
        this.A0I = str2;
        this.A0G = i9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SphericalPhotoMetadata)) {
                return false;
            }
            SphericalPhotoMetadata sphericalPhotoMetadata = (SphericalPhotoMetadata) obj;
            if (this.A08 != sphericalPhotoMetadata.A08 || this.A09 != sphericalPhotoMetadata.A09 || this.A0A != sphericalPhotoMetadata.A0A || this.A0B != sphericalPhotoMetadata.A0B || this.A0J != sphericalPhotoMetadata.A0J || this.A0C != sphericalPhotoMetadata.A0C || this.A0D != sphericalPhotoMetadata.A0D || this.A00 != sphericalPhotoMetadata.A00 || this.A01 != sphericalPhotoMetadata.A01 || this.A02 != sphericalPhotoMetadata.A02 || this.A03 != sphericalPhotoMetadata.A03 || this.A04 != sphericalPhotoMetadata.A04 || this.A05 != sphericalPhotoMetadata.A05 || this.A06 != sphericalPhotoMetadata.A06 || this.A07 != sphericalPhotoMetadata.A07 || this.A0E != sphericalPhotoMetadata.A0E || this.A0F != sphericalPhotoMetadata.A0F || !11T.A0O(this.A0H, sphericalPhotoMetadata.A0H) || !11T.A0O(this.A0I, sphericalPhotoMetadata.A0I) || this.A0G != sphericalPhotoMetadata.A0G) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A0I, C1pq.A04(this.A0H, (((C1pq.A00(this.A07, C1pq.A00(this.A06, C1pq.A00(this.A05, C1pq.A00(this.A04, C1pq.A00(this.A03, C1pq.A00(this.A02, C1pq.A00(this.A01, C1pq.A00(this.A00, (((C1pq.A02(((((((this.A08 + 31) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A0B, this.A0J) * 31) + this.A0C) * 31) + this.A0D)))))))) * 31) + this.A0E) * 31) + this.A0F)) * 31) + this.A0G;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0D);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
        parcel.writeDouble(this.A05);
        parcel.writeDouble(this.A06);
        parcel.writeDouble(this.A07);
        parcel.writeInt(this.A0E);
        parcel.writeInt(this.A0F);
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        parcel.writeInt(this.A0G);
    }
}
