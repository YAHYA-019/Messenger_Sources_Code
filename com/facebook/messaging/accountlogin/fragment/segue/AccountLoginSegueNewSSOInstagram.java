package com.facebook.messaging.accountlogin.fragment.segue;

import X.1BL;
import X.AbM;
import X.BLp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.auth.protocol.LinkedFbUserFromIgSessionInfo;

/* loaded from: AccountLoginSegueNewSSOInstagram.class */
public final class AccountLoginSegueNewSSOInstagram extends AccountLoginSegueBase {
    public LoginErrorData A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final LinkedFbUserFromIgSessionInfo A06;
    public final String A07;

    public AccountLoginSegueNewSSOInstagram(Parcel parcel) {
        super(parcel);
        Parcelable A0C = 1BL.A0C(parcel, AccountCandidateModel.class);
        A0C.getClass();
        this.A06 = (LinkedFbUserFromIgSessionInfo) A0C;
        this.A07 = AbM.A0t(parcel);
    }

    public AccountLoginSegueNewSSOInstagram(LinkedFbUserFromIgSessionInfo linkedFbUserFromIgSessionInfo, String str) {
        super(BLp.A0G, false);
        this.A06 = linkedFbUserFromIgSessionInfo;
        this.A07 = str;
    }

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
                String str = this.A02;
                if (str != null) {
                    return new AccountLoginSegueCheckpoint(str, this.A01);
                }
            } else if (bLp == BLp.A0T) {
                this.A00.getClass();
                return new AccountLoginSegueTwoFacAuth(this.A00, this.A06.A02, "", this.A04, this.A03, this.A05);
            }
        }
        return accountLoginSegueSilent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 27;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A07);
    }
}
