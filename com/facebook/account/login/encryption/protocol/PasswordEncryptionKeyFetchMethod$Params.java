package com.facebook.account.login.encryption.protocol;

import X.1BL;
import X.3Dy;
import X.AbM;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PasswordEncryptionKeyFetchMethod$Params.class */
public final class PasswordEncryptionKeyFetchMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(54);
    public final int A00;
    public final 3Dy A01;

    public PasswordEncryptionKeyFetchMethod$Params(3Dy r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    public PasswordEncryptionKeyFetchMethod$Params(Parcel parcel) {
        this.A01 = 3Dy.valueOf(AbM.A0t(parcel));
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A12(parcel, this.A01);
    }
}
