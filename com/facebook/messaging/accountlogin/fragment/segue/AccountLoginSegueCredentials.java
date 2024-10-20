package com.facebook.messaging.accountlogin.fragment.segue;

import X.1BL;
import X.1BQ;
import X.7zS;
import X.AbM;
import X.AnonymousClass001;
import X.BLp;
import X.C00i;
import X.CDo;
import X.COX;
import X.EPM;
import X.EPg;
import X.FIM;
import android.os.Parcel;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.messaging.accountlogin.helper.SSOAccountModel;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: AccountLoginSegueCredentials.class */
public final class AccountLoginSegueCredentials extends AccountLoginSegueBase {
    public int A00;
    public AccountCandidateModel A01;
    public LoginErrorData A02;
    public FirstPartySsoSessionInfo A03;
    public C00i A04;
    public CDo A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public HashSet A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final C00i A0L;

    public AccountLoginSegueCredentials() {
        super(BLp.A07, true);
        this.A0L = 1BQ.A02(85263);
        this.A0F = "";
        this.A0E = "";
        this.A0D = "";
        this.A08 = "";
        this.A00 = 0;
        this.A0G = "";
        this.A09 = "";
        this.A0C = "";
    }

    public AccountLoginSegueCredentials(Parcel parcel) {
        super(parcel);
        this.A0L = 1BQ.A02(85263);
        this.A09 = "";
        this.A0C = "";
        this.A0F = "";
        this.A0E = "";
        this.A0D = "";
        this.A08 = "";
        this.A00 = 0;
        this.A0G = parcel.readString();
        this.A09 = parcel.readString();
        this.A0C = parcel.readString();
        this.A0F = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        this.A0I = 7zS.A1Z(parcel);
        this.A02 = (LoginErrorData) 1BL.A0C(parcel, LoginErrorData.class);
        this.A0A = parcel.readString();
        this.A03 = (FirstPartySsoSessionInfo) 1BL.A0C(parcel, FirstPartySsoSessionInfo.class);
        this.A0J = AbM.A1W(parcel);
        this.A0B = parcel.readString();
    }

    public AccountLoginSegueCredentials(String str, String str2, String str3, String str4) {
        super(BLp.A07, false);
        this.A0L = 1BQ.A02(85263);
        this.A08 = "";
        this.A00 = 0;
        this.A09 = str;
        this.A0C = str2;
        this.A0F = str3;
        this.A0E = str4;
        this.A0D = "e2e_headless_login";
    }

    public AccountLoginSegueCredentials(String str, String str2, boolean z) {
        super(BLp.A07, false);
        this.A0L = 1BQ.A02(85263);
        this.A0F = "";
        this.A0E = "";
        this.A0D = "";
        this.A08 = "";
        this.A00 = 0;
        this.A09 = "";
        this.A0C = "";
    }

    public AccountLoginSegueCredentials(boolean z) {
        super(BLp.A07, z);
        this.A0L = 1BQ.A02(85263);
        this.A09 = "";
        this.A0C = "";
        this.A0F = "";
        this.A0E = "";
        this.A0D = "";
        this.A08 = "";
        this.A00 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v123, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecAccountSearch, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSO, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    /* JADX WARN: Type inference failed for: r309v11, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSilent, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        AccountLoginSegueBase accountLoginSegueBase;
        BLp bLp2 = BLp.A09;
        if (bLp == bLp2) {
            HashSet hashSet = this.A0H;
            String str = this.A09;
            String str2 = this.A0C;
            ?? accountLoginSegueBase2 = new AccountLoginSegueBase(bLp2, false);
            accountLoginSegueBase2.A00 = str;
            accountLoginSegueBase2.A01 = str2;
            accountLoginSegueBase = accountLoginSegueBase2;
            if (hashSet != null) {
                accountLoginSegueBase2.A02 = hashSet;
                accountLoginSegueBase = accountLoginSegueBase2;
            }
        } else {
            BLp bLp3 = BLp.A0L;
            AccountLoginSegueBase accountLoginSegueBase3 = null;
            if (bLp == bLp3) {
                ?? accountLoginSegueRecBaseData = new AccountLoginSegueRecBaseData(this, bLp3, this.A09);
                accountLoginSegueRecBaseData.A00 = AnonymousClass001.A0s();
                accountLoginSegueRecBaseData.A01 = true;
                return accountLoginSegueRecBaseData;
            }
            if (bLp == BLp.A0T) {
                this.A02.getClass();
                return new AccountLoginSegueTwoFacAuth(this.A02, this.A09, this.A0C, this.A0B, this.A0A, this.A0J);
            }
            if (bLp == BLp.A04) {
                String str3 = this.A07;
                accountLoginSegueBase = accountLoginSegueBase3;
                if (str3 != null) {
                    return new AccountLoginSegueCheckpoint(str3, this.A06);
                }
            } else {
                BLp bLp4 = BLp.A0Q;
                if (bLp == bLp4) {
                    this.A02.getClass();
                    LoginErrorData loginErrorData = this.A02;
                    AccountLoginSegueRecBaseData accountLoginSegueRecBaseData2 = new AccountLoginSegueRecBaseData(this, bLp4, this.A09);
                    accountLoginSegueRecBaseData2.A02 = loginErrorData.A01;
                    return accountLoginSegueRecBaseData2;
                }
                if (bLp == BLp.A02) {
                    accountLoginSegueBase = accountLoginSegueBase3;
                    if (this.A01 != null) {
                        if (((FIM) this.A04.get()).A05(EPg.A0n) != 1) {
                            AccountCandidateModel accountCandidateModel = this.A01;
                            return new AccountLoginSegueAutoIdentificationOauthContinueAs(accountCandidateModel, COX.A01(accountCandidateModel.A00(), this.A08));
                        }
                        ArrayList A0s = AnonymousClass001.A0s();
                        A0s.add(new SSOAccountModel(this.A01, COX.A01(this.A01.A00(), this.A08)));
                        ?? accountLoginSegueBase4 = new AccountLoginSegueBase(BLp.A0R, false);
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        accountLoginSegueBase4.A06 = A0s2;
                        A0s2.addAll(A0s);
                        return accountLoginSegueBase4;
                    }
                } else {
                    accountLoginSegueBase = accountLoginSegueBase3;
                    if (bLp == BLp.A0O) {
                        FirstPartySsoSessionInfo firstPartySsoSessionInfo = this.A03;
                        if (firstPartySsoSessionInfo == null) {
                            return new AccountLoginSegueMainScreen();
                        }
                        String str4 = firstPartySsoSessionInfo.A08;
                        return new AccountLoginSegueRegSoftMatchLogin(EPM.A0L, new RecoveredAccount(str4, "", "", firstPartySsoSessionInfo.A06, StringFormatUtil.formatStrLocaleSafe("https://graph.facebook.com/%s/picture?type=small&access_token=3140702482705885|0070f6a4ace25c284262d8b2cccb4cdf", str4), 0, false), "");
                    }
                }
            }
        }
        return accountLoginSegueBase;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 2;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0B);
    }
}
