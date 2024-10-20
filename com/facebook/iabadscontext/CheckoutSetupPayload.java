package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckoutSetupPayload.class */
public final class CheckoutSetupPayload extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(95);
    public final Availability A00;
    public final PaymentConfig A01;
    public final ReceiverInfo A02;

    public CheckoutSetupPayload(Availability availability, PaymentConfig paymentConfig, ReceiverInfo receiverInfo) {
        1BL.A1F(paymentConfig, availability);
        this.A01 = paymentConfig;
        this.A00 = availability;
        this.A02 = receiverInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutSetupPayload)) {
                return false;
            }
            CheckoutSetupPayload checkoutSetupPayload = (CheckoutSetupPayload) obj;
            if (!11T.A0O(this.A01, checkoutSetupPayload.A01) || !11T.A0O(this.A00, checkoutSetupPayload.A00) || !11T.A0O(this.A02, checkoutSetupPayload.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, 1BL.A03(this.A01)) + AnonymousClass001.A02(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CheckoutSetupPayload(paymentConfig=");
        A0k.append(this.A01);
        A0k.append(", availability=");
        A0k.append(this.A00);
        A0k.append(", receiverInfo=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        this.A00.writeToParcel(parcel, i);
        ReceiverInfo receiverInfo = this.A02;
        if (receiverInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            receiverInfo.writeToParcel(parcel, i);
        }
    }
}
