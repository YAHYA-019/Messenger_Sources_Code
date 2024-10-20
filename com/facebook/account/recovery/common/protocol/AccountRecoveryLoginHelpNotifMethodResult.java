package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryLoginHelpNotifMethodResult.class */
public class AccountRecoveryLoginHelpNotifMethodResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(65);
    public boolean mEligible = false;
    public String mAccountId = "";
    public String mName = "";
    public String mProfilePicUri = "";
    public String mContactpoint = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mEligible ? 1 : 0);
        parcel.writeString(this.mAccountId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mProfilePicUri);
        parcel.writeString(this.mContactpoint);
    }
}
