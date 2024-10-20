package com.facebook.payments.paymentmethods.model;

import X.1BK;
import X.1BL;
import X.24X;
import X.4YU;
import X.C03353xs;
import X.C1n3;
import X.C53v;
import X.DKC;
import X.ERH;
import X.FKd;
import X.GLm;
import X.Qpz;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.checkout.configuration.model.bubble.BubbleComponent;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: NewCreditCardOption.class */
public class NewCreditCardOption extends NewPaymentOption {
    public static final Parcelable.Creator CREATOR = FKd.A00(57);
    public AdditionalFields A00;
    public ImmutableSet A01;
    public String A02;
    public final BubbleComponent A03;
    public final ImmutableList mAvailableFbPaymentCardTypes;
    public String mCountryCode;
    public final CardFormHeaderParams mHeader;
    public final String mProvider;
    public final String mTitle;

    public NewCreditCardOption() {
        this.mProvider = "";
        this.A01 = RegularImmutableSet.A05;
        this.mAvailableFbPaymentCardTypes = ImmutableList.of();
        this.mTitle = "";
        this.mCountryCode = "";
        this.A00 = new AdditionalFields(1BK.A0c());
        this.mHeader = null;
        this.A03 = null;
        this.A02 = null;
    }

    public NewCreditCardOption(Parcel parcel) {
        this.mProvider = parcel.readString();
        this.A01 = C53v.A06(parcel, Qpz.class.getClassLoader());
        this.mAvailableFbPaymentCardTypes = C53v.A03(parcel, FbPaymentCardType.class);
        this.A00 = (AdditionalFields) 1BL.A0C(parcel, AdditionalFields.class);
        this.mTitle = parcel.readString();
        this.mCountryCode = parcel.readString();
        this.mHeader = (CardFormHeaderParams) 1BL.A0C(parcel, CardFormHeaderParams.class);
        this.A03 = (BubbleComponent) 1BL.A0C(parcel, BubbleComponent.class);
        this.A02 = parcel.readString();
    }

    public NewCreditCardOption(BubbleComponent bubbleComponent, AdditionalFields additionalFields, CardFormHeaderParams cardFormHeaderParams, ImmutableList immutableList, ImmutableSet immutableSet, String str, String str2, String str3) {
        this.mProvider = str2;
        this.A01 = immutableSet;
        immutableList.getClass();
        this.mAvailableFbPaymentCardTypes = immutableList;
        this.A00 = additionalFields;
        this.mTitle = str3;
        this.mCountryCode = null;
        this.mHeader = cardFormHeaderParams;
        this.A03 = bubbleComponent;
        this.A02 = str;
    }

    public static AdditionalFields A00(C03353xs c03353xs) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator it = c03353xs.iterator();
        while (it.hasNext()) {
            24X A0j = DKC.A0j(it);
            String A0H = JSONUtil.A0H(A0j.A0D("country"), null);
            A0H.getClass();
            Country A00 = Country.A00(null, A0H);
            C03353xs A07 = JSONUtil.A07(A0j, "fields");
            ImmutableList.Builder A0h = 4YU.A0h();
            Iterator it2 = A07.iterator();
            while (it2.hasNext()) {
                A0h.m11011add((Object) VerifyField.forValue(JSONUtil.A0H(DKC.A0j(it2), null)));
            }
            A0c.put(A00, A0h.build());
        }
        return new AdditionalFields(A0c);
    }

    private void setAdditionalFields(C03353xs c03353xs) {
        this.A00 = A00(c03353xs);
    }

    private void setAvailableCreditCardCategories(EnumSet enumSet) {
        this.A01 = C1n3.A01(enumSet);
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String Af2() {
        return "NEW_CREDIT_CARD";
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public /* bridge */ /* synthetic */ GLm BHS() {
        return ERH.A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mProvider);
        C53v.A0R(parcel, this.A01);
        C53v.A0C(parcel, this.mAvailableFbPaymentCardTypes);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mCountryCode);
        parcel.writeParcelable(this.mHeader, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A02);
    }
}
