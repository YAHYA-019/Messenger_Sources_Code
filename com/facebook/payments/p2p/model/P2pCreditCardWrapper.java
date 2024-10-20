package com.facebook.payments.p2p.model;

import X.1BL;
import X.C41w;
import X.C53v;
import X.DKG;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;

/* loaded from: P2pCreditCardWrapper.class */
public class P2pCreditCardWrapper implements Parcelable, C41w {
    public static final Parcelable.Creator CREATOR = FKZ.A00(89);
    public final boolean mCommercePaymentEligible;
    public final String mId;
    public final boolean mIsDefaultReceiving;
    public final boolean mIsMobileCSCVerified;
    public final boolean mIsWebCSCVerified;
    public final boolean mIsZipVerified;
    public final String mMethodCategory;
    public final P2pCreditCard mP2pCreditCard;
    public final boolean mPersonalTransferEligible;

    public P2pCreditCardWrapper() {
        this.mId = null;
        this.mP2pCreditCard = null;
        this.mIsMobileCSCVerified = false;
        this.mIsWebCSCVerified = false;
        this.mIsZipVerified = false;
        this.mMethodCategory = null;
        this.mCommercePaymentEligible = false;
        this.mPersonalTransferEligible = false;
        this.mIsDefaultReceiving = false;
    }

    public P2pCreditCardWrapper(Parcel parcel) {
        this.mId = parcel.readString();
        this.mP2pCreditCard = (P2pCreditCard) 1BL.A0C(parcel, P2pCreditCard.class);
        this.mIsMobileCSCVerified = C53v.A0S(parcel);
        this.mIsWebCSCVerified = C53v.A0S(parcel);
        this.mIsZipVerified = C53v.A0S(parcel);
        this.mMethodCategory = parcel.readString();
        this.mCommercePaymentEligible = C53v.A0S(parcel);
        this.mPersonalTransferEligible = C53v.A0S(parcel);
        this.mIsDefaultReceiving = C53v.A0S(parcel);
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        DKG.A1V(this.mId);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.mId);
        stringHelper.add("credit_card", this.mP2pCreditCard);
        stringHelper.add("mobile_csc_verified", this.mIsMobileCSCVerified);
        stringHelper.add("web_csc_verified", this.mIsWebCSCVerified);
        stringHelper.add("zip_verified", this.mIsZipVerified);
        stringHelper.add("method_category", this.mMethodCategory);
        stringHelper.add("commerce_payment_eligible", this.mCommercePaymentEligible);
        stringHelper.add("personal_transfer_eligible", this.mPersonalTransferEligible);
        stringHelper.add("is_default_receiving", this.mIsDefaultReceiving);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable(this.mP2pCreditCard, i);
        parcel.writeInt(this.mIsMobileCSCVerified ? 1 : 0);
        parcel.writeInt(this.mIsWebCSCVerified ? 1 : 0);
        parcel.writeInt(this.mIsZipVerified ? 1 : 0);
        parcel.writeString(this.mMethodCategory);
        parcel.writeInt(this.mCommercePaymentEligible ? 1 : 0);
        parcel.writeInt(this.mPersonalTransferEligible ? 1 : 0);
        parcel.writeInt(this.mIsDefaultReceiving ? 1 : 0);
    }
}
