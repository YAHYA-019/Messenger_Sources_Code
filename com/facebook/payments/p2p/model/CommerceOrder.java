package com.facebook.payments.p2p.model;

import X.4YV;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;

/* loaded from: CommerceOrder.class */
public class CommerceOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(86);
    public String mId = null;
    public String mName = null;
    public String mDescription = null;
    public String mSellerInfo = null;
    public String mImageUrl = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.mId);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.mName);
        stringHelper.add("description", this.mDescription);
        stringHelper.add("sellerInfo", this.mSellerInfo);
        return 4YV.A0s(stringHelper, this.mImageUrl, "imageUrl");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mSellerInfo);
        parcel.writeString(this.mImageUrl);
    }
}
