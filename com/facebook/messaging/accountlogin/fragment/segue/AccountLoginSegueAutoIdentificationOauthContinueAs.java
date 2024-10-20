package com.facebook.messaging.accountlogin.fragment.segue;

import X.1BL;
import X.BLp;
import X.BLt;
import android.os.Parcel;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.auth.login.ui.LoginErrorData;

/* loaded from: AccountLoginSegueAutoIdentificationOauthContinueAs.class */
public final class AccountLoginSegueAutoIdentificationOauthContinueAs extends AccountLoginSegueBase {
    public AccountCandidateModel A00;
    public LoginErrorData A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final BLt A08;
    public final int A09;

    public AccountLoginSegueAutoIdentificationOauthContinueAs(Parcel parcel) {
        super(parcel);
        this.A00 = (AccountCandidateModel) 1BL.A0C(parcel, AccountCandidateModel.class);
        this.A06 = parcel.readString();
        this.A08 = BLt.valueOf(parcel.readString());
        this.A09 = parcel.readInt();
    }

    public AccountLoginSegueAutoIdentificationOauthContinueAs(AccountCandidateModel accountCandidateModel, BLt bLt, String str) {
        super(BLp.A02, true);
        this.A00 = accountCandidateModel;
        this.A06 = str;
        this.A08 = bLt;
        this.A09 = 25;
    }

    public AccountLoginSegueAutoIdentificationOauthContinueAs(AccountCandidateModel accountCandidateModel, String str) {
        super(BLp.A02, true);
        this.A00 = accountCandidateModel;
        this.A06 = str;
        this.A08 = BLt.A01;
        this.A09 = 25;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        AccountLoginSegueCredentials accountLoginSegueCredentials;
        String str;
        if (bLp == BLp.A07) {
            accountLoginSegueCredentials = new AccountLoginSegueCredentials(true);
        } else {
            if (bLp == BLp.A09) {
                return new AccountLoginSegueSilent();
            }
            if (bLp == BLp.A0T) {
                this.A01.getClass();
                return new AccountLoginSegueTwoFacAuth(this.A01, this.A06, "", this.A05, this.A04, this.A07);
            }
            accountLoginSegueCredentials = null;
            if (bLp == BLp.A04 && (str = this.A03) != null) {
                return new AccountLoginSegueCheckpoint(str, this.A02);
            }
        }
        return accountLoginSegueCredentials;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.A09;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08.mFlowType);
        parcel.writeInt(this.A09);
    }
}
