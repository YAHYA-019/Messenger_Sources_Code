package com.facebook.payments.paymentmethods.model;

import X.1BL;
import X.C53v;
import X.ERI;
import X.EVD;
import X.FKd;
import X.GEP;
import X.GLm;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo;

/* loaded from: PayPalBillingAgreement.class */
public class PayPalBillingAgreement implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = FKd.A00(61);
    public final FbPayPaymentDefaultInfo A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final Type baType;
    public final String cibConsentText;
    public final String cibTermsUrl;
    public final String emailId;
    public final String id;
    public final boolean isCibConversionNeeded;

    /* loaded from: PayPalBillingAgreement$Type.class */
    public enum Type implements GEP {
        UNKNOWN,
        MIB,
        /* JADX INFO: Fake field, exist only in values array */
        CIB;

        public static Type forValue(String str) {
            GEP A002 = EVD.A00(str, values());
            Type type = UNKNOWN;
            if (A002 == null) {
                A002 = type;
            }
            return (Type) A002;
        }

        public /* bridge */ /* synthetic */ Object getValue() {
            return name().toLowerCase();
        }

        @Override // java.lang.Enum
        public String toString() {
            return name().toLowerCase();
        }
    }

    public PayPalBillingAgreement() {
        this.id = null;
        this.emailId = null;
        this.baType = Type.UNKNOWN;
        this.cibConsentText = null;
        this.cibTermsUrl = null;
        this.isCibConversionNeeded = false;
        this.A01 = null;
        this.A03 = null;
        this.A04 = false;
        this.A00 = null;
        this.A05 = false;
        this.A02 = null;
    }

    public PayPalBillingAgreement(Parcel parcel) {
        this.id = parcel.readString();
        this.emailId = parcel.readString();
        this.baType = (Type) C53v.A07(parcel, Type.class);
        this.cibConsentText = parcel.readString();
        this.cibTermsUrl = parcel.readString();
        this.isCibConversionNeeded = C53v.A0S(parcel);
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = C53v.A0S(parcel);
        this.A00 = (FbPayPaymentDefaultInfo) 1BL.A0C(parcel, FbPayPaymentDefaultInfo.class);
        this.A05 = C53v.A0S(parcel);
        this.A02 = parcel.readString();
    }

    public PayPalBillingAgreement(Type type, FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        this.id = str7;
        this.emailId = str6;
        this.baType = type;
        this.cibConsentText = str;
        this.cibTermsUrl = str2;
        this.isCibConversionNeeded = z;
        this.A01 = str4;
        this.A03 = str5;
        this.A04 = z2;
        this.A00 = fbPayPaymentDefaultInfo;
        this.A05 = z3;
        this.A02 = str3;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String Af2() {
        return "PAYPAL_BA";
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public String Ai2(Resources resources) {
        String str = this.A03;
        if (TextUtils.isEmpty(str)) {
            str = resources.getString(2131963169);
        }
        return str;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public Drawable AiM(Context context) {
        return context.getDrawable(2132347171);
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public ERI BHR() {
        return ERI.A05;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public /* bridge */ /* synthetic */ GLm BHS() {
        return ERI.A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.emailId);
        C53v.A0J(parcel, this.baType);
        parcel.writeString(this.cibConsentText);
        parcel.writeString(this.cibTermsUrl);
        parcel.writeInt(this.isCibConversionNeeded ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
