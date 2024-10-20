package com.facebook.messaging.accountlogin.fragment.segue;

import X.1BL;
import X.BLp;
import X.C53v;
import android.os.Parcel;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;

/* loaded from: AccountLoginSegueRecBaseData.class */
public abstract class AccountLoginSegueRecBaseData extends AccountLoginSegueBase {
    public int A00;
    public int A01;
    public AccountCandidateModel A02;
    public AccountLoginSegueBase A03;
    public RecoveredAccount A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public AccountLoginSegueRecBaseData(Parcel parcel) {
        super(parcel);
        this.A08 = "";
        this.A03 = (AccountLoginSegueBase) 1BL.A0C(parcel, AccountLoginSegueBase.class);
        this.A06 = parcel.readString();
        this.A04 = (RecoveredAccount) 1BL.A0C(parcel, RecoveredAccount.class);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = (AccountCandidateModel) 1BL.A0C(parcel, AccountCandidateModel.class);
        this.A05 = parcel.readString();
        this.A09 = C53v.A0S(parcel);
        this.A07 = parcel.readString();
    }

    public AccountLoginSegueRecBaseData(AccountLoginSegueBase accountLoginSegueBase, BLp bLp, String str) {
        super(bLp, true);
        this.A06 = str;
        this.A04 = null;
        this.A03 = accountLoginSegueBase;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = null;
        this.A05 = null;
        this.A09 = false;
        this.A07 = null;
        this.A08 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountLoginSegueRecBaseData(AccountLoginSegueRecBaseData accountLoginSegueRecBaseData, BLp bLp) {
        super(bLp, true);
        AccountLoginSegueBase accountLoginSegueBase = accountLoginSegueRecBaseData.A03;
        String str = accountLoginSegueRecBaseData.A06;
        RecoveredAccount recoveredAccount = accountLoginSegueRecBaseData.A04;
        int i = accountLoginSegueRecBaseData.A00;
        int i2 = accountLoginSegueRecBaseData.A01;
        AccountCandidateModel accountCandidateModel = accountLoginSegueRecBaseData.A02;
        String str2 = accountLoginSegueRecBaseData.A05;
        boolean z = accountLoginSegueRecBaseData.A09;
        String str3 = accountLoginSegueRecBaseData.A07;
        String str4 = accountLoginSegueRecBaseData.A08;
        this.A06 = str;
        this.A04 = recoveredAccount;
        this.A03 = accountLoginSegueBase;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = accountCandidateModel;
        this.A05 = str2;
        this.A09 = z;
        this.A07 = str3;
        this.A08 = str4;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp == BLp.A06) {
            return this.A03;
        }
        return null;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A07);
    }
}
