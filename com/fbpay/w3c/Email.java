package com.fbpay.w3c;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Email.class */
public final class Email implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGn(27);
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Email(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
    }

    public Email(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Email)) {
                return false;
            }
            Email email = (Email) obj;
            if (!11T.A0O(this.A01, email.A01) || !11T.A0O(this.A02, email.A02) || !11T.A0O(this.A00, email.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        AbN.A0s(parcel, this.A00);
    }
}
