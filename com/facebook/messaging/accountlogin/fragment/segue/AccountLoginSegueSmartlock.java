package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.auth.protocol.AuthCredentialCheckResult;

/* loaded from: AccountLoginSegueSmartlock.class */
public final class AccountLoginSegueSmartlock extends AccountLoginSegueBase {
    public LoginErrorData A00;
    public AuthCredentialCheckResult A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        AccountLoginSegueCheckpoint accountLoginSegueCheckpoint = null;
        if (bLp == BLp.A04) {
            String str = this.A03;
            if (str != null) {
                accountLoginSegueCheckpoint = new AccountLoginSegueCheckpoint(str, this.A02);
            }
        } else {
            if (bLp == BLp.A09) {
                return new AccountLoginSegueSilent();
            }
            if (bLp == BLp.A0T) {
                this.A00.getClass();
                return new AccountLoginSegueTwoFacAuth(this.A00, this.A04, this.A07, this.A06, this.A05, this.A08);
            }
            if (bLp == BLp.A07) {
                AccountLoginSegueCredentials accountLoginSegueCredentials = new AccountLoginSegueCredentials(true);
                accountLoginSegueCredentials.A0K = true;
                return accountLoginSegueCredentials;
            }
        }
        return accountLoginSegueCheckpoint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 28;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
    }
}
