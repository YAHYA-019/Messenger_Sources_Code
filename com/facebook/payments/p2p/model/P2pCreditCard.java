package com.facebook.payments.p2p.model;

import X.1BL;
import X.4YV;
import X.AbM;
import X.C41w;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: P2pCreditCard.class */
public class P2pCreditCard implements Parcelable, C41w {
    public static final Parcelable.Creator CREATOR = FKZ.A00(88);
    public final Address mAddress;
    public final String mAssociation;
    public final String mCredentialId;
    public final int mExpirationMonth;
    public final int mExpirationYear;
    public final String mLastFourDigits;

    public P2pCreditCard() {
        this.mCredentialId = null;
        this.mLastFourDigits = null;
        this.mExpirationMonth = -1;
        this.mExpirationYear = -1;
        this.mAddress = null;
        this.mAssociation = null;
    }

    public P2pCreditCard(Parcel parcel) {
        this.mCredentialId = parcel.readString();
        this.mLastFourDigits = parcel.readString();
        this.mExpirationMonth = parcel.readInt();
        this.mExpirationYear = parcel.readInt();
        this.mAddress = (Address) 1BL.A0C(parcel, Address.class);
        this.mAssociation = parcel.readString();
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        AbM.A1T(this.mLastFourDigits);
        AbM.A1T(this.mAssociation);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("credential_id", this.mCredentialId);
        stringHelper.add("number", this.mLastFourDigits);
        stringHelper.add("expire_month", this.mExpirationMonth);
        stringHelper.add("expire_year", this.mExpirationYear);
        stringHelper.add("address", this.mAddress.toString());
        return 4YV.A0s(stringHelper, this.mAssociation, "association");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCredentialId);
        parcel.writeString(this.mLastFourDigits);
        parcel.writeInt(this.mExpirationMonth);
        parcel.writeInt(this.mExpirationYear);
        parcel.writeParcelable(this.mAddress, i);
        parcel.writeString(this.mAssociation);
    }
}
