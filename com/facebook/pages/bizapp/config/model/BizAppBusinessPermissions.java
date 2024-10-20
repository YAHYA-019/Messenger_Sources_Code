package com.facebook.pages.bizapp.config.model;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BizAppBusinessPermissions.class */
public final class BizAppBusinessPermissions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(24);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public BizAppBusinessPermissions(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = 1BM.A07(parcel);
        this.A02 = 1BM.A07(parcel);
        this.A03 = 1BM.A07(parcel);
        this.A04 = 1BM.A07(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = 1BM.A07(parcel);
        this.A0B = AbJ.A1W(parcel);
    }

    public BizAppBusinessPermissions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
        this.A06 = z7;
        this.A07 = z8;
        this.A08 = z9;
        this.A09 = z10;
        this.A0A = z11;
        this.A0B = z12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BizAppBusinessPermissions)) {
                return false;
            }
            BizAppBusinessPermissions bizAppBusinessPermissions = (BizAppBusinessPermissions) obj;
            if (this.A00 != bizAppBusinessPermissions.A00 || this.A01 != bizAppBusinessPermissions.A01 || this.A02 != bizAppBusinessPermissions.A02 || this.A03 != bizAppBusinessPermissions.A03 || this.A04 != bizAppBusinessPermissions.A04 || this.A05 != bizAppBusinessPermissions.A05 || this.A06 != bizAppBusinessPermissions.A06 || this.A07 != bizAppBusinessPermissions.A07 || this.A08 != bizAppBusinessPermissions.A08 || this.A09 != bizAppBusinessPermissions.A09 || this.A0A != bizAppBusinessPermissions.A0A || this.A0B != bizAppBusinessPermissions.A0B) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A00), this.A01), this.A02), this.A03), this.A04), this.A05), this.A06), this.A07), this.A08), this.A09), this.A0A), this.A0B);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
    }
}
