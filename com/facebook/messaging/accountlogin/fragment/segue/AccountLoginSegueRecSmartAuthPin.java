package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;

/* loaded from: AccountLoginSegueRecSmartAuthPin.class */
public final class AccountLoginSegueRecSmartAuthPin extends AccountLoginSegueRecBaseData {
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        BLp bLp2 = BLp.A0M;
        return bLp == bLp2 ? new AccountLoginSegueRecBaseData(this, bLp2) : super.A03(bLp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 24;
    }
}
