package com.facebook.messaging.accountlogin;

import X.0FI;
import X.0Fc;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Fe;
import X.1G2;
import X.1Ql;
import X.1iF;
import X.1tC;
import X.2Q0;
import X.2Q1;
import X.2Vz;
import X.2W0;
import X.4DK;
import X.4DL;
import X.4DM;
import X.4YU;
import X.4YV;
import X.AbG;
import X.AbI;
import X.AbK;
import X.AbstractC00603o4;
import X.AnonymousClass000;
import X.BLS;
import X.BLp;
import X.BaN;
import X.Bbi;
import X.BiN;
import X.BjU;
import X.C00i;
import X.C03983zh;
import X.C0qy;
import X.C15h;
import X.C1Y6;
import X.C1io;
import X.C1kx;
import X.C2R;
import X.C3o5;
import X.C50z;
import X.CDo;
import X.CIw;
import X.D73;
import X.DBe;
import X.DE4;
import X.DEf;
import X.KaZ;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;
import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.facebook.fblibraries.fblogin.SsoSource;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueCredentials;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueLogout;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSilent;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueTOSAcceptance;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueTwoFacAuth;
import com.facebook.messaging.universallinks.receiver.InstallReferrerFetchJobIntentService;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: AccountLoginActivity.class */
public class AccountLoginActivity extends FbFragmentActivity implements DEf, C1io, C1kx, DE4 {
    public C0qy A00;
    public C00i A01;
    public C00i A02;
    public CDo A03;
    public CIw A04;
    public AccountLoginSegueBase A05;
    public AccountLoginSegueBase A06;
    public Bbi A07;
    public BLS A08;
    public BLp A09;
    public BLp A0A;
    public MigColorScheme A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public 2Vz A0J;
    public C50z A0K;
    public C15h A0L;
    public final C00i A0M = 1BQ.A02(100109);
    public final C00i A0N = 1BQ.A01();

    public static Intent A12(Context context, BLS bls, String str, String str2, String str3, boolean z, boolean z2) {
        Intent A0D = C3o5.A0D(context, AccountLoginActivity.class);
        A0D.putExtra("flow_type", (Serializable) bls);
        A0D.putExtra("recovered_account", (Parcelable) null);
        A0D.putExtra("recovered_dbl_enabled", false);
        A0D.putExtra("entry_point", str);
        A0D.putExtra("is_msite_sso_eligible", z);
        A0D.putExtra("is_msite_sso_uri", str2);
        A0D.putExtra("target_user_id", str3);
        A0D.putExtra(AbstractC00603o4.A00(61), z2);
        return A0D;
    }

    public static Intent A15(Context context, String str) {
        return A12(context, BLS.A02, str, null, null, false, false);
    }

    public static Intent A16(Context context, String str, String str2, boolean z, boolean z2) {
        return A12(context, BLS.A03, str, str2, null, z, z2);
    }

    public static void A1D(AccountLoginActivity accountLoginActivity) {
        accountLoginActivity.A0B = LightColorScheme.A00();
        Window window = accountLoginActivity.getWindow();
        if (window == null) {
            1BK.A09(accountLoginActivity.A0N).D0v("AccountLoginActivity", "getWindow is null");
            return;
        }
        MigColorScheme.A00(window.getDecorView(), accountLoginActivity.A0B);
        1Bn.A0A(16838);
        1tC.A01(window, accountLoginActivity.A0B.BDl(), accountLoginActivity.A0B.BDl());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbK.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        2Vz r0 = this.A0J;
        r0.getClass();
        r0.A0A(false);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        C00i c00i = this.A0I;
        c00i.getClass();
        c00i.get();
        if (4DK.A01(intent) || ((intent.hasExtra("is_msite_sso_eligible") && intent.getBooleanExtra("is_msite_sso_eligible", false)) || 4DM.A01(intent) || ((intent.hasExtra("is_msite_sso_uri") && ((4DL) 4YU.A0p(this.A0F)).A00(intent, intent.getStringExtra("is_msite_sso_uri"))) || (intent.getBooleanExtra("bloks_redirect_to_2fa", false) && intent.getBooleanExtra("TwoFA", false))))) {
            setIntent(intent);
        }
    }

