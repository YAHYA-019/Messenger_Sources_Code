package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;

/* loaded from: AccountLoginSegueRecMethodSelection.class */
public final class AccountLoginSegueRecMethodSelection extends AccountLoginSegueRecBaseData {
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        BLp bLp2 = BLp.A0K;
        return (bLp != bLp2 || ((AccountLoginSegueRecBaseData) this).A02 == null) ? super.A03(bLp) : new AccountLoginSegueRecBaseData(this, bLp2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 20;
    }
}
