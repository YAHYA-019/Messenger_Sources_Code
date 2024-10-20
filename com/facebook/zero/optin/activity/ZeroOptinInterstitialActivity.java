package com.facebook.zero.optin.activity;

import X.0LS;
import X.0rI;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bi;
import X.1CQ;
import X.1Hv;
import X.1I7;
import X.1JF;
import X.1Ql;
import X.1UG;
import X.1iF;
import X.4YU;
import X.53A;
import X.7zL;
import X.AbF;
import X.AbH;
import X.C00i;
import X.C0A2;
import X.C0A8;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKG;
import X.DKI;
import X.ED6;
import X.Euj;
import X.FG8;
import X.FXq;
import X.FXs;
import X.Fsy;
import X.G1G;
import X.GJL;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.util.TriState;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.facepile.FacepileView;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbTextView;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: ZeroOptinInterstitialActivity.class */
public class ZeroOptinInterstitialActivity extends FbFragmentActivity implements CallerContextable {
    public static final CallerContext A0h = CallerContext.A08(ZeroOptinInterstitialActivity.class, "zero_optin_interstitial");
    public Uri A00;
    public ViewGroup A01;
    public LinearLayout A02;
    public ProgressBar A03;
    public ScrollView A04;
    public 1I7 A05;
    public 1I7 A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public FbButton A0B;
    public FbTextView A0C;
    public FbTextView A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public 0rI A0H;
    public 1CQ A0I;
    public FbButton A0J;
    public Uri A0K;
    public FbDraweeView A0L;
    public FacepileView A0M;
    public FbTextView A0N;
    public FbTextView A0O;
    public ImmutableList A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public boolean A0c;
    public boolean A0d;
    public final C00i A0e = 1BQ.A02(16923);
    public final GJL A0f = (GJL) 1Bi.A03(84011);
    public final 53A A0g = (53A) 1Bi.A03(49474);

    public static void A12(Bundle bundle, ZeroOptinInterstitialActivity zeroOptinInterstitialActivity, String str) {
        if (1JF.A0B(str)) {
            return;
        }
        Intent Ard = zeroOptinInterstitialActivity.A0f.Ard(zeroOptinInterstitialActivity.getApplicationContext(), str);
        if (Ard == null) {
            Ard = AbF.A05();
            DKC.A1J(Ard, str);
        }
        if (bundle != null) {
            Ard.putExtras(bundle);
        }
        Ard.setFlags(335544320);
        0LS.A0A(zeroOptinInterstitialActivity.getApplicationContext(), Ard);
    }

    private void A15(Bundle bundle, String str, String str2, String str3, String str4) {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ScrollView scrollView = this.A04;
        if (scrollView != null) {
            scrollView.setVisibility(8);
        }
        this.A03.setVisibility(0);
        ((Euj) this.A0A.get()).A02.add(new Fsy(bundle, this, str4, str3));
        ((Euj) this.A0A.get()).A00(C0A8.A07(getResources()), str, str2);
    }

    public static void A16(ZeroOptinInterstitialActivity zeroOptinInterstitialActivity) {
        ScrollView scrollView;
        LinearLayout linearLayout;
        zeroOptinInterstitialActivity.A03.setVisibility(8);
        if (zeroOptinInterstitialActivity instanceof LightswitchOptinInterstitialActivity) {
            LightswitchOptinInterstitialActivity lightswitchOptinInterstitialActivity = (LightswitchOptinInterstitialActivity) zeroOptinInterstitialActivity;
            lightswitchOptinInterstitialActivity.A00.setVisibility(8);
            if (!1JF.A0B(lightswitchOptinInterstitialActivity.A0E)) {
                lightswitchOptinInterstitialActivity.A00.setVisibility(0);
                if (4YU.A0B(lightswitchOptinInterstitialActivity).orientation == 2) {
                    ViewGroup.LayoutParams layoutParams = lightswitchOptinInterstitialActivity.A00.getLayoutParams();
                    layoutParams.height = C0A8.A03(lightswitchOptinInterstitialActivity.getResources(), 70.0f);
                    lightswitchOptinInterstitialActivity.A00.setLayoutParams(layoutParams);
                }
            }
        }
        zeroOptinInterstitialActivity.A3F();
        zeroOptinInterstitialActivity.A3E();
        zeroOptinInterstitialActivity.A3D();
        ViewGroup viewGroup = zeroOptinInterstitialActivity.A01;
        if (((viewGroup != null && viewGroup.getVisibility() == 8) || zeroOptinInterstitialActivity.A01 == null) && ((((scrollView = zeroOptinInterstitialActivity.A04) != null && scrollView.getVisibility() == 8) || zeroOptinInterstitialActivity.A04 == null) && (((linearLayout = zeroOptinInterstitialActivity.A02) != null && linearLayout.getVisibility() == 8) || zeroOptinInterstitialActivity.A02 == null))) {
            1Ql A0V = 1BL.A0V(zeroOptinInterstitialActivity.A07);
            A0V.CfI(DKC.A0b(DKG.A0w().A0E));
            A0V.commit();
            zeroOptinInterstitialActivity.finish();
            return;
        }
        1UG A08 = 1BK.A08(1BK.A07(zeroOptinInterstitialActivity.A08), "iorg_optin_interstitial_shown");
        if (A08.isSampled()) {
            A08.A7R("caller_context", zeroOptinInterstitialActivity.A3B().toString());
            A08.BZL();
        }
    }

