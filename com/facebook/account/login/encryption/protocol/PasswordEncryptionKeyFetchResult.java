package com.facebook.account.login.encryption.protocol;

import X.AbM;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PasswordEncryptionKeyFetchResult.class */
public class PasswordEncryptionKeyFetchResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(55);
    public final int mKeyId;
    public final String mPublicKey;
    public final long mSecondsToLive;

    public PasswordEncryptionKeyFetchResult() {
        this.mKeyId = -1;
        this.mPublicKey = "";
        this.mSecondsToLive = -1;
    }

    public PasswordEncryptionKeyFetchResult(Parcel parcel) {
        this.mKeyId = parcel.readInt();
        this.mPublicKey = AbM.A0t(parcel);
        this.mSecondsToLive = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mKeyId);
        parcel.writeString(this.mPublicKey);
        parcel.writeLong(this.mSecondsToLive);
    }
}
