package com.facebook.payments.checkout.configuration.model;

import X.24X;
import X.2DM;
import X.C53v;
import X.DKG;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: CheckoutPaymentInfo.class */
public final class CheckoutPaymentInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(64);
    public final PaymentItemType A00;
    public final 2DM A01;
    public final String A02;
    public final String A03;

    public CheckoutPaymentInfo(Parcel parcel) {
        24X r303;
        this.A00 = DKG.A0k(parcel);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        try {
            r303 = DKH.A0c(parcel);
        } catch (Exception unused) {
            r303 = null;
        }
        this.A01 = (2DM) r303;
    }

    public CheckoutPaymentInfo(PaymentItemType paymentItemType, 2DM r303, String str, String str2) {
        this.A00 = paymentItemType;
        this.A03 = str2;
        this.A02 = str;
        this.A01 = r303;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        C53v.A0A(parcel, this.A01);
    }
}
