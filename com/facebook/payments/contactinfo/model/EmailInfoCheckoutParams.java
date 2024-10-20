package com.facebook.payments.contactinfo.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EmailInfoCheckoutParams.class */
public final class EmailInfoCheckoutParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(36);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public EmailInfoCheckoutParams(Parcel parcel) {
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
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EmailInfoCheckoutParams)) {
                return false;
            }
            EmailInfoCheckoutParams emailInfoCheckoutParams = (EmailInfoCheckoutParams) obj;
            if (!11T.A0O(this.A00, emailInfoCheckoutParams.A00) || !11T.A0O(this.A01, emailInfoCheckoutParams.A01) || !11T.A0O(this.A02, emailInfoCheckoutParams.A02) || !11T.A0O(this.A03, emailInfoCheckoutParams.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
