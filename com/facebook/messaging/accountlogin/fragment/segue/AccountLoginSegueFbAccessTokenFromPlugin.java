package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;

/* loaded from: AccountLoginSegueFbAccessTokenFromPlugin.class */
public final class AccountLoginSegueFbAccessTokenFromPlugin extends AccountLoginSegueBase {
    public LoginErrorData A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public AccountLoginSegueFbAccessTokenFromPlugin() {
        super(BLp.A0C, false);
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        String str;
        return bLp == BLp.A09 ? new AccountLoginSegueSilent() : (bLp != BLp.A0T || (str = this.A01) == null) ? new AccountLoginSegueCredentials(false) : new AccountLoginSegueTwoFacAuth(this.A00, str, "", this.A03, this.A02, this.A04);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 34;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }
}
