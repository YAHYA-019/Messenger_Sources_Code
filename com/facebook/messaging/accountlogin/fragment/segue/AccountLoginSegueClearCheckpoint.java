package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;

/* loaded from: AccountLoginSegueClearCheckpoint.class */
public final class AccountLoginSegueClearCheckpoint extends AccountLoginSegueBase {
    public String A00;
    public String A01;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSilent, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        String str = this.A01;
        String str2 = this.A00;
        ?? accountLoginSegueBase = new AccountLoginSegueBase(BLp.A09, false);
        accountLoginSegueBase.A00 = str;
        accountLoginSegueBase.A01 = str2;
        return accountLoginSegueBase;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 32;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
