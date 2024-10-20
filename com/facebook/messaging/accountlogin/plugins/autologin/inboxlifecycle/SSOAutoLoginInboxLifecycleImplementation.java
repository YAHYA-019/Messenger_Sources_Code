package com.facebook.messaging.accountlogin.plugins.autologin.inboxlifecycle;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1G0;
import X.1G2;
import X.3jD;
import X.BUp;
import X.Bm8;
import X.C15h;
import com.facebook.messaging.neue.nux.acctlogin.AccountSSOAutoLoginCardFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;

/* loaded from: SSOAutoLoginInboxLifecycleImplementation.class */
public final class SSOAutoLoginInboxLifecycleImplementation {
    public static final 1G2 A06;
    public static final 1G2 A07;
    public static final 1G2 A08;
    public static final 1G2 A09;
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public static final 1G2 A0C;
    public AccountSSOAutoLoginCardFragment A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 06Z A04;
    public final C15h A05;

    static {
        1G2 r0 = 1G0.A04;
        1G2 A0D = r0.A0D("reached_neue_activity/");
        11T.A0A(A0D);
        A0A = A0D;
        1G2 A0D2 = r0.A0D("sso_auto_logged_in/");
        11T.A0A(A0D2);
        A0B = A0D2;
        1G2 A0D3 = r0.A0D("oauth_auto_logged_in/");
        11T.A0A(A0D3);
        A08 = A0D3;
        1G2 A0D4 = r0.A0D("oauth_switcher_add_account_auto_logged_in/");
        11T.A0A(A0D4);
        A09 = A0D4;
        1G2 A0D5 = r0.A0D("is_multi_sso_auto_login/");
        11T.A0A(A0D5);
        A06 = A0D5;
        1G2 A0D6 = r0.A0D("navigate_to_chat_thread_info/");
        11T.A0A(A0D6);
        A07 = A0D6;
        1G2 A0D7 = r0.A0D("trigger_bcf_info/");
        11T.A0A(A0D7);
        A0C = A0D7;
    }

    public SSOAutoLoginInboxLifecycleImplementation(06Z r302, 1De r303) {
        11T.A0F(r302, 2);
        this.A01 = r303;
        this.A04 = r302;
        this.A05 = new 3jD(this, 8);
        this.A03 = 1Bq.A00(33013);
        this.A02 = 1Bu.A03(r303.A00, 17037);
    }

    public static final void A00(SSOAutoLoginInboxLifecycleImplementation sSOAutoLoginInboxLifecycleImplementation, String str, String str2, boolean z, boolean z2) {
        String str3;
        User user = (User) sSOAutoLoginInboxLifecycleImplementation.A05.get();
        if (user == null || (str3 = user.A0X.displayName) == null) {
            return;
        }
        AccountSSOAutoLoginCardFragment A00 = BUp.A00((Bm8) null, str3, user.A13, str2, z, z2);
        A00.A0m(sSOAutoLoginInboxLifecycleImplementation.A04, str);
        sSOAutoLoginInboxLifecycleImplementation.A00 = A00;
    }

    public static final boolean A01(SSOAutoLoginInboxLifecycleImplementation sSOAutoLoginInboxLifecycleImplementation, 1G2 r302) {
        return ((FbSharedPreferences) sSOAutoLoginInboxLifecycleImplementation.A03.A00.get()).AZn(r302, false);
    }
}
