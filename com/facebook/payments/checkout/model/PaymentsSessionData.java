package com.facebook.payments.checkout.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: PaymentsSessionData.class */
public final class PaymentsSessionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(13);
    public final String A00;
    public final String A01;
    public final String A02;

    public PaymentsSessionData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public PaymentsSessionData(String str, String str2) {
        C1pq.A08("iD", str);
        this.A00 = str;
        this.A02 = "INIT";
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsSessionData)) {
                return false;
            }
            PaymentsSessionData paymentsSessionData = (PaymentsSessionData) obj;
            if (!11T.A0O(this.A00, paymentsSessionData.A00) || !11T.A0O(this.A02, paymentsSessionData.A02) || !11T.A0O(this.A01, paymentsSessionData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
