package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.DKI;
import X.FKa;
import X.GKr;
import X.ROM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MinutiaeTag.class */
public final class MinutiaeTag implements Parcelable, GKr {
    public static final Parcelable.Creator CREATOR = FKa.A00(99);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public MinutiaeTag(ROM rom) {
        this.A06 = rom.A06;
        this.A00 = rom.A00;
        this.A01 = rom.A01;
        this.A02 = rom.A02;
        this.A03 = rom.A03;
        this.A04 = rom.A04;
        this.A05 = rom.A05;
    }

    public MinutiaeTag(Parcel parcel) {
        this.A06 = DKI.A0k(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MinutiaeTag)) {
                return false;
            }
            MinutiaeTag minutiaeTag = (MinutiaeTag) obj;
            if (this.A06 != minutiaeTag.A06 || !11T.A0O(this.A00, minutiaeTag.A00) || !11T.A0O(this.A01, minutiaeTag.A01) || !11T.A0O(this.A02, minutiaeTag.A02) || !11T.A0O(this.A03, minutiaeTag.A03) || !11T.A0O(this.A04, minutiaeTag.A04) || !11T.A0O(this.A05, minutiaeTag.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A06)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06 ? 1 : 0);
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
