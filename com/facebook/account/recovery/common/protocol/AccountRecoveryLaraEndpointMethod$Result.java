package com.facebook.account.recovery.common.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryLaraEndpointMethod$Result.class */
public class AccountRecoveryLaraEndpointMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(64);
    public String mLaraDecision = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mLaraDecision);
    }
}
