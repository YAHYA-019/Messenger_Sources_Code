package com.facebook.account.recovery.common.protocol;

import X.1BK;
import X.AnonymousClass001;
import X.DKF;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: AccountRecoverySendConfirmationCodeMethod$Result.class */
public class AccountRecoverySendConfirmationCodeMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(71);
    public Boolean mSuccess = 1BK.A0d();
    public List mFlashCallCliFilters = AnonymousClass001.A0s();
    public String mAutoConfVerifiedContactPoint = "";
    public String mAutoConfAuthChallenge = "";
    public String mAutoConfFlowType = "";
    public Boolean mHasOtherSessions = AnonymousClass001.A0K();
    public String mRedesignLogoutViewGroup = "";
    public String mAutoConfAuthServerStartMessage = "";
    public String mAutoConfMetadata = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1C(parcel, this.mSuccess);
        parcel.writeList(this.mFlashCallCliFilters);
        parcel.writeString(this.mAutoConfVerifiedContactPoint);
        parcel.writeString(this.mAutoConfAuthChallenge);
        parcel.writeString(this.mAutoConfFlowType);
        parcel.writeString(this.mAutoConfAuthServerStartMessage);
        parcel.writeString(this.mAutoConfMetadata);
    }
}
