package com.facebook.messaging.accountlogin.fragment.segue;

import X.04R;
import X.06Z;
import X.0NA;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Hv;
import X.1JF;
import X.1Lm;
import X.3H0;
import X.4YV;
import X.7zL;
import X.7zM;
import X.AbE;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.BLp;
import X.C00i;
import X.C06c;
import X.C0ty;
import X.C1uc;
import X.DEf;
import X.DKD;
import X.EOj;
import X.EOk;
import X.EOn;
import X.EOt;
import X.EP2;
import X.EU9;
import X.EYv;
import X.EZ0;
import X.EaX;
import X.Emx;
import X.En3;
import X.EpY;
import X.Etd;
import X.Eu4;
import X.Eyf;
import X.Ez4;
import X.F3D;
import X.FE3;
import X.FFA;
import X.FGr;
import X.FHs;
import X.FZt;
import X.G05;
import X.G1g;
import X.G7X;
import X.GDm;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.dsp.core.ColorData;
import com.facebook.foa.session.FbMetaSessionImpl;
import com.facebook.messaging.accountlogin.AccountLoginActivity;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import com.meta.foa.cds.bottomsheet.MsgNativeCdsBottomSheetFragment;
import java.util.HashMap;

/* loaded from: AccountLoginSegueBloksLogin.class */
public final class AccountLoginSegueBloksLogin extends AccountLoginSegueBase {
    public int A00;
    public FHs A01;
    public final C00i A02;

