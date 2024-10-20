package com.fbpay.w3c;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.Km2;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Address.class */
public final class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(24);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public Address(Km2 km2) {
        this.A00 = km2.A00;
        this.A01 = km2.A01;
        this.A02 = km2.A02;
        this.A03 = km2.A03;
        this.A04 = km2.A04;
        this.A05 = km2.A05;
        this.A06 = km2.A06;
        this.A07 = km2.A07;
    }

    public Address(Parcel parcel) {
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
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            if (!11T.A0O(this.A00, address.A00) || !11T.A0O(this.A01, address.A01) || !11T.A0O(this.A02, address.A02) || !11T.A0O(this.A03, address.A03) || !11T.A0O(this.A04, address.A04) || !11T.A0O(this.A05, address.A05) || !11T.A0O(this.A06, address.A06) || !11T.A0O(this.A07, address.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
    }
}
