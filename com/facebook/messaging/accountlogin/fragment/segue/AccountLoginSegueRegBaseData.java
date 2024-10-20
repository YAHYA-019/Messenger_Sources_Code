package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;
import java.util.List;

/* loaded from: AccountLoginSegueRegBaseData.class */
public abstract class AccountLoginSegueRegBaseData extends AccountLoginSegueBase {
    public AccountLoginSegueBase A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public List A0B;
    public boolean A0C;

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp == BLp.A07) {
            return new AccountLoginSegueCredentials();
        }
        if (bLp == BLp.A0N) {
            return new AccountLoginSegueRegSoftMatch(this, 0);
        }
        if (bLp == BLp.A09) {
            return new AccountLoginSegueSilent();
        }
        if (bLp == BLp.A0F) {
            return new AccountLoginSegueMainScreen();
        }
        if (bLp == BLp.A06) {
            return this.A00;
        }
        return null;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A0A);
        parcel.writeList(this.A0B);
        parcel.writeList(this.A09);
    }
}