    public AccountLoginSegueBloksLogin() {
        super(BLp.A03, true);
        this.A00 = 1;
        this.A02 = 1BQ.A02(16386);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(FbUserSession fbUserSession, AccountLoginSegueBloksLogin accountLoginSegueBloksLogin, DEf dEf) {
        AccountLoginActivity accountLoginActivity = (AccountLoginActivity) dEf;
        accountLoginSegueBloksLogin.A01 = (FHs) 1Bn.A0E(accountLoginActivity, (1BY) null, 99768);
        EU9.A00(accountLoginActivity);
        FbSharedPreferences A0W = 1BL.A0W();
        HashMap A00 = F3D.A00(accountLoginActivity, A0W, accountLoginActivity.A0C);
        if (1BK.A0N(accountLoginSegueBloksLogin.A02).AZk(18310991771095736L)) {
            EpY epY = (EpY) 1Hv.A02(accountLoginActivity, 99769);
            11T.A0F(fbUserSession, 0);
            C00i c00i = epY.A04.A00;
            1BK.A0V(c00i).markerAnnotate(896612552, TraceFieldType.FallbackReason, "open_login_form is on");
            1BK.A0V(c00i).markerPoint(896612552, "launching_native_login_form_start");
            Context context = epY.A01;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                1BK.A0V(c00i).markerAnnotate(896612552, "activity_status", activity.isFinishing() ? "finishing" : activity.isDestroyed() ? "destroyed" : !activity.hasWindowFocus() ? "backgrounded" : "normal");
            }
            FbMetaSessionImpl fbMetaSessionImpl = new FbMetaSessionImpl(fbUserSession);
            EP2 ep2 = EP2.A05;
            Integer num = 0S2.A0C;
            EOn eOn = FZt.A0Q;
            EOt eOt = FZt.A0M;
            EOk eOk = FZt.A0P;
            EOj eOj = EOj.A03;
            CdsBottomSheetDimmingBehaviour.Default r0 = CdsBottomSheetDimmingBehaviour.Default.A00;
            1BK.A1K(eOn, 3, eOt);
            11T.A0F(eOk, 5);
            11T.A0F(r0, 13);
            if (EYv.A00()) {
                eOj = EOj.A04;
            }
            FZt fZt = new FZt((ColorData) null, (ColorData) null, r0, (CdsBottomSheetTopSpan) null, eOt, (CdsOpenScreenConfig$BottomSheetMargins) null, eOj, eOk, eOn, ep2, (CdsOpenScreenDismissCallback) null, num, (Integer) null, (Integer) null, (Integer) null, (String) null, -1, false, false, false, false, false);
            Eyf eyf = EaX.A00;
            Emx emx = new Emx(new G05(epY), C0ty.A00, 04R.A0G());
            11T.A0F(eyf, 3);
            Etd etd = (Etd) 1Lm.A06(fbMetaSessionImpl.A00, 99765);
            11T.A0A(etd);
            GDm A002 = etd.A00(context, eyf, emx);
            11T.A0F(A002, 5);
            Activity A04 = 0NA.A04(context);
            if (!(A04 instanceof FragmentActivity)) {
                throw AnonymousClass001.A0N("Unable to launch CDS bottom sheet fragment without FragmentActivity!");
            }
            Integer num2 = fZt.A0F;
            Ez4 ez4 = new Ez4(fbMetaSessionImpl, A002, eyf, emx, num2 != null ? num2.intValue() : 32);
            MsgNativeCdsBottomSheetFragment A003 = EZ0.A00(fZt, ez4);
            06Z BDe = ((FragmentActivity) A04).BDe();
            11T.A0A(BDe);
            if (fZt.A0D == ep2) {
                FE3.A00(context, fZt, ez4);
                return;
            }
            if (A04.isFinishing() || A04.isDestroyed()) {
                0fH.A0n("MsgCdsBottomSheetNavigator", "Activity is finishing or destroyed, not launching CDS bottom sheet fragment");
                return;
            }
            C06c A0G = 7zL.A0G(BDe);
            A0G.A0V(null);
            A003.A0d(A0G, (String) null);
            return;
        }
        if (dEf instanceof Activity) {
            String BD0 = A0W.BD0(C1uc.A01);
            String BD02 = A0W.BD0(C1uc.A00);
            Activity activity2 = (Activity) dEf;
            String A0t = 1BK.A0t();
            A00.put("qpl_join_id", A0t);
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 1Bi.A03(16520);
            quickPerformanceLogger.markerStartForE2E(896612552, 0, A0t);
            Intent intent = activity2.getIntent();
            String A004 = AbE.A00(420);
            quickPerformanceLogger.markerAnnotate(896612552, "is_from_account_switcher", intent.getBooleanExtra(A004, false));
            Intent intent2 = activity2.getIntent();
            String A005 = AbstractC00603o4.A00(61);
            if (intent2.getBooleanExtra(A005, false)) {
                activity2.getIntent().removeExtra(A005);
                A00.put("deeplink_auto_login_credential_type", "facebook_active_session");
            }
            Eu4 A006 = 3H0.A00(accountLoginActivity);
            if (A006.A01 && A006.A02) {
                FGr.A01(accountLoginActivity, "com.bloks.www.caa.login.oxygen_preloads_terms_of_service", "CAA_OXYGEN_PRELOADS_TERMS_OF_SERVICE_SCREEN", A00);
                return;
            }
            if (!1JF.A0B(BD0) && BD02 != null && 1BK.A0K().AZk(18306713983664078L)) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("reg_info", BD0);
                A0u.put("reg_extra_data", BD02);
                A0u.put("is_from_native", AnonymousClass001.A0K());
                HashMap A0u2 = AnonymousClass001.A0u();
                A0u2.put("flow_name", "new_to_family_fb_default");
                A0u2.put("flow_type", "ntf");
                A0u.put("flow_info", DKD.A0y(A0u2));
                FGr.A01(accountLoginActivity, "com.bloks.www.bloks.caa.reg.confirmation", "", A0u);
                return;
            }
            FFA ffa = (FFA) 1Hv.A02(accountLoginActivity, 99766);
            boolean booleanExtra = activity2.getIntent().getBooleanExtra(A004, false);
            Context context2 = ffa.A01;
            if (context2 instanceof FragmentActivity) {
                Activity activity3 = (Activity) context2;
                View A0F = 7zM.A0F(activity3);
                11T.A0A(A0F);
                if (A0F instanceof FrameLayout) {
                    if (!ffa.A00) {
                        FFA.A00(ffa);
                    }
                    if (booleanExtra) {
                        activity3.overridePendingTransition(0, 0);
                    }
                    En3 en3 = ffa.A02;
                    FrameLayout frameLayout = (FrameLayout) A0F;
                    11T.A0F(frameLayout, 0);
                    en3.A02.post(new G1g(frameLayout, en3));
                }
            }
            accountLoginSegueBloksLogin.A00 = 2;
            if (accountLoginSegueBloksLogin.A01 == null) {
                accountLoginSegueBloksLogin.A01 = (FHs) 1Bn.A0E(accountLoginActivity, (1BY) null, 99768);
            }
            if (dEf instanceof FragmentActivity) {
                QuickPerformanceLogger quickPerformanceLogger2 = (QuickPerformanceLogger) 1Bi.A03(16520);
                quickPerformanceLogger2.markerPoint(896612552, "startClientDataFetch");
                quickPerformanceLogger2.markerPoint(896612552, "client_data_fetch_start");
                accountLoginSegueBloksLogin.A01.A03(accountLoginActivity, (String) null, new G7X(accountLoginActivity, fbUserSession, accountLoginSegueBloksLogin, dEf, quickPerformanceLogger2, A00));
            }
        }
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public int A02() {
        return this.A00;
    }

    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public AccountLoginSegueBase A03(BLp bLp) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase
    public boolean A05(DEf dEf) {
        A00(4YV.A0C((Context) dEf), this, dEf);
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
