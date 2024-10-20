package com.facebook.messaging.accountlogin.fragment.segue;

import X.1BL;
import X.AnonymousClass001;
import X.BLp;
import X.C00i;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.auth.protocol.InstagramSSOUserInfo;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.auth.protocol.LinkedFbUserFromIgSessionInfo;
import com.facebook.auth.protocol.UserTypeResult;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import java.util.List;

/* loaded from: AccountLoginSegueSplash.class */
public final class AccountLoginSegueSplash extends AccountLoginSegueBase {
    public AccountCandidateModel A00;
    public LoginErrorData A01;
    public InstagramSSOUserInfo A02;
    public LinkedFbUserFromIgSessionInfo A03;
    public FirstPartySsoSessionInfo A04;
    public C00i A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public final List A0C;

    public AccountLoginSegueSplash() {
        super(BLp.A0B, false);
        this.A00 = null;
        this.A0A = AnonymousClass001.A0s();
        this.A0C = AnonymousClass001.A0s();
        this.A06 = "";
        super.A00 = true;
    }

    public AccountLoginSegueSplash(Parcel parcel) {
        super(parcel);
        this.A00 = null;
        this.A0A = AnonymousClass001.A0s();
        this.A0C = AnonymousClass001.A0s();
        this.A06 = "";
        this.A02 = (InstagramSSOUserInfo) 1BL.A0C(parcel, InstagramSSOUserInfo.class);
        parcel.readTypedList(this.A0A, FirstPartySsoSessionInfo.CREATOR);
        super.A00 = true;
    }

    private boolean A00() {
        String str;
        InstagramSSOUserInfo instagramSSOUserInfo = this.A02;
        if (instagramSSOUserInfo == null) {
            return false;
        }
        UserTypeResult userTypeResult = ((InstagramUserInfo) instagramSSOUserInfo).A00;
        String str2 = userTypeResult.A01;
        if ((!"instagram".equals(str2) && !"facebook".equals(str2) && !"messenger_only".equals(str2)) || (str = instagramSSOUserInfo.A00.A00) == null || userTypeResult.A03 == null || userTypeResult.A05 == null || TextUtils.isEmpty(userTypeResult.A00) || TextUtils.isEmpty(str)) {
            return false;
        }
        return "facebook".equals(str2) || "messenger_only".equals(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b4, code lost:
    
        if (r0.equals(((com.facebook.auth.protocol.InstagramUserInfo) r0).A00.A00) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d5, code lost:
    
        if (r0.equals(((com.facebook.auth.protocol.InstagramUserInfo) r0).A00.A00) != false) goto L80;
     */
    /* JADX WARN: Type inference failed for: r0v101, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSO, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOFacebook, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    /* JADX WARN: Type inference failed for: r0v195, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOInstagram, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    /* JADX WARN: Type inference failed for: r0v85, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSmartlock, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    /* JADX WARN: Type inference failed for: r306v2, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOInstagram, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase] */
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase A03(X.BLp r302) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSplash.A03(X.BLp):com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 15;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeTypedList(this.A0A);
    }
}
