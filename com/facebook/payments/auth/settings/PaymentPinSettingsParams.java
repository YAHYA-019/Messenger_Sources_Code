package com.facebook.payments.auth.settings;

import X.1BL;
import X.4YW;
import X.FKY;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;

/* loaded from: PaymentPinSettingsParams.class */
public final class PaymentPinSettingsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(43);
    public final Intent A00;
    public final PaymentsDecoratorParams A01;
    public final boolean A02;

    public PaymentPinSettingsParams(Intent intent, PaymentsDecoratorParams paymentsDecoratorParams, boolean z) {
        paymentsDecoratorParams.getClass();
        this.A01 = paymentsDecoratorParams;
        this.A00 = intent;
        this.A02 = z;
    }

    public PaymentPinSettingsParams(Parcel parcel) {
        this.A01 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A00 = (Intent) 1BL.A0C(parcel, Intent.class);
        this.A02 = 4YW.A0K(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }
}