    public static void A1D(ZeroOptinInterstitialActivity zeroOptinInterstitialActivity, ED6 ed6) {
        zeroOptinInterstitialActivity.A0b = ed6.A0B();
        zeroOptinInterstitialActivity.A0Z = ed6.A08;
        zeroOptinInterstitialActivity.A0R = ed6.A06();
        zeroOptinInterstitialActivity.A0K = C0A2.A03(ed6.A03);
        zeroOptinInterstitialActivity.A0d = ed6.A0A;
        zeroOptinInterstitialActivity.A0S = ed6.A02;
        zeroOptinInterstitialActivity.A0P = ed6.A01;
        zeroOptinInterstitialActivity.A0a = ed6.A0A();
        zeroOptinInterstitialActivity.A0E = ed6.A05();
        zeroOptinInterstitialActivity.A00 = C0A2.A03(((FG8) ed6).A04);
        zeroOptinInterstitialActivity.A0F = ed6.A08();
        zeroOptinInterstitialActivity.A0V = ed6.A05;
        zeroOptinInterstitialActivity.A0T = ed6.A04;
        zeroOptinInterstitialActivity.A0U = ((FG8) ed6).A05;
        zeroOptinInterstitialActivity.A0G = ed6.A09();
        zeroOptinInterstitialActivity.A0Y = ed6.A07;
        zeroOptinInterstitialActivity.A0W = ed6.A06;
        zeroOptinInterstitialActivity.A0X = ((FG8) ed6).A06;
        zeroOptinInterstitialActivity.A0c = ed6.A09;
        zeroOptinInterstitialActivity.A0Q = ((FG8) ed6).A03;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A05 = (1I7) 1Hv.A02(this, 65731);
        this.A06 = DKD.A0H(this);
        this.A09 = 1BQ.A02(16464);
        this.A0A = 7zL.A0R(this, 98539);
        this.A07 = AbH.A0S();
        this.A08 = AbH.A0N();
        this.A0I = (1CQ) 1Bi.A03(131252);
        this.A0H = (0rI) 1Bi.A03(84491);
        A3C();
        if (this.A0I.A05(32) != TriState.YES) {
            A15(null, ConstantsKt.CAMERA_ID_FRONT, "", null, null);
        } else {
            A1D(this, ED6.A00(this, 1BK.A0R(this.A07)));
            A16(this);
        }
    }

    public CallerContext A3B() {
        return this instanceof LightswitchOptinInterstitialActivity ? LightswitchOptinInterstitialActivity.A02 : A0h;
    }

    public void A3C() {
        if (this instanceof LightswitchOptinInterstitialActivity) {
            LightswitchOptinInterstitialActivity lightswitchOptinInterstitialActivity = (LightswitchOptinInterstitialActivity) this;
            lightswitchOptinInterstitialActivity.setTheme(2132608263);
            lightswitchOptinInterstitialActivity.setContentView(2132542419);
            lightswitchOptinInterstitialActivity.A03 = (ProgressBar) lightswitchOptinInterstitialActivity.A2c(2131366133);
            lightswitchOptinInterstitialActivity.A00 = (ImageView) lightswitchOptinInterstitialActivity.A2c(2131363264);
            DKI.A0f(lightswitchOptinInterstitialActivity);
            LinearLayout linearLayout = (LinearLayout) lightswitchOptinInterstitialActivity.A2c(2131366117);
            lightswitchOptinInterstitialActivity.A02 = linearLayout;
            linearLayout.setVisibility(8);
            lightswitchOptinInterstitialActivity.A0B = (FbButton) lightswitchOptinInterstitialActivity.A2c(2131366132);
            Bundle A05 = 1BK.A05();
            A05.putString("ref", "dialtone_optin_screen");
            FXs.A01(lightswitchOptinInterstitialActivity.A0B, A05, lightswitchOptinInterstitialActivity, 82);
            lightswitchOptinInterstitialActivity.A01 = (FbTextView) lightswitchOptinInterstitialActivity.A2c(2131366135);
            return;
        }
        setTheme(2132608263);
        setContentView(2132543615);
        this.A03 = (ProgressBar) A2c(2131366133);
        DKI.A0f(this);
        this.A04 = (ScrollView) A2c(2131366122);
        this.A0L = (FbDraweeView) A2c(2131366129);
        this.A0O = (FbTextView) A2c(2131366125);
        this.A0M = (FacepileView) A2c(2131366126);
        this.A0N = (FbTextView) A2c(2131366119);
        this.A02 = (LinearLayout) A2c(2131366117);
        FbButton fbButton = (FbButton) A2c(2131366134);
        this.A0J = fbButton;
        FXq.A01(fbButton, this, ActionId.DISPLAYED_ON_SCREEN);
        FbButton fbButton2 = (FbButton) A2c(2131366132);
        this.A0B = fbButton2;
        FXq.A01(fbButton2, this, ActionId.ASYNC_ACTION_SUCCESS);
    }

