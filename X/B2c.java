package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethodParams;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.endtoend.EndToEnd;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOFacebook;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSplash;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: B2c.class */
public final class B2c extends B2f {
    public static final 1G2 A0W;
    public static final 1G2 A0X;
    public static final String __redex_internal_original_name = "AccountLoginSplashFragment";
    public FbUserSession A00;
    public COx A01;
    public COx A02;
    public COx A03;
    public COx A04;
    public COx A05;
    public COx A06;
    public final C00i A08 = 1BQ.A02(16465);
    public final C00i A0A = 1BQ.A01();
    public final C00i A0E = AbF.A0S(this, 49964);
    public final C00i A0R = 1BQ.A02(83426);
    public final C00i A0C = AbH.A0S();
    public final C00i A0S = 1BQ.A02(16592);
    public final C00i A0I = AbH.A0I();
    public final C00i A0G = 1BV.A00(100129);
    public final C00i A07 = AbI.A0N();
    public final C00i A09 = new 1HH(this, 99377);
    public final C00i A0B = 1BV.A00(68334);
    public final C00i A0H = AbF.A0S(this, 131243);
    public final C00i A0Q = 1BQ.A02(16617);
    public final C00i A0P = 1BQ.A02(16885);
    public final C00i A0F = 1BQ.A02(100266);
    public final C00i A0T = AbF.A0S(this, 49478);
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final AtomicBoolean A0K = new AtomicBoolean(false);
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public final AtomicBoolean A0N = new AtomicBoolean(false);
    public final AtomicBoolean A0O = new AtomicBoolean(false);
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final C00i A0D = 1BV.A00(16749);
    public final DJy A0J = new ChQ(this, 3);
    public final BPY A0U = new B37(this, 15);

    static {
        1G2 r0 = 1G0.A04;
        A0X = 1G3.A01(r0, "sso_auto_logged_in_then_logged_out/");
        A0W = 1G3.A01(r0, "is_multi_sso_auto_login/");
    }

