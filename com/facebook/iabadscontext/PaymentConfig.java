package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.7zM;
import X.AnonymousClass001;
import X.C04v;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: PaymentConfig.class */
public final class PaymentConfig extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(10);
    public final String A00;
    public final List A01;

    public PaymentConfig(String str, List list) {
        1BL.A1F(list, str);
        this.A01 = list;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentConfig)) {
                return false;
            }
            PaymentConfig paymentConfig = (PaymentConfig) obj;
            if (!11T.A0O(this.A01, paymentConfig.A01) || !11T.A0O(this.A00, paymentConfig.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PaymentConfig(supportedContainerTypes=");
        A0k.append(this.A01);
        A0k.append(", paymentMode=");
        return DKH.A0o(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeString(this.A00);
    }
}
