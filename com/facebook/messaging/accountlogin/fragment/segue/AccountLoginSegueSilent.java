package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;
import java.util.HashSet;

/* loaded from: AccountLoginSegueSilent.class */
public final class AccountLoginSegueSilent extends AccountLoginSegueBase {
    public String A00;
    public String A01;
    public HashSet A02;

    public AccountLoginSegueSilent() {
        super(BLp.A09, false);
        this.A00 = "";
        this.A01 = "";
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp == BLp.A0F) {
            return new AccountLoginSegueMainScreen();
        }
        if (bLp == BLp.A07) {
            return new AccountLoginSegueCredentials("", "", false);
        }
        if (bLp == BLp.A0E) {
            return new AccountLoginSegueLogout();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 12;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A02);
    }
}
