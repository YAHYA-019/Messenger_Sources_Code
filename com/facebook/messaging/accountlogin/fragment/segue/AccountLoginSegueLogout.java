package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;

/* loaded from: AccountLoginSegueLogout.class */
public final class AccountLoginSegueLogout extends AccountLoginSegueBase {
    public AccountLoginSegueLogout() {
        super(BLp.A0E, false);
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp == BLp.A0B) {
            return new AccountLoginSegueSplash();
        }
        if (bLp == BLp.A03) {
            return new AccountLoginSegueBloksLogin();
        }
        if (bLp == BLp.A0F) {
            return new AccountLoginSegueMainScreen();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 14;
    }
}
