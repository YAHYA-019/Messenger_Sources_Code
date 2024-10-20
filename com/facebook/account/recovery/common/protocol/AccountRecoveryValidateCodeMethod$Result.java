package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryValidateCodeMethod$Result.class */
public class AccountRecoveryValidateCodeMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(75);
    public String mId = "";
    public boolean mNonceIsPassword = false;
    public String mPasswordEducationGroup = "";
    public String mPasswordResetHintGroup = "";
    public String mLogoutOtherSessionGroup = "";
    public String mSpAfterArGroup = "";
    public String mArContactPoint = "";
    public String mSkipPasswordResetGroup = "";
    public String mSmartLockSaveAfterPwResetGroup = "";
    public boolean mHasOtherSessions = true;
    public boolean mRedesignLogoutView = false;
    public String mRedesignLogoutViewGroup = "";
    public boolean mMsgrGrowthAndroidShowSkipPasswordReset = false;
    public boolean mNonceTypeIsCsl = false;
    public boolean mAutoConfShouldShowConsent = false;
    public String mAutoConfRegisterStartMessage = "";
    public String mAutoConfNonce = "";
    public boolean mAutoConfShouldShowV2Content = false;
    public String mAutoConfConsentContentType = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeInt(this.mNonceIsPassword ? 1 : 0);
        parcel.writeString(this.mPasswordEducationGroup);
        parcel.writeString(this.mPasswordResetHintGroup);
        parcel.writeString(this.mLogoutOtherSessionGroup);
        parcel.writeString(this.mSpAfterArGroup);
        parcel.writeString(this.mArContactPoint);
        parcel.writeString(this.mSkipPasswordResetGroup);
        parcel.writeString(this.mSmartLockSaveAfterPwResetGroup);
        parcel.writeInt(this.mHasOtherSessions ? 1 : 0);
        parcel.writeInt(this.mRedesignLogoutView ? 1 : 0);
        parcel.writeString(this.mRedesignLogoutViewGroup);
        parcel.writeInt(this.mMsgrGrowthAndroidShowSkipPasswordReset ? 1 : 0);
        parcel.writeInt(this.mNonceTypeIsCsl ? 1 : 0);
        parcel.writeInt(this.mAutoConfShouldShowConsent ? 1 : 0);
        parcel.writeString(this.mAutoConfRegisterStartMessage);
        parcel.writeString(this.mAutoConfNonce);
        parcel.writeInt(this.mAutoConfShouldShowV2Content ? 1 : 0);
        parcel.writeString(this.mAutoConfConsentContentType);
    }
}
