package com.facebook.businessintegrity.gdpr.consents;

import X.06Z;
import X.0FI;
import X.0S2;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Du;
import X.1Gx;
import X.1Hv;
import X.1Lo;
import X.1RM;
import X.1Vd;
import X.1iF;
import X.2JX;
import X.4YU;
import X.7zL;
import X.7zO;
import X.7zU;
import X.8HM;
import X.AbF;
import X.AbK;
import X.AbL;
import X.AnonymousClass244;
import X.C00i;
import X.C06c;
import X.C2069Dau;
import X.C2cd;
import X.C30G;
import X.C3sa;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKN;
import X.DZA;
import X.EcI;
import X.EcJ;
import X.EcK;
import X.EnF;
import X.Esl;
import X.Evo;
import X.FAM;
import X.FJ8;
import X.Fco;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.util.JSONUtil;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: GDPRConsentsActivity.class */
public class GDPRConsentsActivity extends FbFragmentActivity {
    public static final ImmutableList A0K = ImmutableList.of((Object) "gdpr_consent_flow_next", (Object) "gdpr_consent_flow_close", (Object) "gdpr_consent_flow_checkup", (Object) "gdpr_checkup_next", (Object) "gdpr_checkup_close", (Object) "gdpr_checkup_back", (Object) "gdpr_checkup_accept", (Object) "gdpr_logout", (Object) "gdpr_consent_open_settings", (Object) "gdpr_consent_locale_change");
    public static final ImmutableList A0L = ImmutableList.of((Object) "cg_block", (Object) "messenger_block");
    public FAM A01;
    public 1Gx A02;
    public C00i A03;
    public C00i A04;
    public 8HM A05;
    public String A06;
    public FbUserSession A09;
    public EcI A0A;
    public C00i A0B;
    public C00i A0C;
    public final C00i A0I = 1BQ.A01();
    public final C00i A0J = 1BQ.A02(84955);
    public int A07 = 0;
    public boolean A0H = false;
    public boolean A0G = false;
    public C06c A08 = null;
    public long A00 = 0;
    public boolean A0E = false;
    public boolean A0F = false;
    public String A0D = null;

    public static C06c A12(GDPRConsentsActivity gDPRConsentsActivity, Integer num) {
        int i;
        int i2;
        C06c A0D = 7zU.A0D(gDPRConsentsActivity);
        EcI ecI = gDPRConsentsActivity.A0A;
        ecI.getClass();
        if (1Br.A07(ecI.A00).AZk(2342157163860139561L)) {
            int intValue = num.intValue();
            if (intValue == 0) {
                i = 2130772093;
                i2 = 2130772096;
            } else if (intValue == 1) {
                i = 2130772091;
                i2 = 2130772094;
            }
            A0D.A0D(i, i2, i, i2);
        }
        return A0D;
    }

    private void A15() {
        String str;
        if (this.A0F || ((str = this.A0D) != null && A0L.contains(str))) {
            if (this.A0H) {
                EcI ecI = this.A0A;
                ecI.getClass();
                if (1Br.A07(ecI.A00).AZk(2342157163860074024L)) {
                    return;
                }
            }
            EcK ecK = (EcK) 4YU.A0p(this.A0C);
            if (1Br.A07(((EcI) 1Bn.A0A(99670)).A00).AZk(36314154646904366L)) {
                return;
            }
            ecK.A00 = true;
        }
    }

    public static void A16(GDPRConsentsActivity gDPRConsentsActivity) {
        if (!gDPRConsentsActivity.A0E) {
            gDPRConsentsActivity.A15();
        }
        gDPRConsentsActivity.finish();
        int i = gDPRConsentsActivity.A07;
        if (i == 2 || i == 8) {
            gDPRConsentsActivity.overridePendingTransition(2130772091, 2130772094);
        }
    }

    public static void A1D(GDPRConsentsActivity gDPRConsentsActivity) {
        gDPRConsentsActivity.A0H = true;
        EcI ecI = gDPRConsentsActivity.A0A;
        ecI.getClass();
        if (1Br.A07(ecI.A00).AZk(36314154646314535L)) {
            ((Evo) 4YU.A0p(gDPRConsentsActivity.A03)).A01(gDPRConsentsActivity.A06, "error_closed");
            DKC.A1I(gDPRConsentsActivity.getBaseContext(), gDPRConsentsActivity.getString(2131957176), 1);
            gDPRConsentsActivity.finish();
            return;
        }
        C06c A0D = 7zU.A0D(gDPRConsentsActivity);
        DZA dza = new DZA();
        Bundle A05 = 1BK.A05();
        A05.putBoolean("loading_error", true);
        dza.setArguments(A05);
        dza.A03 = "gdpr_loading_error";
        A0D.A0M(dza, 2131364302);
        if (gDPRConsentsActivity.A0G) {
            A0D.A04();
        } else {
            gDPRConsentsActivity.A08 = A0D;
        }
    }