    public static void A08(C00i c00i, B2c b2c) {
        67R r0 = (67R) b2c.A0E.get();
        C00i c00i2 = r0.A02;
        ListenableFuture A0a = AbL.A0a(c00i2, DBE.A00(MoreExecutors.listeningDecorator((ScheduledExecutorService) c00i2.get()), r0, 0), TimeUnit.SECONDS);
        1Kd.A0D(b2c.A0I, D4p.A00(c00i, b2c, 4), A0a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x03e5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.AlJ, X.B2k, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v165, types: [androidx.fragment.app.Fragment, X.B2g] */
    public static void A09(B2c b2c) {
        BLp bLp;
        6HM r306;
        C8S c8s;
        AlJ alJ;
        BLp bLp2;
        AlJ alJ2;
        FragmentActivity activity = b2c.getActivity();
        if (activity != null) {
            b2c.A0S.get();
            if (!1MM.A01) {
                C00i c00i = b2c.A0C;
                if (1BK.A0R(c00i).AZn(((C1f0) b2c.A0D.get()).A01(), false) || ((1Ex) b2c.A0R.get()).BTw()) {
                    bLp = BLp.A09;
                } else {
                    String stringExtra = activity.getIntent().getStringExtra("entry_point");
                    if ("entry_point_logout_session_expired".equals(stringExtra)) {
                        String stringExtra2 = activity.getIntent().getStringExtra("target_user_id");
                        if (!1JF.A0B(stringExtra2) && ((FIM) b2c.A0G.get()).A06(EPg.A0l, stringExtra2) == 1) {
                            C00i c00i2 = b2c.A07;
                            AbF.A0V(c00i2).A0G(BMG.A2h, stringExtra2);
                            for (FirstPartySsoSessionInfo firstPartySsoSessionInfo : ((AccountLoginSegueSplash) ((AlJ) b2c).A01).A0A) {
                                if (firstPartySsoSessionInfo.A08.equals(stringExtra2)) {
                                    String str = firstPartySsoSessionInfo.A05;
                                    if (!1JF.A0B(str)) {
                                        AbF.A0V(c00i2).A0G(BMG.A2f, stringExtra2);
                                        A0D(b2c.A06, str);
                                        return;
                                    }
                                }
                            }
                            if (!b2c.A0V.getAndSet(true)) {
                                C2121Dea c2121Dea = new C2121Dea(activity);
                                c2121Dea.A06(2131952976);
                                c2121Dea.A05(2131952974);
                                CSG.A06(c2121Dea, b2c, 4, 2131952975);
                                c2121Dea.A0C(false);
                                c2121Dea.A04();
                                return;
                            }
                        }
                    }
                    AtomicBoolean atomicBoolean = b2c.A0K;
                    if (atomicBoolean.get() && 1BK.A1Y(((AccountLoginSegueSplash) ((AlJ) b2c).A01).A0A)) {
                        AccountLoginSegueSplash accountLoginSegueSplash = (AccountLoginSegueSplash) ((AlJ) b2c).A01;
                        FirstPartySsoSessionInfo firstPartySsoSessionInfo2 = accountLoginSegueSplash.A04;
                        BLp bLp3 = accountLoginSegueSplash.A0A.size() == 1 ? BLp.A0A : BLp.A08;
                        if (firstPartySsoSessionInfo2 != null) {
                            FbSharedPreferences A0R = 1BK.A0R(c00i);
                            1G2 r0 = A0X;
                            if (!A0R.AZn(r0, false)) {
                                String str2 = firstPartySsoSessionInfo2.A08;
                                if (!1JF.A0B(str2)) {
                                    String str3 = firstPartySsoSessionInfo2.A05;
                                    if (!1JF.A0B(str3)) {
                                        if (1JF.A0B(stringExtra)) {
                                            return;
                                        }
                                        if (!stringExtra.equals("entry_point_logout") && !stringExtra.equals("entry_point_logout_session_expired")) {
                                            if (stringExtra.equals("entry_point_switch_account")) {
                                                1Ql.A03(r0, c00i.get(), true);
                                                if (bLp3 != BLp.A0A) {
                                                    bLp = BLp.A08;
                                                }
                                            } else {
                                                if (bLp3 != BLp.A0A) {
                                                    if (bLp3 == BLp.A08) {
                                                        Bundle A05 = 1BK.A05();
                                                        A05.putString("user_id", ((AccountLoginSegueSplash) ((AlJ) b2c).A01).A04.A08);
                                                        A05.putString("universe_name", "m4a_sso_auto_login_segment_3");
                                                        A05.putString("param_name", "should_auto_login");
                                                        COx cOx = b2c.A04;
                                                        if (cOx != null) {
                                                            cOx.A03(A05, "msgr_device_sharing_check", 0);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (!EndToEnd.isRunningEndToEndTest()) {
                                                    A0D(b2c.A05, str3);
                                                    CQH.A04(b2c, BMG.A2m, AbF.A0V(b2c.A07), str2);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                ChQ chQ = b2c.A0J;
                                switch (chQ.A00) {
                                    case 0:
                                        alJ = (AlJ) chQ.A01;
                                        bLp2 = BLp.A07;
                                        alJ2 = alJ;
                                        alJ2.A1b(bLp2);
                                        return;
                                    case 1:
                                        ?? r02 = (B2k) chQ.A01;
                                        FirstPartySsoSessionInfo firstPartySsoSessionInfo3 = ((AccountLoginSegueSSOFacebook) ((AlJ) r02).A01).A02;
                                        String str4 = firstPartySsoSessionInfo3 != null ? firstPartySsoSessionInfo3.A06 : null;
                                        r306 = (6HM) r02.A06.get();
                                        c8s = new C8S(7zO.A0D((Fragment) r02));
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        c8s.A05 = StringFormatUtil.formatStrLocaleSafe(str4);
                                        c8s.A00(2131952239);
                                        COW.A01(c8s, r306);
                                        return;
                                    case 2:
                                        ?? r03 = (B2g) chQ.A01;
                                        r306 = r03.A02;
                                        r306.getClass();
                                        c8s = new C8S(7zO.A0D((Fragment) r03));
                                        c8s.A00(2131952239);
                                        COW.A01(c8s, r306);
                                        return;
                                    default:
                                        B2c b2c2 = (B2c) chQ.A01;
                                        A0B(b2c2);
                                        boolean z = b2c2.A0O.get();
                                        alJ = b2c2;
                                        if (z) {
                                            bLp2 = BLp.A02;
                                            alJ2 = b2c2;
                                            alJ2.A1b(bLp2);
                                            return;
                                        }
                                        bLp2 = BLp.A07;
                                        alJ2 = alJ;
                                        alJ2.A1b(bLp2);
                                        return;
                                }
                            }
                        }
                        b2c.A1b(bLp3);
                        return;
                    }
                    A0B(b2c);
                    if (!b2c.A0M.get() || !atomicBoolean.get() || !b2c.A0L.get()) {
                        return;
                    }
                    if (((AccountLoginSegueSplash) ((AlJ) b2c).A01).A0C.size() > 0) {
                        bLp = BLp.A0R;
                    } else if (((AccountLoginSegueSplash) ((AlJ) b2c).A01).A03 != null) {
                        bLp = BLp.A0G;
                    } else if (b2c.A0O.get()) {
                        bLp = BLp.A02;
                    } else {
                        Bjf bjf = ((BaM) C1Y6.A00(b2c.requireContext(), 1BJ.A00(44), "All", new Object[0])).A00;
                        int A00 = 1BK.A00();
                        1YC r04 = bjf.A00;
                        r04.A08("com.facebook.messaging.accountlogin.plugins.interfaces.accesstoken.AccessTokenRetrieverSpec", "messaging.accountlogin.accesstoken.AccessTokenRetrieverSpec", "canRetrieveFacebookSsoAccessToken", A00);
                        r04.A06("messaging.accountlogin.accesstoken.AccessTokenRetrieverSpec", "canRetrieveFacebookSsoAccessToken", A00);
                    }
                }
                b2c.A1b(bLp);
            }
            bLp = BLp.A07;
            b2c.A1b(bLp);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0A(B2c b2c) {
        int A05 = ((FIM) b2c.A0G.get()).A05(EPg.A0k);
        C00i c00i = b2c.A07;
        AbF.A0V(c00i).A0Q("splash_page_open", "gatekeeper", A05);
        AbF.A0V(c00i).A0Q("splash_page_open", "mobile_config", A05);
        CQH A0V = AbF.A0V(c00i);
        BMG bmg = BMG.A37;
        A0V.A0I(bmg, "fb_sso_");
        ListenableFuture A03 = ((67R) b2c.A0E.get()).A03(true, true);
        D4p A00 = D4p.A00(1BV.A00(99948), b2c, 2);
        C00i c00i2 = b2c.A0I;
        1Kd.A0D(c00i2, A00, A03);
        AbF.A0V(c00i).A0I(bmg, "one_click_oauth_");
        1Kd.A0D(c00i2, D4q.A00(b2c, 2), FHg.A00((FHg) b2c.A09.get()));
        AbF.A0V(c00i).A0I(bmg, "ig_sso_");
        1BV A0K = AbJ.A0K(b2c, 83979);
        1BK.A1E(b2c.A08).execute(new D8n(A0K, b2c, D4p.A00(A0K, b2c, 3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0B(B2c b2c) {
        Context context = b2c.getContext();
        if (context != null) {
            53T A00 = ((53S) b2c.A0T.get()).A00(context);
            CQH A0V = AbF.A0V(b2c.A07);
            boolean BNJ = A00.BNJ("android.permission.READ_CONTACTS");
            1UG A002 = CQH.A00(A0V);
            if (A002.isSampled()) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("read_contact_permission_when_SSO_ineligible", String.valueOf(BNJ));
                CQH.A05(A0V, A0u);
                A002.A6J("extra", A0u);
                AbI.A1L(A002, BMG.A25.name);
            }
        }
    }

    public static void A0C(B2c b2c, String str, String str2) {
        String A04 = ((1Oe) b2c.A0Q.get()).A04(C1fe.A2N);
        if (A04 == null) {
            A04 = "";
        }
        AccountRecoverySearchAccountMethodParams accountRecoverySearchAccountMethodParams = new AccountRecoverySearchAccountMethodParams("", str2, str, A04, "messenger", true);
        AbF.A0V(b2c.A07).A0I(BMG.A2d, "one_click_oauth_");
        1BK.A1E(b2c.A0I).execute(new D75(accountRecoverySearchAccountMethodParams, b2c));
    }

    public static void A0D(COx cOx, String str) {
        if (cOx != null) {
            Bundle A05 = 1BK.A05();
            A05.putString(cOx.A07, str);
            cOx.A03(A05, "action_auth_with_fb_single_sso_auto_login", 2131952189);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.B34, X.C00, X.B36] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.B34, X.C00, X.B36] */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        boolean z = false;
        if (((C0B5) this.A0P.get()).A01("com.facebook.katana", 0) != null) {
            z = true;
        }
        C00i c00i = this.A07;
        CQH A0V = AbF.A0V(c00i);
        BMG bmg = BMG.A0l;
        1UG A00 = CQH.A00(A0V);
        if (A00.isSampled()) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("fb4a_installed", String.valueOf(z));
            AbK.A1J(A00, bmg.name, A0u);
        }
        String A002 = 1BJ.A00(338);
        BPY bpy = this.A0U;
        Context requireContext = requireContext();
        DJy dJy = this.A0J;
        ?? b36 = new B36(requireContext, dJy);
        b36.A00 = dJy;
        COx cOx = new COx(this, ((AlJ) this).A00, (C00) b36, bpy, A002, "sso_login", "accessToken", false);
        COx.A02(cOx);
        this.A05 = cOx;
        ?? b362 = new B36(requireContext(), dJy);
        b362.A00 = dJy;
        COx cOx2 = new COx(this, ((AlJ) this).A00, (C00) b362, bpy, A002, "session_expired_auto_login", "accessToken", false);
        COx.A02(cOx2);
        this.A06 = cOx2;
        COx cOx3 = new COx(this, ((AlJ) this).A00, (C00) null, bpy, 1BJ.A00(41), "sso_like_oauth_search", "accountRecoverySearchAccountParamsKey", false);
        COx.A02(cOx3);
        this.A01 = cOx3;
        COx cOx4 = new COx(this, ((AlJ) this).A00, (C00) null, bpy, "fetch_ig_sso_user_info", "ig_sso_user_info_fetch", "ig_access_token_key", false);
        COx.A02(cOx4);
        this.A03 = cOx4;
        COx cOx5 = new COx(this, ((AlJ) this).A00, (C00) null, bpy, "fetch_ig_sso_user_info", "ig_sso_from_account_switcher_user_info_fetch", "ig_access_token_key", false);
        COx.A02(cOx5);
        this.A02 = cOx5;
        COx cOx6 = new COx(this, ((AlJ) this).A00, (C00) null, bpy, 1BJ.A00(201), "check_device_sharing", (String) null, false);
        COx.A02(cOx6);
        this.A04 = cOx6;
        AbF.A0V(c00i).A0I(BMG.A2p, "");
        this.A00 = 1BL.A0G(this);
    }
}
