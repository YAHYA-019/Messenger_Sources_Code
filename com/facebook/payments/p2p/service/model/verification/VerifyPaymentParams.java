package com.facebook.payments.p2p.service.model.verification;

import X.1BL;
import X.4YV;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.model.verification.UserInput;
import com.google.common.base.MoreObjects;

/* loaded from: VerifyPaymentParams.class */
public final class VerifyPaymentParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(40);
    public final UserInput A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public VerifyPaymentParams(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (UserInput) 1BL.A0C(parcel, UserInput.class);
    }

    public VerifyPaymentParams(UserInput userInput, String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = userInput;
        this.A01 = str3;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("transfer_id", this.A03);
        stringHelper.add("submitted_screen", this.A02);
        stringHelper.add("user_input", this.A00);
        stringHelper.add("csc", this.A01);
        return 4YV.A0s(stringHelper, this.A04, "userid");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, 0);
    }
}