    /* JADX WARN: Type inference failed for: r313v7, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueCheckpoint] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        AccountLoginSegueBase accountLoginSegueBase;
        super.A2y(bundle);
        this.A04 = (CIw) 1Bn.A0A(84023);
        this.A00 = AbI.A0D();
        this.A03 = (CDo) 1Bn.A0A(85282);
        this.A0K = (C50z) 1Bn.A0A(49449);
        this.A0J = (2Vz) 1Bn.A0E(this, (1BY) null, 17037);
        this.A02 = 1BV.A00(85280);
        this.A01 = 1BV.A00(16430);
        this.A0G = 1BV.A00(17014);
        this.A0L = DBe.A00(this, 10);
        this.A0I = 1BV.A00(32993);
        this.A0F = 1BV.A00(32994);
        this.A0H = 1BQ.A02(85263);
        this.A07 = new Bbi((BaN) C1Y6.A00(this, "com_facebook_messaging_accountlogin_plugins_interfaces_interactions_AccountLoginExitSpec", "All", new Object[0]));
        setContentView(2132541464);
        this.A00.getClass();
        A1D(this);
        BiN biN = (BiN) 4YU.A0p(this.A02);
        ResultReceiver resultReceiver = new ResultReceiver((Handler) 4YU.A0p(this.A01)) { // from class: com.facebook.messaging.accountlogin.AccountLoginActivity.3
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle2) {
                if (i == -1) {
                    bundle2.getString("extra_referrer_uri");
                    super.onReceiveResult(i, bundle2);
                }
            }
        };
        C00i c00i = biN.A00;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        1G2 r0 = KaZ.A00;
        if (!A0R.AZn(r0, false)) {
            AbK.A1O(1BL.A0V(c00i), r0);
            Intent A0D = C3o5.A0D(this, InstallReferrerFetchJobIntentService.class);
            A0D.putExtra("extra_result_receiver", resultReceiver);
            0Fc.A00(this, A0D, InstallReferrerFetchJobIntentService.class);
        }
        C03983zh c03983zh = (C03983zh) 1Bn.A0A(85283);
        if (EndToEnd.isRunningEndToEndTest() && !c03983zh.A00()) {
            checkPermission("android.permission.GET_ACCOUNTS", Process.myPid(), Process.myUid());
            for (SsoSource ssoSource : Arrays.asList(new SsoSource(1, AnonymousClass000.A00(31)), new SsoSource(1, "com.facebook.lite"), new SsoSource(1, AnonymousClass000.A00(249)), new SsoSource(0, "com.facebook.lite"), new SsoSource(0, "com.facebook.rememberme"), new SsoSource(1, AnonymousClass000.A00(52)))) {
                AccountManager accountManager = AccountManager.get(this);
                for (Account account : accountManager.getAccountsByType(ssoSource.A03)) {
                    accountManager.removeAccountExplicitly(account);
                }
            }
        }
        C00i c00i2 = this.A0M;
        2Q0.A00((2Q0) c00i2.get(), "AccountLoginActivityCreated");
        getIntent();
        this.A0C = getIntent().getStringExtra("entry_point");
        ((2Q1) 4YU.A0p(this.A0G)).A00(this.A0C, true);
        this.A08 = BLS.A03;
        Intent intent = getIntent();
        if (intent.hasExtra("flow_type") && intent.getSerializableExtra("flow_type") != null) {
            this.A08 = intent.getSerializableExtra("flow_type");
        }
        C50z c50z = this.A0K;
        c50z.getClass();
        c50z.A00("app_install");
        if (EndToEnd.isRunningEndToEndTest()) {
            getIntent();
            if (this.A0C == null) {
                getIntent().putExtra("entry_point", "entry_point_app_start");
            }
        }
        if (bundle == null) {
            FbUserSession A0D2 = 4YV.A0D(this);
            CIw cIw = this.A04;
            cIw.getClass();
            cIw.A01(A0D2);
            BLS bls = this.A08;
            BLS bls2 = BLS.A05;
            CIw cIw2 = this.A04;
            cIw2.getClass();
            String str = bls == bls2 ? "logged_in_silent_login" : "logged_out_login_registration";
            0fH.A0g(str, "AccountLoginFunnelLogger", "add tag: %s");
            AbG.A0r(cIw2.A03).flowAnnotate(cIw2.A00, "regular", str);
            if (!TextUtils.isEmpty(this.A0C)) {
                CIw cIw3 = this.A04;
                cIw3.getClass();
                String str2 = this.A0C;
                0fH.A0g(str2, "AccountLoginFunnelLogger", "add tag: %s");
                AbG.A0r(cIw3.A03).flowAnnotate(cIw3.A00, "regular", str2);
            }
            2Vz r02 = this.A0J;
            r02.getClass();
            1Ql A0V = 1BL.A0V(r02.A04);
            A0V.CaH(2W0.A0C, 1BL.A08(r02.A03));
            A0V.commit();
            getIntent();
            BLS bls3 = this.A08;
            if (bls3 == BLS.A02 || bls3 == BLS.A04) {
                accountLoginSegueBase = new AccountLoginSegueLogout();
            } else {
                if (bls3 != BLS.A06) {
                    C00i c00i3 = this.A0I;
                    c00i3.getClass();
                    c00i3.get();
                    if (!4DK.A01(getIntent())) {
                        if (BjU.A01 || !EndToEnd.isRunningEndToEndTest() || TextUtils.isEmpty(EndToEnd.A00("fb.e2e.e2e_username", true, false)) || TextUtils.isEmpty(EndToEnd.A00("fb.e2e.e2e_password", true, false))) {
                            if (!intent.getBooleanExtra("caa_add_account_flow", false)) {
                                C15h c15h = this.A0L;
                                c15h.getClass();
                                if (1BL.A1a(c15h)) {
                                    accountLoginSegueBase = new AccountLoginSegueSilent();
                                }
                            }
                            if (!4DM.A01(getIntent())) {
                                Intent intent2 = getIntent();
                                boolean z = false;
                                if (intent2.getBooleanExtra("bloks_redirect_to_2fa", false) && intent2.getBooleanExtra("TwoFA", false)) {
                                    z = true;
                                }
                                Intent intent3 = getIntent();
                                if (z) {
                                    String stringExtra = intent3.getStringExtra("2fa_checkpoints_payload_error");
                                    LoginErrorData A00 = LoginErrorData.A00(stringExtra);
                                    boolean z2 = false;
                                    if (stringExtra == null) {
                                        0fH.A0B(LoginErrorData.class, "Null CAA TwoFac error response");
                                    } else {
                                        try {
                                            z2 = LoginErrorData.A02(stringExtra).getBoolean("error_should_update_two_factor_content");
                                        } catch (JSONException e) {
                                            0fH.A0H(LoginErrorData.class, "JSON Exception", e);
                                        }
                                    }
                                    String str3 = "";
                                    if (stringExtra == null) {
                                        0fH.A0B(LoginErrorData.class, "Null CAA TwoFac error response");
                                    } else {
                                        try {
                                            str3 = LoginErrorData.A02(stringExtra).getString("error_message");
                                        } catch (JSONException e2) {
                                            0fH.A0H(LoginErrorData.class, "JSON Exception", e2);
                                        }
                                    }
                                    if (TextUtils.isEmpty(str3) || z2) {
                                        str3 = str3;
                                        if (stringExtra == null) {
                                            0fH.A0B(LoginErrorData.class, "Null CAA TwoFac error response");
                                        } else {
                                            try {
                                                str3 = LoginErrorData.A02(stringExtra).getString("error_user_msg");
                                            } catch (JSONException e3) {
                                                0fH.A0H(LoginErrorData.class, "JSON Exception", e3);
                                            }
                                        }
                                    }
                                    String str4 = str3;
                                    if (stringExtra == null) {
                                        0fH.A0B(LoginErrorData.class, "Null CAA TwoFac error response");
                                    } else {
                                        try {
                                            str4 = LoginErrorData.A02(stringExtra).getString("error_user_title");
                                        } catch (JSONException e4) {
                                            0fH.A0H(LoginErrorData.class, "JSON Exception", e4);
                                        }
                                    }
                                    String str5 = str3;
                                    if (stringExtra == null) {
                                        0fH.A0B(LoginErrorData.class, "Null CAA TwoFac error response");
                                    } else {
                                        try {
                                            str5 = LoginErrorData.A02(stringExtra).getString(ErrorReportingConstants.USER_ID_KEY);
                                        } catch (JSONException e5) {
                                            0fH.A0H(LoginErrorData.class, "JSON Exception", e5);
                                        }
                                    }
                                    ((C2R) 1Bn.A0A(85275)).A00(A00);
                                    accountLoginSegueBase = new AccountLoginSegueTwoFacAuth(A00, str5, str3, str4, str3, z2);
                                } else if (!intent3.getBooleanExtra("bloks_redirect_to_2fa", false) || intent3.getBooleanExtra("TwoFA", false)) {
                                    accountLoginSegueBase = new AccountLoginSegueTOSAcceptance();
                                } else {
                                    LoginErrorData A002 = LoginErrorData.A00(getIntent().getStringExtra("2fa_checkpoints_payload_error"));
                                    String str6 = A002.A07;
                                    String str7 = A002.A03;
                                    ?? accountLoginSegueBase2 = new AccountLoginSegueBase(BLp.A04, true);
                                    accountLoginSegueBase2.A02 = str6;
                                    accountLoginSegueBase2.A01 = str7;
                                    accountLoginSegueBase2.A03 = true;
                                    accountLoginSegueBase = accountLoginSegueBase2;
                                }
                            }
                        } else {
                            BjU bjU = (BjU) 1Bi.A03(85279);
                            BjU.A01 = true;
                            String A003 = EndToEnd.A00("fb.e2e.e2e_username", true, false);
                            String A004 = EndToEnd.A00("fb.e2e.e2e_password", true, false);
                            Context context = bjU.A00;
                            if (context != null) {
                                Log.w(AnonymousClass000.A00(ActionId.ACTIVITY_RESUME), String.format("Using headless E2E login, user: %s, password: %s", A003, A004));
                                Toast.makeText(context, "Using headless E2E login", 0).show();
                            }
                            accountLoginSegueBase = new AccountLoginSegueCredentials(A003, A004, A003, A004);
                        }
                    }
                }
                accountLoginSegueBase = new AccountLoginSegueCredentials();
            }
            accountLoginSegueBase.A05(this);
            2Q0.A00((2Q0) c00i2.get(), "AccountLoginActivityFlowStart");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        if (r0.A01 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        if (r0.A00 != null) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase, com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueClearCheckpoint] */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.AccountLoginActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-2049540887);
        super.onPause();
        this.A0D = false;
        0FI.A07(1527579235, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(676766142);
        super.onResume();
        this.A0D = true;
        if (this.A0E) {
            this.A0E = false;
            BLp bLp = this.A0A;
            if (bLp != null) {
                runOnUiThread(new D73(this, bLp));
                this.A0A = null;
            }
        }
        ((1Fe) 1Bi.A03(16496)).A00("logged_out_bloks_playground_toggle");
        0FI.A07(1799943965, A00);
    }
}
