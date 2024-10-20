package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryValidateFlashCallMethod$Result.class */
public class AccountRecoveryValidateFlashCallMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(77);
    public String mNonce = "";
    public String mSkipLogoutPwResetGroup = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mNonce);
        parcel.writeString(this.mSkipLogoutPwResetGroup);
    }
}
