package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import X.EPM;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;

/* loaded from: AccountLoginSegueRegSoftMatchLogin.class */
public final class AccountLoginSegueRegSoftMatchLogin extends AccountLoginSegueBase {
    public EPM A00;
    public LoginErrorData A01;
    public RecoveredAccount A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;

    public AccountLoginSegueRegSoftMatchLogin(EPM epm, RecoveredAccount recoveredAccount, String str) {
        super(BLp.A0O, true);
        this.A08 = "";
        this.A09 = "";
        this.A0A = "";
        this.A07 = str;
        this.A02 = recoveredAccount;
        this.A0B = false;
        this.A00 = epm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (android.text.TextUtils.isEmpty(r301.A02.A01) == false) goto L17;
     */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecAccountSearch, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase A03(X.BLp r302) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegSoftMatchLogin.A03(X.BLp):com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 10;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A06);
    }
}
