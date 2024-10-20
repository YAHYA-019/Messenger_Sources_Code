package com.facebook.payments.p2m.nux.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: P2mNuxModel.class */
public final class P2mNuxModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(72);
    public final int A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public P2mNuxModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        int readInt = parcel.readInt();
        P2mNuxValuePropModel[] p2mNuxValuePropModelArr = new P2mNuxValuePropModel[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, p2mNuxValuePropModelArr, i);
        }
        this.A01 = ImmutableList.copyOf(p2mNuxValuePropModelArr);
    }

    public P2mNuxModel(ImmutableList immutableList, String str, String str2, String str3, String str4, int i) {
        C1pq.A08("nuxSubtitle", str);
        this.A02 = str;
        C1pq.A08("nuxTitle", str2);
        this.A03 = str2;
        this.A00 = i;
        C1pq.A08("primaryCtaTitle", str3);
        this.A04 = str3;
        C1pq.A08("secondaryCtaTitle", str4);
        this.A05 = str4;
        C1pq.A08("valueProps", immutableList);
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2mNuxModel)) {
                return false;
            }
            P2mNuxModel p2mNuxModel = (P2mNuxModel) obj;
            if (!11T.A0O(this.A02, p2mNuxModel.A02) || !11T.A0O(this.A03, p2mNuxModel.A03) || this.A00 != p2mNuxModel.A00 || !11T.A0O(this.A04, p2mNuxModel.A04) || !11T.A0O(this.A05, p2mNuxModel.A05) || !11T.A0O(this.A01, p2mNuxModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A05, C1pq.A04(this.A04, (C1pq.A04(this.A03, C1pq.A03(this.A02)) * 31) + this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((P2mNuxValuePropModel) A0b.next(), i);
        }
    }
}
