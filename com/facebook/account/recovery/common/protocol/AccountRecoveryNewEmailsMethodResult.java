package com.facebook.account.recovery.common.protocol;

import X.4YV;
import X.7zO;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountRecoveryNewEmailsMethodResult.class */
public class AccountRecoveryNewEmailsMethodResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(67);
    public final Long mEarAttemptId;
    public final String mSessionId;

    public AccountRecoveryNewEmailsMethodResult() {
        this.mEarAttemptId = 4YV.A0j();
        this.mSessionId = "";
    }

    public AccountRecoveryNewEmailsMethodResult(Parcel parcel) {
        this.mEarAttemptId = 7zO.A0j(parcel);
        this.mSessionId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mEarAttemptId.longValue());
        parcel.writeString(this.mSessionId);
    }
}
