package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import X.RN6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.model.SelectablePrivacyData;

/* loaded from: PaymentsPrivacyData.class */
public final class PaymentsPrivacyData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(12);
    public final SelectablePrivacyData A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public PaymentsPrivacyData(RN6 rn6) {
        this.A01 = rn6.A01;
        this.A02 = rn6.A02;
        this.A00 = rn6.A00;
        String str = rn6.A03;
        AbF.A1V(str);
        this.A03 = str;
    }

    public PaymentsPrivacyData(Parcel parcel) {
        SelectablePrivacyData selectablePrivacyData = null;
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
        this.A00 = parcel.readInt() != 0 ? (SelectablePrivacyData) SelectablePrivacyData.CREATOR.createFromParcel(parcel) : selectablePrivacyData;
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsPrivacyData)) {
                return false;
            }
            PaymentsPrivacyData paymentsPrivacyData = (PaymentsPrivacyData) obj;
            if (!11T.A0O(this.A01, paymentsPrivacyData.A01) || !11T.A0O(this.A02, paymentsPrivacyData.A02) || !11T.A0O(this.A00, paymentsPrivacyData.A00) || !11T.A0O(this.A03, paymentsPrivacyData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        SelectablePrivacyData selectablePrivacyData = this.A00;
        if (selectablePrivacyData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectablePrivacyData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
    }
}
