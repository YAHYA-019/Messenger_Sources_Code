package com.facebook.messaging.accountlogin.fragment.segue;

import X.AnonymousClass001;
import X.BLp;
import android.os.Parcel;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: AccountLoginSegueRecAccountSelection.class */
public final class AccountLoginSegueRecAccountSelection extends AccountLoginSegueRecBaseData {
    public final List A00;

    public AccountLoginSegueRecAccountSelection(Parcel parcel) {
        super(parcel);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00 = A0s;
        parcel.readList(A0s, AccountCandidateModel.class.getClassLoader());
    }

    public AccountLoginSegueRecAccountSelection(AccountLoginSegueRecBaseData accountLoginSegueRecBaseData, List list) {
        super(accountLoginSegueRecBaseData, BLp.A0H);
        this.A00 = list;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        BLp bLp2 = BLp.A0I;
        if (bLp == bLp2 && ImmutableList.copyOf((Collection) this.A00) != null) {
            return new AccountLoginSegueRecBaseData(this, bLp2);
        }
        BLp bLp3 = BLp.A0M;
        return bLp == bLp3 ? new AccountLoginSegueRecBaseData(this, bLp3) : super.A03(bLp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 19;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
    }
}
