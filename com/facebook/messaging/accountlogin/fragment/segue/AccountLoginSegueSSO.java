package com.facebook.messaging.accountlogin.fragment.segue;

import X.BLp;
import android.os.Parcel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.messaging.accountlogin.helper.SSOAccountModel;
import java.util.List;

/* loaded from: AccountLoginSegueSSO.class */
public final class AccountLoginSegueSSO extends AccountLoginSegueBase {
    public LoginErrorData A00;
    public SSOAccountModel A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        AccountLoginSegueSilent accountLoginSegueSilent;
        if (bLp == BLp.A09) {
            accountLoginSegueSilent = new AccountLoginSegueSilent();
        } else {
            if (bLp == BLp.A07) {
                return new AccountLoginSegueCredentials(true);
            }
            accountLoginSegueSilent = null;
            if (bLp == BLp.A04) {
                String str = this.A03;
                if (str != null) {
                    return new AccountLoginSegueCheckpoint(str, this.A02);
                }
            } else if (bLp == BLp.A0T) {
                this.A00.getClass();
                this.A01.getClass();
                SSOAccountModel sSOAccountModel = this.A01;
                String str2 = sSOAccountModel.A06;
                String str3 = sSOAccountModel.A05;
                if (str3 != null) {
                    str2 = str3;
                }
                str2.getClass();
                return new AccountLoginSegueTwoFacAuth(this.A00, str2, "", this.A05, this.A04, this.A07);
            }
        }
        return accountLoginSegueSilent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 29;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.A06);
    }
}
