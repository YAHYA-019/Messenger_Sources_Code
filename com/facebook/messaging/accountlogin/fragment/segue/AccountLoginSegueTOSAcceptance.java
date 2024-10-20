package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;

/* loaded from: AccountLoginSegueTOSAcceptance.class */
public final class AccountLoginSegueTOSAcceptance extends AccountLoginSegueBase {
    public AccountLoginSegueTOSAcceptance() {
        super(BLp.A0S, false);
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp == BLp.A0B) {
            return new AccountLoginSegueSplash();
        }
        if (bLp == BLp.A03) {
            return new AccountLoginSegueBloksLogin();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 16;
    }
}
