package com.facebook.payments.p2m.attachreceipt.models;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmButtonComponent.class */
public final class ConfirmButtonComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(66);
    public final String A00;
    public final String A01;

    public ConfirmButtonComponent(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public ConfirmButtonComponent(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ConfirmButtonComponent)) {
                return false;
            }
            ConfirmButtonComponent confirmButtonComponent = (ConfirmButtonComponent) obj;
            if (!11T.A0O(this.A00, confirmButtonComponent.A00) || !11T.A0O(this.A01, confirmButtonComponent.A01)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
