package com.facebook.presence.api.model;

import X.11T;
import X.1BL;
import X.C04v;
import X.C0dp;
import X.C2xc;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.emoji.model.Emoji;
import java.util.Iterator;
import java.util.List;

/* loaded from: RichStatus.class */
public final class RichStatus extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(50);
    public final double A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final NoteTypeEnum A09;
    public final Emoji A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final long A0L;
    public final LightweightInteractions A0M;
    public final boolean A0N;
    public final boolean A0O;

    public RichStatus(LightweightInteractions lightweightInteractions, NoteTypeEnum noteTypeEnum, Emoji emoji, Long l, String str, String str2, String str3, String str4, String str5, List list, double d, float f, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        11T.A0F(emoji, 3);
        11T.A0F(str, 4);
        11T.A0F(str2, 13);
        11T.A0F(noteTypeEnum, 14);
        11T.A0F(str3, 16);
        11T.A0F(str4, 17);
        11T.A0F(str5, 19);
        this.A04 = j;
        this.A05 = j2;
        this.A0A = emoji;
        this.A0G = str;
        this.A0B = l;
        this.A03 = j3;
        this.A0N = z;
        this.A01 = f;
        this.A02 = j4;
        this.A0I = z2;
        this.A0O = z3;
        this.A00 = d;
        this.A0D = str2;
        this.A09 = noteTypeEnum;
        this.A0L = j5;
        this.A0F = str3;
        this.A0E = str4;
        this.A07 = j6;
        this.A0C = str5;
        this.A08 = j7;
        this.A06 = j8;
        this.A0K = z4;
        this.A0H = list;
        this.A0M = lightweightInteractions;
        this.A0J = z5;
    }

    public final RichStatus A00(C0dp c0dp) {
        11T.A0F(c0dp, 0);
        if (A03(c0dp)) {
            return this;
        }
        return null;
    }

    public final String A01(Resources resources) {
        int i;
        Object[] objArr;
        if (this.A09 == NoteTypeEnum.A04) {
            i = 2131964581;
            objArr = new Object[]{this.A0G};
        } else {
            i = 2131964579;
            objArr = new Object[]{"��", this.A0F, this.A0E};
        }
        String string = resources.getString(i, objArr);
        11T.A0A(string);
        return string;
    }

    public final String A02(Resources resources) {
        int i;
        Object[] objArr;
        11T.A0F(resources, 0);
        if (this.A0N) {
            i = 2131964581;
            objArr = new Object[]{this.A0G};
        } else {
            i = 2131964580;
            objArr = new Object[]{this.A0A.A07(), this.A0G};
        }
        String string = resources.getString(i, objArr);
        11T.A0A(string);
        return string;
    }

    public final boolean A03(C0dp c0dp) {
        boolean z = false;
        11T.A0F(c0dp, 0);
        if (this.A03 > c0dp.now()) {
            z = true;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RichStatus)) {
                return false;
            }
            RichStatus richStatus = (RichStatus) obj;
            if (this.A04 != richStatus.A04 || this.A05 != richStatus.A05 || !11T.A0O(this.A0A, richStatus.A0A) || !11T.A0O(this.A0G, richStatus.A0G) || !11T.A0O(this.A0B, richStatus.A0B) || this.A03 != richStatus.A03 || this.A0N != richStatus.A0N || Float.compare(this.A01, richStatus.A01) != 0 || this.A02 != richStatus.A02 || this.A0I != richStatus.A0I || this.A0O != richStatus.A0O || Double.compare(this.A00, richStatus.A00) != 0 || !11T.A0O(this.A0D, richStatus.A0D) || this.A09 != richStatus.A09 || this.A0L != richStatus.A0L || !11T.A0O(this.A0F, richStatus.A0F) || !11T.A0O(this.A0E, richStatus.A0E) || this.A07 != richStatus.A07 || !11T.A0O(this.A0C, richStatus.A0C) || this.A08 != richStatus.A08 || this.A06 != richStatus.A06 || this.A0K != richStatus.A0K || !11T.A0O(this.A0H, richStatus.A0H) || !11T.A0O(this.A0M, richStatus.A0M) || this.A0J != richStatus.A0J) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A04;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A05;
        int hashCode = (((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A0A.hashCode()) * 31) + this.A0G.hashCode()) * 31;
        Long l = this.A0B;
        int i2 = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        long j3 = this.A03;
        int i3 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        int i4 = 1237;
        if (this.A0N) {
            i4 = 1231;
        }
        int floatToIntBits = (((i3 + i4) * 31) + Float.floatToIntBits(this.A01)) * 31;
        long j4 = this.A02;
        int i5 = (floatToIntBits + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        int i6 = 1237;
        if (this.A0I) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0O) {
            i8 = 1231;
        }
        int A01 = (((((((i7 + i8) * 31) + 1BL.A01(Double.doubleToLongBits(this.A00))) * 31) + this.A0D.hashCode()) * 31) + this.A09.hashCode()) * 31;
        long j5 = this.A0L;
        int hashCode3 = (((((A01 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.A0F.hashCode()) * 31) + this.A0E.hashCode()) * 31;
        long j6 = this.A07;
        int hashCode4 = (((hashCode3 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.A0C.hashCode()) * 31;
        long j7 = this.A08;
        int i9 = (hashCode4 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.A06;
        int i10 = (i9 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        int i11 = 1237;
        if (this.A0K) {
            i11 = 1231;
        }
        int hashCode5 = (((i10 + i11) * 31) + this.A0H.hashCode()) * 31;
        LightweightInteractions lightweightInteractions = this.A0M;
        if (lightweightInteractions != null) {
            i2 = lightweightInteractions.hashCode();
        }
        int i12 = (hashCode5 + i2) * 31;
        int i13 = 1237;
        if (this.A0J) {
            i13 = 1231;
        }
        return i12 + i13;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A0G);
        Long l = this.A0B;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A0D);
        this.A09.writeToParcel(parcel, i);
        parcel.writeLong(this.A0L);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A0K ? 1 : 0);
        List list = this.A0H;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((RichStatusMention) it.next()).writeToParcel(parcel, i);
        }
        LightweightInteractions lightweightInteractions = this.A0M;
        if (lightweightInteractions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lightweightInteractions.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0J ? 1 : 0);
    }
}
