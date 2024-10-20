package com.facebook.video.creativeediting.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.InspirationVideoCropParams;
import com.google.common.collect.ImmutableList;

/* loaded from: FBVideoSegment.class */
public final class FBVideoSegment implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(4);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final FBLayoutTransform A09;
    public final ImmutableList A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;

    public FBVideoSegment(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readInt();
        this.A08 = parcel.readLong();
        this.A0D = parcel.readString();
        int i = 0;
        this.A0G = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = parcel.readInt();
        this.A0H = AbJ.A1V(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (FBLayoutTransform) parcel.readParcelable(A0e);
        }
        this.A03 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A04 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A0C = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        this.A0F = C3o5.A0O(parcel);
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        int readInt = parcel.readInt();
        InspirationVideoCropParams[] inspirationVideoCropParamsArr = new InspirationVideoCropParams[readInt];
        while (i < readInt) {
            i = DKG.A02(parcel, InspirationVideoCropParams.CREATOR, inspirationVideoCropParamsArr, i);
        }
        this.A0A = ImmutableList.copyOf(inspirationVideoCropParamsArr);
        this.A07 = parcel.readInt();
    }

    public FBVideoSegment(FBLayoutTransform fBLayoutTransform, ImmutableList immutableList, Integer num, Integer num2, String str, String str2, String str3, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z, boolean z2) {
        this.A01 = i;
        this.A08 = j;
        C1pq.A08("filePath", str);
        this.A0D = str;
        this.A0G = z;
        this.A02 = i2;
        this.A0H = z2;
        this.A09 = fBLayoutTransform;
        this.A03 = i3;
        this.A00 = f;
        this.A04 = i4;
        this.A0B = num;
        this.A0E = str2;
        this.A0C = num2;
        this.A0F = str3;
        this.A05 = i5;
        this.A06 = i6;
        C1pq.A08("videoCropParams", immutableList);
        this.A0A = immutableList;
        this.A07 = i7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FBVideoSegment)) {
                return false;
            }
            FBVideoSegment fBVideoSegment = (FBVideoSegment) obj;
            if (this.A01 != fBVideoSegment.A01 || this.A08 != fBVideoSegment.A08 || !11T.A0O(this.A0D, fBVideoSegment.A0D) || this.A0G != fBVideoSegment.A0G || this.A02 != fBVideoSegment.A02 || this.A0H != fBVideoSegment.A0H || !11T.A0O(this.A09, fBVideoSegment.A09) || this.A03 != fBVideoSegment.A03 || this.A00 != fBVideoSegment.A00 || this.A04 != fBVideoSegment.A04 || !11T.A0O(this.A0B, fBVideoSegment.A0B) || !11T.A0O(this.A0E, fBVideoSegment.A0E) || !11T.A0O(this.A0C, fBVideoSegment.A0C) || !11T.A0O(this.A0F, fBVideoSegment.A0F) || this.A05 != fBVideoSegment.A05 || this.A06 != fBVideoSegment.A06 || !11T.A0O(this.A0A, fBVideoSegment.A0A) || this.A07 != fBVideoSegment.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A0A, (((C1pq.A04(this.A0F, C1pq.A04(this.A0C, C1pq.A04(this.A0E, C1pq.A04(this.A0B, (AbM.A00((C1pq.A04(this.A09, C1pq.A02((C1pq.A02(C1pq.A04(this.A0D, C1pq.A01(this.A01 + 31, this.A08)), this.A0G) * 31) + this.A02, this.A0H)) * 31) + this.A03, this.A00) * 31) + this.A04)))) * 31) + this.A05) * 31) + this.A06) * 31) + this.A07;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0H ? 1 : 0);
        C3o5.A0d(parcel, this.A09, i);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A04);
        C3o5.A0f(parcel, this.A0B);
        1BL.A13(parcel, this.A0E);
        C3o5.A0f(parcel, this.A0C);
        1BL.A13(parcel, this.A0F);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A0A);
        while (A0b.hasNext()) {
            ((InspirationVideoCropParams) A0b.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A07);
    }
}
