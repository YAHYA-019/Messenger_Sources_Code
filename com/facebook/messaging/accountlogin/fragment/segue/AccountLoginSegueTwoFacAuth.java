package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;

/* loaded from: AccountLoginSegueTwoFacAuth.class */
public final class AccountLoginSegueTwoFacAuth extends AccountLoginSegueBase {
    public LoginErrorData A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public AccountLoginSegueTwoFacAuth(LoginErrorData loginErrorData, String str, String str2, String str3, String str4, boolean z) {
        super(BLp.A0T, true);
        this.A03 = "";
        this.A04 = str;
        this.A07 = str2;
        this.A00 = loginErrorData;
        this.A05 = str3;
        this.A06 = str4;
        this.A08 = z;
    }

    /* JADX WARN: Type inference failed for: r307v3, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSilent, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        AccountLoginSegueBase accountLoginSegueBase;
        BLp bLp2 = BLp.A09;
        if (bLp == bLp2) {
            String str = this.A04;
            String str2 = this.A07;
            ?? accountLoginSegueBase2 = new AccountLoginSegueBase(bLp2, false);
            accountLoginSegueBase2.A00 = str;
            accountLoginSegueBase2.A01 = str2;
            accountLoginSegueBase = accountLoginSegueBase2;
        } else {
            AccountLoginSegueBase accountLoginSegueBase3 = null;
            accountLoginSegueBase = accountLoginSegueBase3;
            if (bLp == BLp.A04) {
                String str3 = this.A02;
                accountLoginSegueBase = accountLoginSegueBase3;
                if (str3 != null) {
                    return new AccountLoginSegueCheckpoint(str3, this.A01);
                }
            }
        }
        return accountLoginSegueBase;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 13;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A08 ? 1 : 0);
    }
}
