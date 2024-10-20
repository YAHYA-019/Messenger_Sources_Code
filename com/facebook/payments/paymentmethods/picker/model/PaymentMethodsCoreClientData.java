package com.facebook.payments.paymentmethods.picker.model;

import X.1BL;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.paymentmethods.model.PaymentMethodsInfo;
import com.facebook.payments.picker.model.CoreClientData;
import com.facebook.payments.picker.model.ProductCoreClientData;

/* loaded from: PaymentMethodsCoreClientData.class */
public final class PaymentMethodsCoreClientData implements CoreClientData {
    public static final Parcelable.Creator CREATOR = FKd.A00(71);
    public final PaymentMethodsInfo A00;

    public PaymentMethodsCoreClientData(Parcel parcel) {
        this.A00 = (PaymentMethodsInfo) 1BL.A0C(parcel, PaymentMethodsInfo.class);
        parcel.readParcelable(ProductCoreClientData.class.getClassLoader());
    }

    public PaymentMethodsCoreClientData(PaymentMethodsInfo paymentMethodsInfo) {
        paymentMethodsInfo.getClass();
        this.A00 = paymentMethodsInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(null, i);
    }
}
