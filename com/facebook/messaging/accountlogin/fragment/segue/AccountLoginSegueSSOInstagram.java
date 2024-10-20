package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import X.Bjw;
import X.EPM;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.auth.protocol.InstagramSSOUserInfo;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.auth.protocol.UserTypeResult;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;

/* loaded from: AccountLoginSegueSSOInstagram.class */
public final class AccountLoginSegueSSOInstagram extends AccountLoginSegueBase {
    public LoginErrorData A00;
    public InstagramSSOUserInfo A01;
    public Bjw A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        Bjw bjw;
        if (bLp == BLp.A07) {
            return new AccountLoginSegueCredentials(true);
        }
        if (bLp == BLp.A09) {
            return new AccountLoginSegueSilent();
        }
        if (bLp != BLp.A0O || (bjw = this.A02) == null) {
            if (bLp != BLp.A0T) {
                return null;
            }
            this.A00.getClass();
            return new AccountLoginSegueTwoFacAuth(this.A00, ((InstagramUserInfo) this.A01).A00.A00, "", this.A04, this.A03, this.A05);
        }
        InstagramSSOUserInfo instagramSSOUserInfo = this.A01;
        String A02 = bjw.A00.A02(((InstagramUserInfo) instagramSSOUserInfo).A00.A04);
        if (A02 == null) {
            A02 = "";
        }
        boolean equals = "messenger_only".equals(((InstagramUserInfo) this.A01).A00.A01);
        UserTypeResult userTypeResult = ((InstagramUserInfo) instagramSSOUserInfo).A00;
        return new AccountLoginSegueRegSoftMatchLogin(EPM.A0L, new RecoveredAccount(userTypeResult.A00, userTypeResult.A02, userTypeResult.A06, userTypeResult.A03, userTypeResult.A07, equals ? 1 : 0, userTypeResult.A08), A02);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 8;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A06 ? 1 : 0);
    }
}
