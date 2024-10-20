package com.facebook.payments.checkout.model;

import X.11T;
import X.4YV;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.errors.model.PaymentsError;

/* loaded from: PaymentsSessionStatusData.class */
public final class PaymentsSessionStatusData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(14);
    public final PaymentsError A00;
    public final PaymentsSessionData A01;
    public final String A02;

    public PaymentsSessionStatusData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt() == 0 ? null : (PaymentsError) PaymentsError.CREATOR.createFromParcel(parcel);
        this.A02 = parcel.readString();
        this.A01 = (PaymentsSessionData) parcel.readParcelable(A0e);
    }

    public PaymentsSessionStatusData(PaymentsError paymentsError, PaymentsSessionData paymentsSessionData, String str) {
        this.A00 = paymentsError;
        C1pq.A08("paymentStatus", str);
        this.A02 = str;
        C1pq.A08("paymentsSessionData", paymentsSessionData);
        this.A01 = paymentsSessionData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsSessionStatusData)) {
                return false;
            }
            PaymentsSessionStatusData paymentsSessionStatusData = (PaymentsSessionStatusData) obj;
            if (!11T.A0O(this.A00, paymentsSessionStatusData.A00) || !11T.A0O(this.A02, paymentsSessionStatusData.A02) || !11T.A0O(this.A01, paymentsSessionStatusData.A01)) {
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
        PaymentsError paymentsError = this.A00;
        if (paymentsError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentsError.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }
}
