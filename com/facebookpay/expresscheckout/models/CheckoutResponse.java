package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.ENK;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutResponse.class */
public final class CheckoutResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(37);
    public final ENK A00;
    public final ECPPaymentResponseParams A01;
    public final String A02;
    public final String A03;

    public CheckoutResponse() {
        this(null, null, null, null);
    }

    public CheckoutResponse(ENK enk, ECPPaymentResponseParams eCPPaymentResponseParams, String str, String str2) {
        this.A03 = str;
        this.A00 = enk;
        this.A02 = str2;
        this.A01 = eCPPaymentResponseParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        ENK enk = this.A00;
        if (enk == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, enk);
        }
        parcel.writeString(this.A02);
        ECPPaymentResponseParams eCPPaymentResponseParams = this.A01;
        if (eCPPaymentResponseParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPPaymentResponseParams.writeToParcel(parcel, i);
        }
    }
}
