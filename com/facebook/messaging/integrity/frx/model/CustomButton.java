package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.7zL;
import X.7zU;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomButton.class */
public final class CustomButton implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(89);
    public final String A00;
    public final String A01;

    public CustomButton(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public CustomButton(String str, String str2) {
        C1pq.A08("label", str);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CustomButton)) {
                return false;
            }
            CustomButton customButton = (CustomButton) obj;
            if (!11T.A0O(this.A00, customButton.A00) || !11T.A0O(this.A01, customButton.A01)) {
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
