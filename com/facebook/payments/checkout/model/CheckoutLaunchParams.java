package com.facebook.payments.checkout.model;

import X.1BL;
import X.24X;
import X.2DM;
import X.4YV;
import X.C53v;
import X.DKC;
import X.DKH;
import X.FKZ;
import X.Qpa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.configuration.model.NotesCheckoutPurchaseInfoExtension;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.google.common.collect.ImmutableSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: CheckoutLaunchParams.class */
public final class CheckoutLaunchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(6);
    public Parcelable A00;
    public NotesCheckoutPurchaseInfoExtension A01;
    public PaymentsPriceTableParams A02;
    public PaymentsPrivacyData A03;
    public PaymentsDecoratorParams A04;
    public ImmutableSet A05;
    public String A06;
    public JSONObject A07;
    public JSONObject A08;
    public final CheckoutLaunchParamsCore A09;
    public final 2DM A0A;

    public CheckoutLaunchParams(Parcel parcel) {
        24X r303;
        this.A09 = (CheckoutLaunchParamsCore) 1BL.A0C(parcel, CheckoutLaunchParamsCore.class);
        try {
            r303 = DKH.A0c(parcel);
        } catch (Exception unused) {
            r303 = null;
        }
        this.A0A = (2DM) r303;
        this.A05 = C53v.A06(parcel, Qpa.class.getClassLoader());
        this.A02 = (PaymentsPriceTableParams) 1BL.A0C(parcel, PaymentsPriceTableParams.class);
        JSONObject jSONObject = null;
        try {
            String readString = parcel.readString();
            if (readString != null) {
                jSONObject = DKC.A1F(readString);
            }
        } catch (JSONException unused2) {
        }
        this.A08 = jSONObject;
        JSONObject jSONObject2 = null;
        try {
            String readString2 = parcel.readString();
            if (readString2 != null) {
                jSONObject2 = DKC.A1F(readString2);
            }
        } catch (JSONException unused3) {
        }
        this.A07 = jSONObject2;
        this.A00 = 1BL.A0C(parcel, Parcelable.class);
        this.A04 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A03 = (PaymentsPrivacyData) 1BL.A0C(parcel, PaymentsPrivacyData.class);
        this.A01 = 1BL.A0C(parcel, NotesCheckoutPurchaseInfoExtension.class);
        this.A06 = parcel.readString();
    }

    public CheckoutLaunchParams(CheckoutLaunchParamsCore checkoutLaunchParamsCore, 2DM r303) {
        this.A09 = checkoutLaunchParamsCore;
        this.A0A = r303;
        this.A05 = null;
        this.A02 = null;
        this.A08 = null;
        this.A07 = null;
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A06 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A09, i);
        C53v.A0A(parcel, this.A0A);
        C53v.A0R(parcel, this.A05);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(4YV.A0u(this.A08));
        parcel.writeString(4YV.A0u(this.A07));
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
    }
}
