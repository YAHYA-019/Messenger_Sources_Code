package com.facebook.messaging.phoneconfirmation.protocol;

import X.1BL;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CheckConfirmationCodeResult.class */
public final class CheckConfirmationCodeResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(99);
    public final RecoveredAccount A00;
    public final RecoveredAccount A01;
    public final String A02;

    public CheckConfirmationCodeResult(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = (RecoveredAccount) 1BL.A0C(parcel, RecoveredAccount.class);
        this.A01 = (RecoveredAccount) 1BL.A0C(parcel, RecoveredAccount.class);
    }

    public CheckConfirmationCodeResult(RecoveredAccount recoveredAccount, RecoveredAccount recoveredAccount2, String str) {
        this.A02 = str;
        this.A00 = recoveredAccount;
        this.A01 = recoveredAccount2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