    public static void A1F(GDPRConsentsActivity gDPRConsentsActivity) {
        Fragment A00;
        FAM fam = gDPRConsentsActivity.A01;
        fam.getClass();
        if (fam.A00 == -1 || (A00 = FAM.A00(gDPRConsentsActivity)) == null) {
            return;
        }
        FAM fam2 = gDPRConsentsActivity.A01;
        fam2.getClass();
        int i = fam2.A00;
        if (i != -1) {
            fam2.A00 = i - 1;
        }
        FAM fam3 = gDPRConsentsActivity.A01;
        fam3.getClass();
        C06c A12 = A12(gDPRConsentsActivity, fam3.A00 != -1 ? 0S2.A00 : 0S2.A01);
        A12.A0H(A00);
        A12.A04();
        DZA A002 = FAM.A00(gDPRConsentsActivity);
        if (A002 != null) {
            A002.A1X();
        }
        C2cd.A02(DKD.A0C(gDPRConsentsActivity));
    }

    public static boolean A1G(GDPRConsentsActivity gDPRConsentsActivity, long j) {
        FAM fam = gDPRConsentsActivity.A01;
        fam.getClass();
        boolean z = false;
        if (fam.A04()) {
            gDPRConsentsActivity.getWindow().setFlags(16, 16);
            FAM fam2 = gDPRConsentsActivity.A01;
            fam2.getClass();
            2JX A01 = fam2.A01();
            if (A01 != null) {
                FAM fam3 = gDPRConsentsActivity.A01;
                fam3.getClass();
                String A02 = fam3.A02();
                Fragment dza = new DZA();
                Bundle A05 = 1BK.A05();
                FJ8.A08(A05, A01, "consent_nt_data");
                dza.setArguments(A05);
                ((DZA) dza).A03 = A02;
                ((DZA) dza).A00 = j;
                FAM fam4 = gDPRConsentsActivity.A01;
                fam4.getClass();
                Integer num = fam4.A01 == 0 ? 0S2.A0C : 0S2.A00;
                Integer num2 = 0S2.A0C;
                if (num == num2) {
                    ((DZA) dza).A04 = true;
                }
                FAM fam5 = gDPRConsentsActivity.A01;
                fam5.getClass();
                if (fam5.A01 != 0) {
                    num2 = 0S2.A00;
                }
                C06c A12 = A12(gDPRConsentsActivity, num2);
                Fragment A0b = gDPRConsentsActivity.BDe().A0b("gdpr_loading");
                if (A0b != null && A0b.isVisible()) {
                    A12.A0I(A0b);
                }
                A12.A0P(dza, ((DZA) dza).A03, 2131364302);
                A12.A0V(null);
                if (gDPRConsentsActivity.A0G) {
                    A12.A04();
                } else {
                    gDPRConsentsActivity.A08 = A12;
                }
                C2cd.A02(DKD.A0C(gDPRConsentsActivity));
                z = true;
            }
        }
        return z;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(186211502595907L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        if (this.A0E) {
            FAM fam = this.A01;
            fam.getClass();
            if (!fam.A04()) {
                A15();
            }
        }
        FAM fam2 = this.A01;
        fam2.getClass();
        fam2.A04 = null;
        ((EnF) fam2.A07.get()).A03.clear();
        1RM r0 = fam2.A02;
        if (r0 != null) {
            r0.dispose();
            fam2.A02 = null;
        }
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A09 = AbL.A08(this);
        setContentView(2132542086);
        ((Evo) 4YU.A0p(this.A03)).A01(this.A06, "loading_data");
        06Z BDe = BDe();
        if (BDe.A0U() > 0) {
            06Z.A0T(BDe, (String) null, -1, 1);
        }
        Fragment dza = new DZA();
        dza.setArguments(1BK.A05());
        ((DZA) dza).A03 = "gdpr_loading";
        C06c A0G = 7zL.A0G(BDe);
        A0G.A0P(dza, ((DZA) dza).A03, 2131364302);
        A0G.A04();
        FAM fam = this.A01;
        fam.getClass();
        String str = this.A06;
        EcJ ecJ = new EcJ(this);
        C30G A0H = AbF.A0H(7);
        if (str != null) {
            A0H.A03("extra_data", str);
        }
        C3sa A0L2 = AbK.A0L(A0H);
        A0L2.A0B = false;
        fam.A02 = new C2069Dau(ecJ, fam, 0);
        1Vd A00 = ((DKN) 1Bn.A0E((Context) null, fam.A03, 68643)).A00();
        4YU.A1J(A0L2, 186211502595907L);
        DKF.A0h(fam.A08).A04(fam.A02, A00.A04(A0L2), "gdpr_consent_flow_fetch");
        this.A02 = new Fco(this, 0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A00 = System.nanoTime();
        FbUserSession A08 = AbL.A08(this);
        this.A01 = (FAM) 1Bn.A0E(this, (1BY) null, 99665);
        this.A0A = (EcI) 1Bn.A0A(99670);
        this.A04 = 1BQ.A02(33179);
        this.A03 = 1BV.A00(99666);
        this.A05 = (8HM) 1Hv.A02(this, 66714);
        this.A0B = 1Lo.A00(this, A08, 99668);
        this.A0C = 1Lo.A00(this, A08, 99672);
        Bundle A0H = 7zO.A0H(this);
        if (A0H != null) {
            String string = A0H.getString("extra_data", null);
            if (string != null) {
                try {
                    this.A06 = URLDecoder.decode(string, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    this.A06 = null;
                }
            } else {
                this.A06 = null;
            }
            EcI ecI = this.A0A;
            ecI.getClass();
            boolean AZk = 1Br.A07(ecI.A00).AZk(36314154646773292L);
            this.A0F = AZk;
            if (!AZk && this.A06 != null) {
                try {
                    this.A0D = JSONUtil.A0H(((AnonymousClass244) 1Bn.A0A(68334)).A0I(this.A06).A0D("entry_product"), "");
                } catch (IOException unused2) {
                }
            }
            try {
                this.A07 = Integer.parseInt(A0H.getString(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, ConstantsKt.CAMERA_ID_FRONT));
            } catch (NumberFormatException unused3) {
            }
            if (this.A07 == 2) {
                this.A0A.getClass();
                overridePendingTransition(2130772091, 2130772094);
            }
            EcI ecI2 = this.A0A;
            ecI2.getClass();
            this.A0E = 1Br.A07(ecI2.A00).AZk(36314154646707755L);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.A0H) {
            A1F(this);
            return;
        }
        FAM fam = this.A01;
        fam.getClass();
        1RM r0 = fam.A02;
        if (r0 != null) {
            r0.dispose();
            fam.A02 = null;
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-1213567924);
        this.A0G = false;
        FAM fam = this.A01;
        fam.getClass();
        if (fam.A04()) {
            ((Esl) 4YU.A0p(this.A0B)).A00(false, 0S2.A01);
        }
        super.onPause();
        if (this.A02 != null) {
            1Du it = A0K.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                8HM r0 = this.A05;
                r0.getClass();
                r0.A01(next, this.A02);
            }
        }
        0FI.A07(-1282384453, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        C06c c06c = this.A08;
        if (c06c != null) {
            c06c.A04();
            this.A08 = null;
        }
        this.A0G = true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1044764888);
        super.onResume();
        ((Esl) 4YU.A0p(this.A0B)).A00(true, 0S2.A01);
        if (((EcK) 4YU.A0p(this.A0C)).A00) {
            A16(this);
        }
        if (this.A02 != null) {
            1Du it = A0K.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                8HM r0 = this.A05;
                r0.getClass();
                r0.A00(next, this.A02);
            }
        }
        0FI.A07(796156658, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.A0G = false;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.A0A.getClass();
            DKD.A0C(this).setSystemUiVisibility(5894);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startActivity(android.content.Intent r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.startActivity(r1)
            r0 = 0
            r303 = r0
            java.lang.String r0 = "enter_animation_override_id"
            r304 = r0
            java.lang.Integer r0 = X.0S2.A00     // Catch: java.lang.NullPointerException -> L3e
            r305 = r0
            r0 = r301
            r1 = r305
            int r0 = X.1lZ.A00(r0, r1)     // Catch: java.lang.NullPointerException -> L3e
            r306 = r0
            r0 = r302
            r1 = r304
            r2 = r306
            int r0 = r0.getIntExtra(r1, r2)     // Catch: java.lang.NullPointerException -> L3e
            r307 = r0
            java.lang.String r0 = "exit_animation_override_id"
            r304 = r0
            java.lang.Integer r0 = X.0S2.A01     // Catch: java.lang.NullPointerException -> L6d
            r305 = r0
            r0 = r301
            r1 = r305
            int r0 = X.1lZ.A00(r0, r1)     // Catch: java.lang.NullPointerException -> L6d
            r306 = r0
            r0 = r302
            r1 = r304
            r2 = r306
            int r0 = r0.getIntExtra(r1, r2)     // Catch: java.lang.NullPointerException -> L6d
            r308 = r0
            goto L45
        L3e:
            r0 = 0
            r307 = r0
        L42:
            r0 = 0
            r308 = r0
        L45:
            r0 = r302
            int r0 = r0.getFlags()
            r309 = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            r306 = r0
            r0 = r309
            r1 = r306
            r0 = r0 & r1
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L67
            r0 = 0
            r308 = r0
        L5f:
            r0 = r301
            r1 = r303
            r2 = r308
            r0.overridePendingTransition(r1, r2)
            return
        L67:
            r0 = r307
            r303 = r0
            goto L5f
        L6d:
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.businessintegrity.gdpr.consents.GDPRConsentsActivity.startActivity(android.content.Intent):void");
    }
}
