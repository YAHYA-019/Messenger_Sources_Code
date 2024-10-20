package com.fbpay.w3c;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Phone.class */
public final class Phone implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGn(28);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Phone(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
        this.A02 = C3o5.A0O(parcel);
    }

    public Phone(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            if (!11T.A0O(this.A01, phone.A01) || !11T.A0O(this.A00, phone.A00) || !11T.A0O(this.A02, phone.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        AbN.A0s(parcel, this.A00);
        1BL.A13(parcel, this.A02);
    }
}
