package com.facebook.video.creativeediting.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbI;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FBPhotoSegment.class */
public final class FBPhotoSegment implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(3);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final FBLayoutTransform A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public FBPhotoSegment(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FBLayoutTransform) parcel.readParcelable(A0e);
        }
        this.A08 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0B = AbN.A1U(parcel);
        this.A03 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        this.A0A = C3o5.A0O(parcel);
        this.A04 = parcel.readInt();
    }

    public FBPhotoSegment(FBLayoutTransform fBLayoutTransform, Integer num, Integer num2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A05 = fBLayoutTransform;
        C1pq.A08("filePath", str);
        this.A08 = str;
        this.A02 = i3;
        this.A0B = z;
        this.A03 = i4;
        this.A06 = num;
        this.A09 = str2;
        this.A07 = num2;
        this.A0A = str3;
        this.A04 = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FBPhotoSegment)) {
                return false;
            }
            FBPhotoSegment fBPhotoSegment = (FBPhotoSegment) obj;
            if (this.A00 != fBPhotoSegment.A00 || this.A01 != fBPhotoSegment.A01 || !11T.A0O(this.A05, fBPhotoSegment.A05) || !11T.A0O(this.A08, fBPhotoSegment.A08) || this.A02 != fBPhotoSegment.A02 || this.A0B != fBPhotoSegment.A0B || this.A03 != fBPhotoSegment.A03 || !11T.A0O(this.A06, fBPhotoSegment.A06) || !11T.A0O(this.A09, fBPhotoSegment.A09) || !11T.A0O(this.A07, fBPhotoSegment.A07) || !11T.A0O(this.A0A, fBPhotoSegment.A0A) || this.A04 != fBPhotoSegment.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A0A, C1pq.A04(this.A07, C1pq.A04(this.A09, C1pq.A04(this.A06, (C1pq.A02((C1pq.A04(this.A08, C1pq.A04(this.A05, ((this.A00 + 31) * 31) + this.A01)) * 31) + this.A02, this.A0B) * 31) + this.A03)))) * 31) + this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A03);
        C3o5.A0f(parcel, this.A06);
        1BL.A13(parcel, this.A09);
        C3o5.A0f(parcel, this.A07);
        1BL.A13(parcel, this.A0A);
        parcel.writeInt(this.A04);
    }
}
