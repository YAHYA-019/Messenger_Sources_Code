package com.facebook.payments.p2p.service.model.cards;

import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: SetPrimaryCardParams.class */
public final class SetPrimaryCardParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(10);
    public final String A00;
    public final String A01;

    public SetPrimaryCardParams(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public SetPrimaryCardParams(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("credentialId", this.A00);
        return 4YV.A0s(stringHelper, this.A01, "userId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
