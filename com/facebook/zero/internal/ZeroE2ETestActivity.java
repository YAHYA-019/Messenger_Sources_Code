package com.facebook.zero.internal;

import X.0FI;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1RX;
import X.1iF;
import X.7zL;
import X.AbF;
import X.AbH;
import X.AbL;
import X.AbM;
import X.AnonymousClass423;
import X.C00i;
import X.C07334jk;
import X.C15h;
import X.C2C5;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKF;
import X.DKG;
import X.FJ7;
import X.FWn;
import X.FXq;
import X.FXs;
import X.G1C;
import X.G6J;
import X.G7K;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.inject.FbInjector;

/* loaded from: ZeroE2ETestActivity.class */
public class ZeroE2ETestActivity extends FbFragmentActivity {
    public Handler A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public FbUserSession A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public C00i A0F;
    public TextView A0H;
    public C00i A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public C00i A0M;
    public C15h A0N;
    public C15h A0O;
    public C15h A0P;
    public final C00i A0Q = 1BQ.A02(49213);
    public final C00i A0R = 1BQ.A02(49219);
    public final C00i A0S = DKD.A0O();
    public final C00i A0T = 1BQ.A02(68445);
    public boolean A0G = false;

    public static void A12(ZeroE2ETestActivity zeroE2ETestActivity) {
        0fH.A0m("ZeroE2ETestActivity", "Refreshing data background");
        boolean A1a = 1BL.A1a(zeroE2ETestActivity.A0P);
        boolean A1a2 = 1BL.A1a(zeroE2ETestActivity.A0O);
        String str = ((String) zeroE2ETestActivity.A0N.get()).equals("dialtone") ? "FREE" : "PAID";
        String A0t = DKE.A0t(zeroE2ETestActivity.A0M);
        String A0s = DKE.A0s(zeroE2ETestActivity.A0L);
        boolean A1T = 1BK.A1T(1BK.A0R(zeroE2ETestActivity.A0I), DKC.A0b(DKG.A0w().A0H));
        String str2 = ((C2C5) zeroE2ETestActivity.A0K.get()).A00() != null ? "present" : "null";
        zeroE2ETestActivity.A0C.get();
        if (!((1RX) zeroE2ETestActivity.A0F.get()).A08.Cke(1)) {
            0fH.A0k("ZeroE2ETestActivity", "Unable to schedule analytics updates!");
        }
        zeroE2ETestActivity.runOnUiThread(new G6J(zeroE2ETestActivity, str, A0t, A0s, str2, A1a, A1a2, A1T));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        if (r309 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A15(com.facebook.zero.internal.ZeroE2ETestActivity r301, java.lang.String r302) {
        /*
            r0 = r301
            r1 = 2131366961(0x7f0a1431, float:1.835383E38)
            android.widget.TextView r0 = X.DKF.A0D(r0, r1)
            r303 = r0
            r0 = r301
            r1 = 2131366962(0x7f0a1432, float:1.8353832E38)
            android.widget.TextView r0 = X.DKF.A0D(r0, r1)
            r304 = r0
            r0 = r301
            X.00i r0 = r0.A0J
            java.lang.Object r0 = r0.get()
            X.GOb r0 = (X.GOb) r0
            r305 = r0
            r0 = r305
            r1 = r302
            X.F5x r0 = r0.Cig(r1)
            r306 = r0
            r0 = r306
            boolean r0 = r0.A03
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3c
            r0 = r306
            java.lang.String r0 = r0.A02
            r308 = r0
            goto L43
        L3c:
            r0 = r306
            java.lang.String r0 = r0.A00
            r308 = r0
        L43:
            r0 = r301
            X.00i r0 = r0.A0T     // Catch: java.lang.RuntimeException -> L75
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()     // Catch: java.lang.RuntimeException -> L75
            r306 = r0
            r0 = r306
            X.F7c r0 = (X.F7c) r0     // Catch: java.lang.RuntimeException -> L75
            r306 = r0
            r0 = r308
            android.net.Uri r0 = X.C0A2.A03(r0)     // Catch: java.lang.RuntimeException -> L75
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.A01(r1)     // Catch: java.lang.RuntimeException -> L75
            r309 = r0
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r307 = r0
            r0 = r309
            if (r0 != 0) goto L80
            goto L7c
        L75:
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
        L7c:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r307 = r0
        L80:
            r0 = r303
            r1 = r307
            r0.setTextColor(r1)
            r0 = r303
            r1 = r308
            r0.setText(r1)
            r0 = r309
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r305 = r0
            r0 = r304
            r1 = r305
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.internal.ZeroE2ETestActivity.A15(com.facebook.zero.internal.ZeroE2ETestActivity, java.lang.String):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        Resources resources;
        int i;
        super.A2y(bundle);
        this.A0B = AbL.A08(this);
        this.A0C = FbInjector.A00;
        this.A0F = 1BQ.A02(67199);
        this.A0I = AbH.A0S();
        this.A0M = DKD.A0T();
        this.A0L = 7zL.A0R(this, 32811);
        this.A0K = 1BV.A00(16934);
        this.A0D = AbF.A0Q(this, 65730);
        this.A0O = G7K.A01(this, ActionId.APP_DID_BECOME_ACTIVE);
        this.A0J = 1BV.A00(67504);
        this.A0P = G7K.A01(this, ActionId.APP_WILL_ENTER_FOREGROUND);
        this.A0N = G7K.A01(this, ActionId.APP_DID_ENTER_BACKGROUND);
        this.A0E = AbF.A0Q(this, 98596);
        setContentView(2132543606);
        if (findViewById(2131363647) != null) {
            C00i c00i = this.A0E;
            if (c00i == null) {
                c00i = AbF.A0Q(this, 98596);
                this.A0E = c00i;
            }
            FJ7 fj7 = (FJ7) c00i.get();
            ViewStub viewStub = (ViewStub) findViewById(2131363647);
            synchronized (fj7) {
                C00i c00i2 = fj7.A08;
                boolean A06 = ((AnonymousClass423) c00i2.get()).A06();
                fj7.A00 = viewStub;
                if (A06) {
                    resources = getResources();
                    i = 2132279402;
                } else {
                    resources = getResources();
                    i = 2131165230;
                }
                resources.getDimension(i);
                if (((AnonymousClass423) c00i2.get()).A04() || ((AnonymousClass423) c00i2.get()).A03() || ((AnonymousClass423) c00i2.get()).A05()) {
                    getResources().getDimension(2132279303);
                }
            }
        }
        View findViewById = findViewById(2131367917);
        View findViewById2 = findViewById(2131367925);
        View findViewById3 = findViewById(2131367924);
        View findViewById4 = findViewById(2131367915);
        findViewById.setOnClickListener(new FXs(this, this, 79));
        FXq.A01(findViewById2, this, ActionId.PREV_ACTIVITY_PAUSE);
        FXq.A01(findViewById3, this, ActionId.ACTIVITY_RESUME);
        FXq.A01(findViewById4, this, ActionId.ACTIVITY_START);
        EditText editText = (EditText) findViewById(2131366958);
        A15(this, AbM.A0u(editText));
        FWn.A00(editText, this, 41);
        this.A0G = true;
        Handler handler = new Handler();
        this.A00 = handler;
        handler.postDelayed(new G1C(this), 500L);
        0fH.A0n("ZeroE2ETestActivity", "triggering ZBD Config Fetch for E2E test");
        C07334jk c07334jk = (C07334jk) this.A0R.get();
        FbUserSession fbUserSession = this.A0B;
        fbUserSession.getClass();
        c07334jk.A01(1BK.A04(this.A0C), fbUserSession, 0S2.A00);
        this.A05 = DKF.A0D(this, 2131367926);
        this.A03 = DKF.A0D(this, 2131367916);
        this.A01 = DKF.A0D(this, 2131367913);
        this.A02 = DKF.A0D(this, 2131367914);
        this.A06 = DKF.A0D(this, 2131367928);
        this.A0H = DKF.A0D(this, 2131367918);
        this.A04 = DKF.A0D(this, 2131367923);
        this.A0A = DKF.A0D(this, 2131367927);
        this.A09 = DKF.A0D(this, 2131367921);
        this.A08 = DKF.A0D(this, 2131367920);
        this.A07 = DKF.A0D(this, 2131367919);
        A12(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1541154266);
        super.onPause();
        this.A0G = false;
        ((FJ7) this.A0E.get()).A06.A01();
        0FI.A07(122552257, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(244908640);
        super.onResume();
        this.A0G = true;
        Handler handler = new Handler();
        this.A00 = handler;
        handler.postDelayed(new G1C(this), 500L);
        FJ7 fj7 = (FJ7) this.A0E.get();
        fj7.A06.A00();
        FJ7.A06(fj7);
        0FI.A07(218034276, A00);
    }
}
