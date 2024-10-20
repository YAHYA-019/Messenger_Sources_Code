package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import java.util.List;

/* loaded from: AccountLoginSegueRecAccountSearch.class */
public final class AccountLoginSegueRecAccountSearch extends AccountLoginSegueRecBaseData {
    public List A00;
    public boolean A01;

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp == BLp.A0H && !this.A00.isEmpty()) {
            return new AccountLoginSegueRecAccountSelection(this, this.A00);
        }
        BLp bLp2 = BLp.A0I;
        if (bLp == bLp2 && ((AccountLoginSegueRecBaseData) this).A02 != null) {
            return new AccountLoginSegueRecBaseData(this, bLp2);
        }
        BLp bLp3 = BLp.A0M;
        return bLp == bLp3 ? new AccountLoginSegueRecBaseData(this, bLp3) : super.A03(bLp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 18;
    }
}
