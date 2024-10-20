package com.facebook.messaging.neue.nux;

import X.08D;
import X.08J;
import X.09K;
import X.09X;
import X.0BR;
import X.0FI;
import X.0ND;
import X.0OU;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1Ey;
import X.1FP;
import X.1G0;
import X.1G2;
import X.1G3;
import X.1Hv;
import X.1Ql;
import X.1YC;
import X.1iF;
import X.1tC;
import X.2Dp;
import X.2Ff;
import X.2W0;
import X.3Ds;
import X.4YU;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.AnonymousClass001;
import X.BUp;
import X.Bm8;
import X.C00i;
import X.C1Y6;
import X.C1f0;
import X.C1ud;
import X.C2fe;
import X.C2t1;
import X.DKC;
import X.DZD;
import X.EcU;
import X.EnZ;
import X.Ers;
import X.Eru;
import X.EvM;
import X.F5Q;
import X.FAJ;
import X.FFh;
import X.FJE;
import X.FYp;
import X.Fas;
import X.G0G;
import X.GHv;
import X.InterfaceC03733yw;
import X.InterfaceC03743yx;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.analytics.navigation.NavigationLogs;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.user.model.User;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: NeueNuxActivity.class */
public class NeueNuxActivity extends FbFragmentActivity implements CallerContextable, InterfaceC03733yw, InterfaceC03743yx {
    public static boolean A0K;
    public static final CallerContext A0L = CallerContext.A0A(NeueNuxActivity.class, "nux", "nux_user_tile");
    public static final 1G2 A0M;
    public static final 1G2 A0N;
    public static final Set A0O;
    public static final Set A0P;
    public static final 1G2 A0Q;
    public 1Ey A00;
    public FbUserSession A01;
    public 1FP A02;
    public 2Ff A03;
    public C00i A04;
    public C00i A05;
    public C1f0 A06;
    public FAJ A07;
    public NeueNuxNavigableFragmentController A08;
    public FJE A09;
    public Eru A0A;
    public C2fe A0B;
    public Set A0C;
    public boolean A0D;
    public C00i A0E;
    public C2t1 A0F;
    public C1ud A0G;
    public Ers A0H;
    public FFh A0I;
    public 1CO A0J;

    static {
        1G2 r0 = 1G0.A04;
        A0Q = 1G3.A01(r0, "reached_neue_activity/");
        A0N = 1G3.A01(r0, "oauth_auto_logged_in/");
        A0M = 1G3.A01(r0, "is_multi_sso_auto_login/");
        A0P = ImmutableSet.A06("logged_in_password_reset", "low_disk_space_warning_flow", "account_switch_flow", "switch_to_new_partial_acc_flow", "contact_import_flow", "deactivations_flow", "ndx_flow", "ndx_flow_internal", "full_nux_flow", "partial_account_flow", "phone_number_flow", "profile_photo_flow", "workchat_nux_flow", "post_phone_reconfirmation_nux_flow", "contact_import_setting_flow", "contact_import_connections_tab_flow", "contact_import_qp_flow", "encrypted_backups_nux_flow", "sessionless_flow", "caa_login_save_credentials_flow", "notifications_permission_nux_flow", "professional_mode_business_tools_nux_flow");
        A0O = ImmutableSet.A03("biim_catalog_flow", "business_rtc_flow", "notifications_permission_nux_flow");
    }

    private void A12(Intent intent, String str, boolean z, boolean z2) {
        User user = (User) 1Bn.A0A(83430);
        String str2 = user.A0X.displayName;
        if (str2 != null) {
            BUp.A00(new Bm8(intent, this), str2, user.A13, (String) null, z, z2).A0m(BDe(), str);
        }
    }

    public static /* synthetic */ void A15(View view, 08D r302) {
        int i = 7;
        08J r0 = r302.A00;
        int i2 = r0.A0C(7).A03;
        int i3 = r0.A0C(7).A01;
        int i4 = r0.A0C(7).A02;
        if (view.getRootWindowInsets() != null && view.getRootWindowInsets().isVisible(8)) {
            i = 8;
        }
        int i5 = r0.A0C(i).A00;
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        A0I.topMargin = i2;
        A0I.bottomMargin = i5;
        A0I.leftMargin = i3;
        A0I.rightMargin = i4;
        view.setLayoutParams(A0I);
    }