    public void A3D() {
        boolean z;
        LinearLayout linearLayout;
        boolean z2;
        if (this instanceof LightswitchOptinInterstitialActivity) {
            LightswitchOptinInterstitialActivity lightswitchOptinInterstitialActivity = (LightswitchOptinInterstitialActivity) this;
            lightswitchOptinInterstitialActivity.A02.setVisibility(8);
            lightswitchOptinInterstitialActivity.A0B.setVisibility(8);
            if (1JF.A0B(lightswitchOptinInterstitialActivity.A0F)) {
                z2 = false;
            } else {
                lightswitchOptinInterstitialActivity.A0B.setText(lightswitchOptinInterstitialActivity.A0F);
                lightswitchOptinInterstitialActivity.A0B.setContentDescription(lightswitchOptinInterstitialActivity.A0F);
                lightswitchOptinInterstitialActivity.A0B.setVisibility(0);
                z2 = true;
            }
            lightswitchOptinInterstitialActivity.A01.setVisibility(8);
            if (!1JF.A0B(lightswitchOptinInterstitialActivity.A0G)) {
                lightswitchOptinInterstitialActivity.A01.setText(lightswitchOptinInterstitialActivity.A0G);
                lightswitchOptinInterstitialActivity.A01.setContentDescription(lightswitchOptinInterstitialActivity.A0G);
                FXq.A01(lightswitchOptinInterstitialActivity.A01, lightswitchOptinInterstitialActivity, ActionId.WAIT_FOR_BLOCKERS);
                lightswitchOptinInterstitialActivity.A01.setVisibility(0);
            } else if (!z2) {
                return;
            }
            linearLayout = lightswitchOptinInterstitialActivity.A02;
        } else {
            this.A02.setVisibility(8);
            this.A0B.setVisibility(8);
            if (1JF.A0B(this.A0F)) {
                z = false;
            } else {
                this.A0B.setText(this.A0F);
                this.A0B.setContentDescription(this.A0F);
                this.A0B.setVisibility(0);
                z = true;
            }
            this.A0J.setVisibility(8);
            if (!1JF.A0B(this.A0G) && !this.A0c) {
                this.A0J.setText(this.A0G);
                this.A0J.setContentDescription(this.A0G);
                this.A0J.setVisibility(0);
            } else if (!z) {
                return;
            }
            linearLayout = this.A02;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A3E() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.optin.activity.ZeroOptinInterstitialActivity.A3E():void");
    }

    public void A3F() {
        boolean z;
        this.A01.setVisibility(8);
        this.A0D.setVisibility(8);
        if (1JF.A0B(this.A0b)) {
            z = false;
        } else {
            this.A0D.setText(this.A0b);
            this.A0D.setContentDescription(this.A0b);
            this.A0D.setVisibility(0);
            z = true;
        }
        this.A0C.setVisibility(8);
        if (!1JF.A0B(this.A0R)) {
            this.A0C.setText(this.A0R);
            this.A0C.setContentDescription(this.A0R);
            this.A0C.setVisibility(0);
        } else if (!z) {
            return;
        }
        this.A01.setVisibility(0);
    }

    public final void A3G() {
        A15(null, this.A0Y, this.A0W, this.A0X, this.A0Q);
    }

    public final void A3H(Bundle bundle) {
        A15(bundle, this.A0V, this.A0T, this.A0U, this.A0Q);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        C00i c00i = this.A09;
        if (c00i == null || c00i.get() != null) {
            ((ScheduledExecutorService) this.A09.get()).schedule((Runnable) new G1G(this), 10000L, TimeUnit.MILLISECONDS);
        }
        super.finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CallerContext A3B = A3B();
        1UG A08 = 1BK.A08(1BK.A07(this.A08), "optin_interstitial_back_pressed");
        if (A08.isSampled()) {
            A08.A7R("caller_context", A3B.toString());
            A08.BZL();
        }
        FbButton fbButton = this.A0J;
        if ((fbButton == null || fbButton.getVisibility() != 0) && !this.A0c) {
            finish();
        } else {
            A3G();
        }
    }
}
