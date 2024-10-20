package com.facebook.payments.p2p.messenger.core.prefs;

import X.0FI;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bi;
import X.1Hv;
import X.1Kd;
import X.1Mc;
import X.1PA;
import X.22U;
import X.2Pl;
import X.2zS;
import X.4DQ;
import X.4YU;
import X.6Gx;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.C00i;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DM1;
import X.DM2;
import X.DM4;
import X.DU9;
import X.DUD;
import X.DeO;
import X.EfI;
import X.EsF;
import X.EsG;
import X.GKP;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceScreen;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbPreferenceActivity;
import com.facebook.fbpay.platforms.messenger.config.FBPayMessengerConfig;
import com.facebook.litho.LithoView;
import com.facebookpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: PaymentsPreferenceActivity.class */
public class PaymentsPreferenceActivity extends FbPreferenceActivity {
    public LinearLayout A00;
    public LinearLayout A01;
    public ProgressBar A02;
    public 1PA A03;
    public 1Mc A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public LithoView A09;
    public 2zS A0A;
    public FBPayLoggerData A0C;
    public List A0D;
    public boolean A0E;
    public PreferenceScreen A0F;
    public FbUserSession A0G;
    public C00i A0H;
    public ListenableFuture A0I;
    public Executor A0J;
    public final 2Pl A0K = (2Pl) 1Bi.A03(17012);
    public final C00i A0N = 1BQ.A02(99120);
    public final C00i A0L = DKD.A0P();
    public final C00i A0O = 1BQ.A00();
    public final EsF A0M = new EsF(this);
    public EsG A0B = new EsG(new EfI(this));

    public static void A01(PaymentsPreferenceActivity paymentsPreferenceActivity) {
        if (4DQ.A03(paymentsPreferenceActivity.A0I)) {
            return;
        }
        paymentsPreferenceActivity.A00.setVisibility(8);
        paymentsPreferenceActivity.A01.setVisibility(8);
        paymentsPreferenceActivity.A02.setVisibility(0);
        paymentsPreferenceActivity.A09.setVisibility(8);
        long A08 = 1BL.A08(paymentsPreferenceActivity.A0H);
        DKE.A1K(DU9.A00(1BK.A06(paymentsPreferenceActivity.A08)), DUD.A05("p2p_settings_get_request", "p2p_settings"), A08);
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = paymentsPreferenceActivity.A0D.iterator();
        while (it.hasNext()) {
            A0h.m11011add((Object) ((GKP) it.next()).BYO());
        }
        22U A01 = 1Kd.A01(A0h.build());
        paymentsPreferenceActivity.A0I = A01;
        1Kd.A0F(new DeO(paymentsPreferenceActivity, A08), A01, paymentsPreferenceActivity.A0J);
    }

    public static void A02(PaymentsPreferenceActivity paymentsPreferenceActivity, boolean z) {
        for (GKP gkp : paymentsPreferenceActivity.A0D) {
            if (gkp.BV0() || !z) {
                paymentsPreferenceActivity.A0F.addPreference(gkp.B49());
            } else {
                paymentsPreferenceActivity.A0F.removePreference(gkp.B49());
            }
        }
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A09(Bundle bundle) {
        this.A0G = AbL.A08(this);
        this.A0A = (2zS) 1Bi.A03(67724);
        this.A08 = AbH.A0P();
        this.A0H = AbH.A0a();
        this.A0J = AbJ.A1D();
        this.A07 = DKD.A0V();
        this.A06 = DKD.A0U();
        this.A05 = 1BQ.A02(131252);
        this.A04 = (1Mc) 1Hv.A02(this, 65732);
        6Gx A0a = DKC.A0a(this.A0L);
        FbUserSession fbUserSession = this.A0G;
        DM2 dm2 = DM2.A01;
        A0a.A02(fbUserSession, DM4.A0P, DM1.A02, dm2);
        ((FBPayMessengerConfig) this.A0N.get()).A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01f0, code lost:
    
        if (r301.A0D.isEmpty() != false) goto L21;
     */
    @Override // com.facebook.base.activity.FbPreferenceActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.p2p.messenger.core.prefs.PaymentsPreferenceActivity.A0A(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            ((GKP) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.preference.PreferenceActivity, android.app.Activity
    public void onBackPressed() {
        DUD.A06(DU9.A00(1BK.A06(this.A08)), "p2p_cancel_settings", "p2p_settings");
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        if (findViewById(R.id.list) != null) {
            super.onContentChanged();
        }
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(318118530);
        super.onDestroy();
        ListenableFuture listenableFuture = this.A0I;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.A0I = null;
        }
        this.A03.A01();
        0FI.A07(-1823568005, A00);
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(654787389);
        super.onResume();
        this.A03.A00();
        this.A06.get();
        0FI.A07(529248120, A00);
    }
}
