package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomExtensionScreenComponent.class */
public final class CustomExtensionScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(71);
    public final String A00;
    public final String A01;
    public final boolean A02;

    public CustomExtensionScreenComponent(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A02 = AbN.A1U(parcel);
        this.A01 = parcel.readString();
    }

    public CustomExtensionScreenComponent(String str, boolean z, String str2) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CustomExtensionScreenComponent)) {
                return false;
            }
            CustomExtensionScreenComponent customExtensionScreenComponent = (CustomExtensionScreenComponent) obj;
            if (!11T.A0O(this.A00, customExtensionScreenComponent.A00) || this.A02 != customExtensionScreenComponent.A02 || !11T.A0O(this.A01, customExtensionScreenComponent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
