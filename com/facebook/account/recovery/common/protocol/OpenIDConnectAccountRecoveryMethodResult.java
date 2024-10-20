package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OpenIDConnectAccountRecoveryMethodResult.class */
public class OpenIDConnectAccountRecoveryMethodResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(79);
    public String mId = "";
    public String mNonce = "";
    public String mSmartLockSaveAfterPwResetGroup = "";
    public boolean mHasOtherSessions = false;
    public boolean mRedesignLogoutView = false;
    public String mRedesignLogoutViewGroup = "";
    public String mSmartLockSaveCp = "";
    public boolean mOauthSkipPwResetAfterIncorrectCp = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mNonce);
        parcel.writeString(this.mSmartLockSaveAfterPwResetGroup);
        parcel.writeInt(this.mHasOtherSessions ? 1 : 0);
        parcel.writeInt(this.mRedesignLogoutView ? 1 : 0);
        parcel.writeString(this.mRedesignLogoutViewGroup);
        parcel.writeString(this.mSmartLockSaveCp);
        parcel.writeInt(this.mOauthSkipPwResetAfterIncorrectCp ? 1 : 0);
    }
}
