package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import X.Brn;
import android.os.Parcel;

/* loaded from: AccountLoginSegueCheckpoint.class */
public final class AccountLoginSegueCheckpoint extends AccountLoginSegueBase {
    public Brn A00;
    public String A01;
    public String A02;
    public boolean A03;

    public AccountLoginSegueCheckpoint(String str, String str2) {
        super(BLp.A04, true);
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 17;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
