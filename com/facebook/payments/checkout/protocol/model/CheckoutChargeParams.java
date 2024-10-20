package com.facebook.payments.checkout.protocol.model;

import X.1BL;
import X.24X;
import X.2DM;
import X.C53v;
import X.DKG;
import X.DKH;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.model.CheckoutAdditionalPaymentMethod;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutChargeParams.class */
public final class CheckoutChargeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(20);
    public final CurrencyAmount A00;
    public final CurrencyAmount A01;
    public final PaymentsLoggingSessionData A02;
    public final PaymentItemType A03;
    public final PaymentMethod A04;
    public final 2DM A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;

    public CheckoutChargeParams(Parcel parcel) {
        24X r303;
        this.A02 = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.A0K = parcel.readString();
        this.A03 = DKG.A0k(parcel);
        this.A0H = parcel.readString();
        this.A0I = parcel.readString();
        this.A01 = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A0J = parcel.readString();
        this.A0G = parcel.readString();
        try {
            r303 = DKH.A0c(parcel);
        } catch (Exception unused) {
            r303 = null;
        }
        this.A05 = (2DM) r303;
        this.A04 = (PaymentMethod) 1BL.A0C(parcel, PaymentMethod.class);
        this.A06 = C53v.A04(parcel, CheckoutAdditionalPaymentMethod.class);
        this.A00 = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A0C = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0E = parcel.readString();
        this.A0L = parcel.readString();
        this.A0M = parcel.readString();
        this.A0D = parcel.readString();
        this.A0B = parcel.readString();
        this.A0F = parcel.readString();
        this.A0A = parcel.readString();
        this.A07 = parcel.readString();
        this.A0N = parcel.readString();
    }

    public CheckoutChargeParams(CurrencyAmount currencyAmount, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, PaymentMethod paymentMethod, 2DM r306, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.A02 = paymentsLoggingSessionData;
        this.A0K = str14;
        this.A03 = paymentItemType;
        this.A0H = str10;
        this.A0I = str12;
        this.A01 = currencyAmount;
        this.A0J = str13;
        this.A0G = str9;
        this.A05 = r306;
        this.A04 = paymentMethod;
        this.A06 = immutableList;
        this.A00 = null;
        this.A0C = str6;
        this.A08 = str2;
        this.A09 = str3;
        this.A0E = str8;
        this.A0L = str15;
        this.A0M = str16;
        this.A0D = str7;
        this.A0B = str5;
        this.A0F = null;
        this.A0A = str4;
        this.A07 = str;
        this.A0N = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0K);
        C53v.A0J(parcel, this.A03);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0G);
        C53v.A0A(parcel, this.A05);
        parcel.writeParcelable(this.A04, i);
        parcel.writeList(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0N);
    }
}
