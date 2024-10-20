package com.facebook.payments.p2p.model;

import X.4YV;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: VerificationFollowUpAction.class */
public final class VerificationFollowUpAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(97);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public VerificationFollowUpAction(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public VerificationFollowUpAction(String str, String str2, String str3, String str4) {
        this.A02 = str3;
        this.A01 = str2;
        this.A03 = str4;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("actionType", this.A02);
        stringHelper.add("actionText", this.A01);
        stringHelper.add("actionUrl", this.A03);
        return 4YV.A0s(stringHelper, this.A00, "actionButtonText");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }
}
