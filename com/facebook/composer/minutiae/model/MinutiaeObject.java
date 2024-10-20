package com.facebook.composer.minutiae.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.DhC;
import X.DhD;
import X.DhE;
import X.FJ8;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MinutiaeObject.class */
public final class MinutiaeObject implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(7);
    public final DhC A00;
    public final DhD A01;
    public final DhE A02;
    public final String A03;
    public final boolean A04;

    public MinutiaeObject(DhC dhC, DhD dhD, DhE dhE, String str, boolean z) {
        this.A01 = dhD;
        this.A04 = z;
        this.A03 = str;
        this.A00 = dhC;
        this.A02 = dhE;
        if (dhC == null) {
            throw AnonymousClass001.A0N("Required attribute is null");
        }
    }

    public MinutiaeObject(Parcel parcel) {
        DhE dhE = null;
        if (C3o5.A01(parcel, this) != 0) {
            FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = FJ8.A01(parcel);
        }
        this.A04 = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = FJ8.A01(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? (DhE) FJ8.A01(parcel) : dhE;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MinutiaeObject)) {
                return false;
            }
            MinutiaeObject minutiaeObject = (MinutiaeObject) obj;
            if (!11T.A0O(this.A01, minutiaeObject.A01) || this.A04 != minutiaeObject.A04 || !11T.A0O(this.A03, minutiaeObject.A03) || !11T.A0O(this.A00, minutiaeObject.A00) || !11T.A0O(this.A02, minutiaeObject.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A01, 31), this.A04))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(0);
        DKH.A0y(parcel, this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        DKH.A0y(parcel, this.A00);
        DKH.A0y(parcel, this.A02);
    }
}
