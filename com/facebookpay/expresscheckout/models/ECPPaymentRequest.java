package com.facebookpay.expresscheckout.models;

import X.11T;
import X.7zT;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.logging.LoggingPolicy;

/* loaded from: ECPPaymentRequest.class */
public final class ECPPaymentRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(42);
    public final int A00;
    public final CheckoutConfiguration A01;
    public final ECPConfirmationConfiguration A02;
    public final ECPPaymentConfiguration A03;
    public final EcpUIConfiguration A04;
    public final PaymentReceiverInfo A05;
    public final LoggingPolicy A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public ECPPaymentRequest(CheckoutConfiguration checkoutConfiguration, ECPConfirmationConfiguration eCPConfirmationConfiguration, ECPPaymentConfiguration eCPPaymentConfiguration, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, LoggingPolicy loggingPolicy, String str, String str2, String str3, String str4, int i, boolean z) {
        7zT.A1W(str, str2, ecpUIConfiguration, str3);
        this.A0A = str;
        this.A08 = str2;
        this.A04 = ecpUIConfiguration;
        this.A09 = str3;
        this.A07 = str4;
        this.A00 = i;
        this.A05 = paymentReceiverInfo;
        this.A01 = checkoutConfiguration;
        this.A03 = eCPPaymentConfiguration;
        this.A06 = loggingPolicy;
        this.A02 = eCPConfirmationConfiguration;
        this.A0B = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        this.A04.writeToParcel(parcel, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        PaymentReceiverInfo paymentReceiverInfo = this.A05;
        if (paymentReceiverInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentReceiverInfo.writeToParcel(parcel, i);
        }
        CheckoutConfiguration checkoutConfiguration = this.A01;
        if (checkoutConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkoutConfiguration.writeToParcel(parcel, i);
        }
        ECPPaymentConfiguration eCPPaymentConfiguration = this.A03;
        if (eCPPaymentConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPPaymentConfiguration.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A06, i);
        ECPConfirmationConfiguration eCPConfirmationConfiguration = this.A02;
        if (eCPConfirmationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPConfirmationConfiguration.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0B ? 1 : 0);
    }
}
