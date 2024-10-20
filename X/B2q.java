package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethodParams;
import com.facebook.auth.credentials.BrowserToNativeSSOCredentials;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueCredentials;

/* loaded from: B2q.class */
public final class B2q extends B2l {
    public static final 1G2 A0x = 1G3.A01(1G0.A04, "oauth_auto_logged_in/");
    public static final String __redex_internal_original_name = "AccountLoginCredentialsFragment";
    public FbUserSession A03;
    public C00i A04;
    public COx A05;
    public COx A06;
    public COX A07;
    public Bjv A08;
    public CIj A09;
    public C4T A0A;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0I;
    public boolean A0J;
    public COx A0L;
    public COx A0M;
    public COx A0N;
    public Boolean A0O;
    public long A02 = 0;
    public boolean A0G = true;
    public boolean A0H = true;
    public final C00i A0w = 1BV.A00(32993);
    public final C00i A0Q = 1BV.A00(85282);
    public final C00i A0c = 1BV.A00(84018);
    public final C00i A0R = AbF.A0S(this, 17037);
    public final C00i A0S = AbI.A0N();
    public final C00i A0T = 1BQ.A02(83725);
    public final C00i A0a = 1BV.A00(84025);
    public final C00i A0Z = 1BQ.A02(85272);
    public final C00i A0j = 1BQ.A02(32813);
    public final C00i A0Y = 1BQ.A02(85265);
    public final C00i A0X = 1BV.A00(85267);
    public final C00i A0v = 1BV.A00(32994);
    public final C00i A0t = AbH.A0a();
    public final C00i A0U = 1BQ.A02(85269);
    public final C00i A0g = 1BV.A00(756);
    public final C00i A0s = AbF.A0S(this, 757);
    public final C00i A0i = AbF.A0S(this, 131243);
    public final C00i A0u = 1BQ.A02(16617);
    public final C00i A0V = AbH.A0H();
    public final C00i A0d = 1BV.A00(98666);
    public final C00i A0b = 1BQ.A02(100107);
    public final C00i A0f = 1BV.A00(116182);
    public final C00i A0h = AbH.A0M();
    public final C00i A0P = 1BQ.A02(66227);
    public final Bzx A0k = new Bzx(this);
    public final C6Y A0l = new C6Y(this);
    public final BPY A0p = new B37(this, 2);
    public final DIO A0o = new ChP(this, 1);
    public final DJV A0n = new ChO(this, 1);
    public final Bzy A0m = new Bzy(this);
    public boolean A0K = false;
    public final BoQ A0r = new BoQ();
    public final C00i A0e = 1BV.A00(100129);
    public final C00i A0W = AbH.A0S();
    public String A0C = "";
    public String A0B = "";
    public int A01 = 0;
    public int A00 = 0;
    public final DHx A0q = new ChT(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(B2q b2q) {
        b2q.A09 = ((AbR) 1Bn.A0A(758)).A0B(b2q.requireActivity(), b2q.A1X() == BLS.A06 ? 0S2.A01 : 0S2.A00);
        if (((AccountLoginSegueCredentials) ((AlJ) b2q).A01).A0K || 4DM.A01(b2q.requireActivity().getIntent())) {
            return;
        }
        ((AccountLoginSegueCredentials) ((AlJ) b2q).A01).A0K = true;
        b2q.A09.A03(b2q.A0q);
    }

    public static void A09(B2q b2q) {
        if (TextUtils.isEmpty(b2q.A0C)) {
            return;
        }
        b2q.A0C = "";
        b2q.A1d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0A(B2q b2q, String str, String str2) {
        String A04 = ((1Oe) b2q.A0u.get()).A04(C1fe.A2L);
        if (A04 == null) {
            A04 = "";
        }
        AccountRecoverySearchAccountMethodParams accountRecoverySearchAccountMethodParams = new AccountRecoverySearchAccountMethodParams("", str2, str, A04);
        FragmentActivity activity = b2q.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new D74(accountRecoverySearchAccountMethodParams, b2q));
        }
    }

    public static void A0B(B2q b2q, String str, String str2, String str3, boolean z) {
        String str4 = str;
        b2q.A1a();
        AccountLoginSegueCredentials accountLoginSegueCredentials = (AccountLoginSegueCredentials) ((AlJ) b2q).A01;
        String str5 = accountLoginSegueCredentials.A0G;
        boolean z2 = false;
        if (str5 != null && !str5.isEmpty()) {
            z2 = true;
        }
        int i = 0;
        if (z2) {
            str4 = str5;
            if (str5 == null) {
                return;
            }
        }
        if (z) {
            i = accountLoginSegueCredentials.A00 + 1;
            accountLoginSegueCredentials.A00 = i;
        }
        CIj cIj = b2q.A09;
        if (cIj != null) {
            C2M c2m = cIj.A02;
            c2m.A00("regular_login_attempt");
            AbG.A0r(c2m.A01).flowAnnotate(c2m.A00, "NULL_CREDENTIAL", "");
        }
        EPM epm = EPM.A0L;
        if (str3.equals("one_click_login_account_login")) {
            epm = EPM.A0R;
        }
        if (b2q.A0O.booleanValue()) {
            epm = EPM.A0S;
        }
        PasswordCredentials passwordCredentials = new PasswordCredentials(epm, str4, str2, str3, i);
        if (b2q.A1X() != BLS.A06) {
            b2q.A0M.A04(passwordCredentials, "action_auth_with_credentials", 2131952189);
        } else {
            b2q.A0L.A03(AbJ.A07(passwordCredentials), "action_auth_with_credentials", 2131952189);
        }
    }

