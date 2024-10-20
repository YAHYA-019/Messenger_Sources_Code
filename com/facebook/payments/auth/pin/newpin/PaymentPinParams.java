package com.facebook.payments.auth.pin.newpin;

import X.1BL;
import X.4YV;
import X.C53v;
import X.DKG;
import X.EO0;
import X.FKY;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.auth.pin.model.FbpayPin;
import com.facebook.payments.auth.pin.model.PaymentPin;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.google.common.base.MoreObjects;

/* loaded from: PaymentPinParams.class */
public final class PaymentPinParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(40);
    public final float A00;
    public final Intent A01;
    public final Bundle A02;
    public final Bundle A03;
    public final FbpayPin A04;
    public final PaymentPin A05;
    public final EO0 A06;
    public final EO0 A07;
    public final PaymentsDecoratorParams A08;
    public final PaymentsLoggingSessionData A09;
    public final PaymentItemType A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    public PaymentPinParams(Intent intent, Bundle bundle, Bundle bundle2, FbpayPin fbpayPin, PaymentPin paymentPin, EO0 eo0, EO0 eo02, PaymentsDecoratorParams paymentsDecoratorParams, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, String str, String str2, String str3, String str4, float f, boolean z, boolean z2) {
        eo0.getClass();
        this.A06 = eo0;
        paymentsDecoratorParams.getClass();
        this.A08 = paymentsDecoratorParams;
        this.A05 = eo0 == EO0.A02 ? (PaymentPin) MoreObjects.firstNonNull(paymentPin, PaymentPin.A00) : paymentPin;
        this.A01 = intent;
        this.A0E = str4;
        this.A0G = z2;
        this.A00 = f;
        this.A0F = z;
        this.A09 = paymentsLoggingSessionData;
        this.A0A = paymentItemType;
        this.A02 = bundle;
        this.A0D = str3;
        this.A07 = eo02 != null ? eo02 : eo0;
        this.A04 = fbpayPin;
        this.A0C = str2;
        this.A03 = bundle2;
        this.A0B = str;
    }

    public PaymentPinParams(Parcel parcel) {
        this.A06 = C53v.A07(parcel, EO0.class);
        this.A08 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A05 = (PaymentPin) 1BL.A0C(parcel, PaymentPin.class);
        this.A01 = (Intent) 1BL.A0C(parcel, Intent.class);
        this.A0E = parcel.readString();
        this.A0G = C53v.A0S(parcel);
        this.A0F = C53v.A0S(parcel);
        this.A00 = parcel.readFloat();
        this.A09 = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.A0A = DKG.A0k(parcel);
        Class<?> cls = getClass();
        this.A02 = parcel.readBundle(cls.getClassLoader());
        this.A0D = parcel.readString();
        this.A07 = C53v.A07(parcel, EO0.class);
        this.A04 = (FbpayPin) 1BL.A0C(parcel, FbpayPin.class);
        this.A0C = parcel.readString();
        this.A03 = parcel.readBundle(cls.getClassLoader());
        this.A0B = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("mPinAction", this.A06);
        stringHelper.add("mPaymentsDecoratorParams", this.A08);
        stringHelper.add("mPaymentPin", this.A05);
        stringHelper.add("mOnActivityFinishLaunchIntent", this.A01);
        stringHelper.add("mHeaderText", this.A0E);
        stringHelper.add("mShowToolbar", this.A0G);
        stringHelper.add("mShowSkipLink", this.A0F);
        stringHelper.add("mHeaderTextSizePx", this.A00);
        stringHelper.add("mPaymentsLoggingSessionData", this.A09);
        stringHelper.add("mPaymentItemType", this.A0A);
        stringHelper.add("mApiFbPayParams", this.A02);
        stringHelper.add("mHeaderSubtitleText", this.A0D);
        stringHelper.add("mUserIntentPinAction", this.A07);
        stringHelper.add("mFbpayPin", this.A04);
        stringHelper.add("mFbPayAuthMethodType", this.A0C);
        stringHelper.add("mFbPayAuthMethodArgs", this.A03);
        return 4YV.A0s(stringHelper, this.A0B, "mAuthFlowContentParams");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A06);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A09, i);
        C53v.A0J(parcel, this.A0A);
        parcel.writeBundle(this.A02);
        parcel.writeString(this.A0D);
        C53v.A0J(parcel, this.A07);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0C);
        parcel.writeBundle(this.A03);
        parcel.writeString(this.A0B);
    }
}
