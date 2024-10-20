package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AuthorizationData.class */
public final class AuthorizationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(0);
    public final String A00;
    public final String A01;

    public AuthorizationData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    public AuthorizationData(String str) {
        this.A00 = str;
        this.A01 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AuthorizationData)) {
                return false;
            }
            AuthorizationData authorizationData = (AuthorizationData) obj;
            if (!11T.A0O(this.A00, authorizationData.A00) || !11T.A0O(this.A01, authorizationData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