    private boolean A0C(Intent intent) {
        boolean z = false;
        if (intent != null && intent.getData() != null) {
            C00i c00i = this.A0w;
            4DK r0 = (4DK) c00i.get();
            if (((1Ex) 1Bi.A03(83426)).BTw() && r0.A04(intent)) {
                String BD0 = 1BK.A0R(((4DK) c00i.get()).A01).BD0(2W0.A09);
                String A03 = ((4DK) c00i.get()).A03();
                String queryParameter = intent.getData().getQueryParameter("token");
                String queryParameter2 = intent.getData().getQueryParameter("blob");
                A1f();
                if (!TextUtils.isEmpty(A03) && !TextUtils.isEmpty(queryParameter) && A03.equals(queryParameter)) {
                    AbH.A0h(this).A07(BMG.A1G);
                    z = this.A0N.A04(new BrowserToNativeSSOCredentials(Qph.A01, BD0, queryParameter2), "action_auth_with_browser_to_native_sso", 2131952189);
                }
            }
        }
        return z;
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x019e, code lost:
    
        if (r0 == X.BLp.A02) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // X.B2l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B2q.A1S(android.os.Bundle):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        CIj cIj;
        super/*X.1pK*/.onActivityResult(i, i2, intent);
        if (i != 55 || (cIj = this.A09) == null || intent == null) {
            return;
        }
        cIj.A02(i2);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-1958646807);
        super.onDestroy();
        AbM.A0n(this.A0j).A0C(this.A0m);
        this.A0K = false;
        0FI.A08(-2004605959, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(230583356);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A02 = 1BL.A08(this.A0t);
        this.A0G = true;
        this.A0H = true;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            String stringExtra = intent.getStringExtra(AbstractC00603o4.A00(192));
            if (4DM.A01(intent)) {
                String queryParameter = (intent.getData() == null || intent.getData().getQueryParameter("n") == null) ? "" : intent.getData().getQueryParameter("n");
                String A00 = 4DM.A00(intent);
                A1f();
                A0B(this, A00, queryParameter, "one_click_login_account_login", false);
                this.A0I = true;
            } else if ("auth_type_nonce".equals(stringExtra)) {
                A1g();
            } else if (!A0C(intent)) {
                if ("auth_type_native_sso".equals(stringExtra)) {
                    A1h();
                } else if (intent.hasExtra("is_msite_sso_eligible") && intent.getBooleanExtra("is_msite_sso_eligible", false)) {
                    intent.removeExtra("is_msite_sso_eligible");
                    A1i(BMG.A10);
                } else if (intent.hasExtra("is_msite_sso_uri")) {
                    C00i c00i = this.A0v;
                    if (((4DL) c00i.get()).A00(intent, intent.getStringExtra("is_msite_sso_uri"))) {
                        intent.removeExtra("is_msite_sso_uri");
                        Object obj = c00i.get();
                        Context context = getContext();
                        if (context != null) {
                            JSp jSp = new JSp(context);
                            jSp.A06(2131960933);
                            CSG.A05(jSp, obj, 6, 2131955720);
                            jSp.A0K(false);
                            7zN.A13(jSp);
                        }
                        ((CQH) this.A0S.get()).A0N(BMG.A0p, "", "", "", "");
                    }
                }
            }
        }
        if (1BK.A0R(this.A0W).AZn(5SH.A0A, false)) {
            A1d();
        }
        0FI.A08(-1128520406, A02);
    }

    public void onStop() {
        2Vz A0h;
        BMG bmg;
        int A02 = 0FI.A02(1515369395);
        super.onStop();
        AccountLoginSegueCredentials accountLoginSegueCredentials = (AccountLoginSegueCredentials) ((AlJ) this).A01;
        if (accountLoginSegueCredentials.A00 == 0) {
            boolean A0B = 1JF.A0B(accountLoginSegueCredentials.A09);
            boolean A0B2 = 1JF.A0B(((AccountLoginSegueCredentials) ((AlJ) this).A01).A0C);
            CQH A0V = AbF.A0V(this.A0S);
            if (A0B) {
                if (A0B2) {
                    A0V.A0E(BMG.A2Z, (String) null);
                    A0h = AbH.A0h(this);
                    bmg = BMG.A00;
                } else {
                    A0V.A0E(BMG.A2b, (String) null);
                    A0h = AbH.A0h(this);
                    bmg = BMG.A03;
                }
            } else if (A0B2) {
                A0V.A0E(BMG.A2c, (String) null);
                A0h = AbH.A0h(this);
                bmg = BMG.A04;
            } else {
                A0V.A0E(BMG.A2a, (String) null);
                A0h = AbH.A0h(this);
                bmg = BMG.A01;
            }
            A0h.A08(bmg, this.A02);
        }
        0FI.A08(1036142143, A02);
    }
}
