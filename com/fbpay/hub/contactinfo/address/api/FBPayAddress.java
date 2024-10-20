package com.fbpay.hub.contactinfo.address.api;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FBPayAddress.class */
public final class FBPayAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGn(13);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public FBPayAddress(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
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
        this.A09 = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
    }

    public FBPayAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = null;
        this.A09 = false;
        this.A04 = null;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FBPayAddress)) {
                return false;
            }
            FBPayAddress fBPayAddress = (FBPayAddress) obj;
            if (!11T.A0O(this.A00, fBPayAddress.A00) || !11T.A0O(this.A01, fBPayAddress.A01) || !11T.A0O(this.A02, fBPayAddress.A02) || !11T.A0O(this.A03, fBPayAddress.A03) || this.A09 != fBPayAddress.A09 || !11T.A0O(this.A04, fBPayAddress.A04) || !11T.A0O(this.A05, fBPayAddress.A05) || !11T.A0O(this.A06, fBPayAddress.A06) || !11T.A0O(this.A07, fBPayAddress.A07) || !11T.A0O(this.A08, fBPayAddress.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A09))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
    }
}
