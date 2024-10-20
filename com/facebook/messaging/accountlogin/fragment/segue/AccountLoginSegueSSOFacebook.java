package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import X.EPM;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import java.util.List;

/* loaded from: AccountLoginSegueSSOFacebook.class */
public final class AccountLoginSegueSSOFacebook extends AccountLoginSegueBase {
    public int A00;
    public LoginErrorData A01;
    public FirstPartySsoSessionInfo A02;
    public AccountLoginSegueSSOInstagram A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        if (bLp != BLp.A0F) {
            if (bLp == BLp.A09) {
                return new AccountLoginSegueSilent();
            }
            if (bLp == BLp.A0O) {
                FirstPartySsoSessionInfo firstPartySsoSessionInfo = this.A02;
                if (firstPartySsoSessionInfo != null) {
                    String str = firstPartySsoSessionInfo.A08;
                    return new AccountLoginSegueRegSoftMatchLogin(EPM.A0L, new RecoveredAccount(str, "", "", firstPartySsoSessionInfo.A06, StringFormatUtil.formatStrLocaleSafe("https://graph.facebook.com/%s/picture?type=large", str), 0, false), "");
                }
            } else {
                if (bLp == BLp.A07) {
                    return new AccountLoginSegueCredentials(true);
                }
                if (bLp == BLp.A0D) {
                    return this.A03;
                }
                if (bLp != BLp.A0T) {
                    return null;
                }
                FirstPartySsoSessionInfo firstPartySsoSessionInfo2 = this.A02;
                if (firstPartySsoSessionInfo2 != null) {
                    return new AccountLoginSegueTwoFacAuth(this.A01, firstPartySsoSessionInfo2.A05, "", this.A05, this.A04, this.A07);
                }
            }
        }
        return new AccountLoginSegueMainScreen();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
