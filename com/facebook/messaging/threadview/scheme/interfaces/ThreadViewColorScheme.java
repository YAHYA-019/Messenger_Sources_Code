package com.facebook.messaging.threadview.scheme.interfaces;

import X.11T;
import X.4YV;
import X.82M;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ThreadViewColorScheme.class */
public final class ThreadViewColorScheme implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(95);
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
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final MigColorScheme A0F;
    public final String A0G;
    public final int A0H;
    public final int A0I;

    public ThreadViewColorScheme(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A0H = parcel.readInt();
        this.A0G = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A0F = (MigColorScheme) parcel.readParcelable(A0e);
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0I = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0E = parcel.readInt();
    }

    public ThreadViewColorScheme(MigColorScheme migColorScheme, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.A00 = i;
        this.A0H = i2;
        this.A0G = str;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A04 = i6;
        this.A0F = migColorScheme;
        this.A05 = i7;
        this.A06 = i8;
        this.A07 = i9;
        this.A08 = i10;
        this.A09 = ActionId.APPLY_FINISHED_LIST_AGAIN;
        this.A0I = ActionId.APPLY_FINISHED_LIST_AGAIN;
        this.A0A = i11;
        this.A0B = i12;
        this.A0C = i13;
        this.A0D = i14;
        this.A0E = i15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadViewColorScheme)) {
                return false;
            }
            ThreadViewColorScheme threadViewColorScheme = (ThreadViewColorScheme) obj;
            if (this.A00 != threadViewColorScheme.A00 || this.A0H != threadViewColorScheme.A0H || !11T.A0O(this.A0G, threadViewColorScheme.A0G) || this.A01 != threadViewColorScheme.A01 || this.A02 != threadViewColorScheme.A02 || this.A03 != threadViewColorScheme.A03 || this.A04 != threadViewColorScheme.A04 || !11T.A0O(this.A0F, threadViewColorScheme.A0F) || this.A05 != threadViewColorScheme.A05 || this.A06 != threadViewColorScheme.A06 || this.A07 != threadViewColorScheme.A07 || this.A08 != threadViewColorScheme.A08 || this.A09 != threadViewColorScheme.A09 || this.A0I != threadViewColorScheme.A0I || this.A0A != threadViewColorScheme.A0A || this.A0B != threadViewColorScheme.A0B || this.A0C != threadViewColorScheme.A0C || this.A0D != threadViewColorScheme.A0D || this.A0E != threadViewColorScheme.A0E) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((C1pq.A04(this.A0F, (((((((C1pq.A04(this.A0G, ((this.A00 + 31) * 31) + this.A0H) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A07) * 31) + this.A08) * 31) + this.A09) * 31) + this.A0I) * 31) + this.A0A) * 31) + this.A0B) * 31) + this.A0C) * 31) + this.A0D) * 31) + this.A0E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A0E);
    }
}
