package com.facebook.payments.paymentmethods.model;

import X.0Pz;
import X.1BL;
import X.C53v;
import X.ERI;
import X.FKd;
import X.GLm;
import X.R2x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentDefaultInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: CreditCard.class */
public class CreditCard implements FbPaymentCard {
    public static final Parcelable.Creator CREATOR = FKd.A00(55);
    public final String A00;
    public final boolean A01;
    public final FbPayPaymentDefaultInfo A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final BillingAddress mAddress;
    public final String mCardAssociationImageURL;
    public final String mCardholderName;
    public final String mExpiryMonth;
    public final String mExpiryYear;
    public final FbPaymentCardType mFbPaymentCardType;
    public final String mId;
    public final boolean mIsSavedWithAuth;
    public final String mLastFour;
    public final ImmutableList mVerifyFields;

    public CreditCard() {
        this.mId = "";
        this.mExpiryMonth = "";
        this.mExpiryYear = "";
        this.mLastFour = "";
        this.mCardholderName = null;
        this.mFbPaymentCardType = FbPaymentCardType.A06;
        this.mCardAssociationImageURL = null;
        this.mAddress = null;
        this.mIsSavedWithAuth = false;
        this.mVerifyFields = ImmutableList.of();
        this.A00 = null;
        this.A02 = null;
        this.A05 = false;
        this.A04 = false;
        this.A01 = true;
        this.A03 = false;
    }

    public CreditCard(Parcel parcel) {
        this.mId = parcel.readString();
        this.mExpiryMonth = parcel.readString();
        this.mExpiryYear = parcel.readString();
        this.mLastFour = parcel.readString();
        this.mCardholderName = parcel.readString();
        this.mFbPaymentCardType = C53v.A07(parcel, FbPaymentCardType.class);
        this.mCardAssociationImageURL = parcel.readString();
        this.mAddress = (BillingAddress) 1BL.A0C(parcel, BillingAddress.class);
        this.mIsSavedWithAuth = C53v.A0S(parcel);
        this.mVerifyFields = C53v.A03(parcel, VerifyField.class);
        this.A00 = parcel.readString();
        this.A02 = (FbPayPaymentDefaultInfo) 1BL.A0C(parcel, FbPayPaymentDefaultInfo.class);
        this.A05 = C53v.A0S(parcel);
        this.A04 = C53v.A0S(parcel);
        this.A01 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
    }

    public CreditCard(BillingAddress billingAddress, FbPaymentCardType fbPaymentCardType, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.mId = str6;
        this.mExpiryMonth = str4;
        this.mExpiryYear = str5;
        this.mLastFour = str7;
        this.mCardholderName = str2;
        this.mFbPaymentCardType = fbPaymentCardType;
        this.mCardAssociationImageURL = str;
        this.mAddress = billingAddress;
        this.mIsSavedWithAuth = true;
        this.mVerifyFields = immutableList;
        this.A00 = str3;
        this.A02 = null;
        this.A05 = z2;
        this.A04 = false;
        this.A01 = z;
        this.A03 = false;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public Country AZA() {
        BillingAddress billingAddress = this.mAddress;
        if (billingAddress == null) {
            return null;
        }
        return billingAddress.A00;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String AZB() {
        BillingAddress billingAddress = this.mAddress;
        if (billingAddress == null) {
            return null;
        }
        return billingAddress.mZip;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String Abv() {
        return this.mCardholderName;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String Af2() {
        return "CREDIT_CARD";
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public String Ai2(Resources resources) {
        return R2x.A00(this);
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public Drawable AiM(Context context) {
        return context.getDrawable(this.mFbPaymentCardType.mRectangularDrawableResourceIdModern);
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String Al9() {
        String str = this.mExpiryMonth;
        if (str.length() < 2) {
            str = 0Pz.A0W(ConstantsKt.CAMERA_ID_FRONT, str);
        }
        return str;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String AlA() {
        return this.mExpiryYear;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public Integer Alg() {
        return null;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public FbPaymentCardType Alh() {
        return this.mFbPaymentCardType;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String At4() {
        return this.mLastFour;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public ERI BHR() {
        return ERI.A03;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public /* bridge */ /* synthetic */ GLm BHS() {
        return ERI.A03;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public ImmutableList BJ9() {
        return this.mVerifyFields;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public boolean BMx() {
        return this.mVerifyFields.contains(VerifyField.EXP);
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public boolean BWD() {
        return this.A05;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public boolean BXR() {
        return !this.mVerifyFields.contains(VerifyField.ZIP);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String getId() {
        return this.mId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mExpiryMonth);
        parcel.writeString(this.mExpiryYear);
        parcel.writeString(this.mLastFour);
        parcel.writeString(this.mCardholderName);
        C53v.A0J(parcel, this.mFbPaymentCardType);
        parcel.writeString(this.mCardAssociationImageURL);
        parcel.writeParcelable(this.mAddress, i);
        parcel.writeInt(this.mIsSavedWithAuth ? 1 : 0);
        C53v.A0C(parcel, this.mVerifyFields);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