    private void A16(String str) {
        0fH.A0S(NeueNuxActivity.class, "set flow: %1$s", new Object[]{str});
        if (str != null) {
            if (!(AnonymousClass001.A1V(1Bn.A0A(33058)) ? A0O : A0P).contains(str)) {
                throw 0Pz.A05("Tried to set invalid flow: ", str);
            }
            this.A09.A0F(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r301.A0G.A08() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A1D(com.facebook.messaging.neue.nux.NeueNuxActivity r301) {
        /*
            r0 = r301
            X.1ud r0 = r0.A0G
            r302 = r0
            r0 = r302
            X.1CO r0 = X.C1ud.A00(r0)
            r303 = r0
            r0 = 36316426685523930(0x810599001a27da, double:3.029992698213442E-306)
            r304 = r0
            r0 = r302
            X.1GD r0 = r0.A02
            r302 = r0
            r0 = r303
            r1 = r302
            r2 = r304
            boolean r0 = r0.AZr(r1, r2)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L35
            r0 = r301
            X.1ud r0 = r0.A0G
            r302 = r0
            r0 = r302
            boolean r0 = r0.A08()
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L3a
        L35:
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
        L3a:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.neue.nux.NeueNuxActivity.A1D(com.facebook.messaging.neue.nux.NeueNuxActivity):boolean");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DZD) {
            ((DZD) fragment).A01 = new Fas(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbK.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        String stringExtra = intent.getStringExtra("flow_param");
        if (!AnonymousClass001.A1V(1Bn.A0A(33058)) || A0O.contains(stringExtra)) {
            Preconditions.checkArgument(stringExtra.equals(this.A09.A02), "NeueNuxActivity was started with a flow parameter that doesn't match the existing one.");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = AbL.A08(this);
        this.A05 = AbH.A0S();
        this.A0E = 1BQ.A01();
        this.A04 = AbH.A0a();
        this.A07 = (FAJ) 1Bn.A0E(this, (1BY) null, 100122);
        this.A0I = (FFh) 1Bi.A03(100123);
        this.A09 = (FJE) 1Hv.A02(this, 83178);
        this.A0F = (C2t1) 1Bi.A03(98768);
        this.A00 = (1Ey) 1Bn.A0A(83434);
        this.A0B = (C2fe) 1Bi.A03(17068);
        this.A03 = (2Ff) 1Bi.A03(65609);
        this.A02 = (1FP) 1Bi.A03(67765);
        this.A0C = 1Bn.A0I(16412);
        this.A0H = (Ers) 1Bn.A0A(98419);
        this.A0J = AbJ.A0e();
        this.A0G = (C1ud) 1Bi.A03(65997);
        this.A06 = (C1f0) 1Bn.A0A(16749);
        this.A0A = new Eru((EcU) C1Y6.A00(this, "com_facebook_messaging_neue_nux_plugins_interfaces_interactions_NeueNuxOnBackSpec", "All", new Object[0]));
        AbK.A1D(this, this.A01);
        MigColorScheme A0o = AbF.A0o(this, 16979);
        1Bn.A0A(16838);
        1tC.A00(getWindow(), A0o.BDl());
        if (bundle != null) {
            this.A0D = bundle.getBoolean("isInitialized", false);
            String string = bundle.getString("flow_param");
            if (string == null) {
                0fH.A0B(NeueNuxActivity.class, "do not have flow param in savedInstanceState");
                string = getIntent().getStringExtra("flow_param");
                0fH.A0S(NeueNuxActivity.class, "try to get flow params from intent %s", new Object[]{string});
            }
            A16(string);
            this.A09.A01 = (Class) bundle.getSerializable("currentMilestoneClass");
            this.A09.A04 = bundle.getString("source_param");
            this.A09.A03 = bundle.getString("qp_id_param");
        } else {
            String stringExtra = getIntent().getStringExtra("flow_param");
            if (stringExtra == null) {
                0fH.A0B(NeueNuxActivity.class, "do not have flow param in intent");
            }
            if (!09K.A01(this.A0C)) {
                this.A02.D3D(3Ds.A02, 0S2.A01, new G0G(this), "notifyNuxStarted");
            }
            A16(stringExtra);
            this.A09.A04 = getIntent().getStringExtra("source_param");
            this.A09.A03 = getIntent().getStringExtra("qp_id_param");
            FFh fFh = this.A0I;
            UserFlowLogger userFlowLogger = fFh.A01;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(823206774);
            fFh.A00 = generateNewFlowId;
            String A0W = 0Pz.A0W("flow_", stringExtra);
            long longValue = FFh.A02.longValue();
            UserFlowConfig userFlowConfig = new UserFlowConfig(A0W, false);
            userFlowConfig.mTtlMs = longValue;
            userFlowLogger.flowStartIfNotOngoing(generateNewFlowId, userFlowConfig);
            userFlowLogger.flowAnnotate(fFh.A00, "annotation_tag", 0Pz.A0W("flow_", stringExtra));
        }
        setContentView(2132542936);
        MigColorScheme.A00(A2c(2131365349), A0o);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                0OU.A00(window, false);
                0ND.A00(A2c(2131365349), new FYp(1));
            } else {
                window.setSoftInputMode(16);
            }
        }
        this.A08 = (NeueNuxNavigableFragmentController) BDe().A0Y(2131365349);
        ViewerContext Aue = this.A00.Aue();
        if (Aue != ViewerContext.A01) {
            String str = Aue.mUserId;
            int dimensionPixelSize = getResources().getDimensionPixelSize(2132279344);
            this.A03.A0D(2Dp.A00(this.A0B.A05(str, dimensionPixelSize, dimensionPixelSize)), A0L);
        }
        if ("auth_messenger_page_to_admin_account_switch".equals(1BK.A0R(this.A05).BD0(this.A06.A00()))) {
            ((EvM) 1Bn.A0E(this, (1BY) null, 100160)).A00((GHv) null);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FAJ faj;
        String str;
        if (this.A08.A1X()) {
            faj = this.A07;
            str = "soft_back_press";
        } else {
            if (this.A09.A0H()) {
                F5Q f5q = this.A0A.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r0 = f5q.A01;
                r0.A08("com.facebook.messaging.neue.nux.plugins.interfaces.interactions.NeueNuxOnBackSpec", "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "onBackPressed", andIncrement);
                boolean z = false;
                Exception e = null;
                try {
                    if (F5Q.A00(f5q)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.neue.nux.plugins.interactions.mobile.impl.GoToLauncherImpl", "messaging.neue.nux.interactions.mobile.impl.GoToLauncherImpl", "com.facebook.messaging.neue.nux.plugins.interfaces.interactions.NeueNuxOnBackSpec", andIncrement2, "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "com.facebook.messaging.neue.nux.plugins.interactions.mobile.NeueNuxInteractionsMobileKillSwitch", "onBackPressed");
                        try {
                            try {
                                Intent A0A = 4YU.A0A("android.intent.action.MAIN");
                                A0A.addCategory("android.intent.category.HOME");
                                A0A.setFlags(268435456);
                                try {
                                    z = 09X.A00().A0B().A0A(this, A0A);
                                } catch (AndroidRuntimeException unused) {
                                    z = false;
                                }
                                r0.A09("messaging.neue.nux.interactions.mobile.impl.GoToLauncherImpl", "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "onBackPressed", andIncrement2);
                            } catch (Exception e2) {
                                e = e2;
                                throw e;
                            }
                        } catch (Throwable th) {
                            r0.A04(e, "messaging.neue.nux.interactions.mobile.impl.GoToLauncherImpl", "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "onBackPressed", andIncrement2);
                            throw th;
                        }
                    }
                    r0.A02((Exception) null, "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "onBackPressed", andIncrement);
                    if (z) {
                        this.A0D = false;
                        FAJ.A00(this.A07, "blocking_back_press_exit", (Map) null);
                        return;
                    } else {
                        if (this.A0A.A00()) {
                            this.A0D = false;
                            FAJ.A00(this.A07, "blocking_back_press_exit", (Map) null);
                            finishAffinity();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    r0.A02(e, "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "onBackPressed", andIncrement);
                    throw th2;
                }
            }
            super.onBackPressed();
            faj = this.A07;
            str = "non_blocking_back_press_exit";
        }
        FAJ.A00(faj, str, (Map) null);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1175995394);
        super.onResume();
        if (!AnonymousClass001.A1V(1Bn.A0A(16862))) {
            FJE fje = this.A09;
            if (fje.A0H() && !fje.A0G()) {
                1BK.A09(this.A0E).D0u(0BR.A00("NeueNuxActivity resumed with NUX already completed t6665272", ""));
                finish();
            }
        }
        0FI.A07(-1334964137, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isInitialized", this.A0D);
        bundle.putSerializable("currentMilestoneClass", this.A09.A01);
        bundle.putString("flow_param", this.A09.A02);
        bundle.putString("source_param", this.A09.A04);
        bundle.putString("qp_id_param", this.A09.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-65116448);
        super.onStart();
        A0K = true;
        if (!this.A0D) {
            ImmutableMap.Builder A0c = 1BK.A0c();
            A0c.put("nux_variation_test_version", Integer.toString(2));
            Intent A0E = this.A09.A0E(new EnZ((Bundle) null, (Fragment) null, new NavigationLogs(A0c), (String) null));
            if (!A1D(this)) {
                DZD.A06(A0E, this.A08, (NavigableFragment) null);
            }
            this.A0D = true;
            1Ql.A01(1BL.A0V(this.A05), A0Q, true);
            if (!A0E.getAction().equals("com.facebook.messenger.neue.nux.NeueNuxActivity.NUX_COMPLETE")) {
                FbSharedPreferences A0R = 1BK.A0R(this.A05);
                1G2 r0 = 2W0.A0M;
                boolean AZn = A0R.AZn(r0, false);
                FbSharedPreferences A0R2 = 1BK.A0R(this.A05);
                if (AZn) {
                    1Ql.A01(A0R2.edit(), r0, false);
                    A12(A0E, "SSO_auto_login_bottom_sheet", false, 1BK.A0R(this.A05).AZn(A0M, false));
                } else {
                    1G2 r02 = A0N;
                    if (A0R2.AZn(r02, false)) {
                        1Ql.A03(r02, this.A05.get(), false);
                        A12(A0E, 1BJ.A00(1858), true, false);
                    }
                }
            }
            if (A1D(this)) {
                DZD.A06(A0E, this.A08, (NavigableFragment) null);
            }
        }
        0FI.A07(1555748126, A00);
    }
}
