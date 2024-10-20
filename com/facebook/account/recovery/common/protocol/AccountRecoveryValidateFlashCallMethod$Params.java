package com.facebook.account.recovery.common.protocol;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: AccountRecoveryValidateFlashCallMethod$Params.class */
public final class AccountRecoveryValidateFlashCallMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(76);
    public String A00;
    public String A01;
    public List A02;

    public AccountRecoveryValidateFlashCallMethod$Params() {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = "";
        this.A02 = A0s;
        this.A00 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeList(this.A02);
        parcel.writeString(this.A00);
    }
}
