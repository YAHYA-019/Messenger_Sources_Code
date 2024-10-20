package com.facebook.zero.optin.activity;

import X.1BJ;
import X.1BQ;
import X.1Bi;
import X.1Hv;
import X.1I7;
import X.1iF;
import X.3sT;
import X.3sU;
import X.4YU;
import X.53A;
import X.7zL;
import X.C00i;
import X.C0A8;
import X.C2121Dea;
import X.DKD;
import X.DKE;
import X.DKS;
import X.FK6;
import X.FXq;
import X.FwK;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.facepile.FacepileView;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbTextView;
import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import com.facebook.zero.protocol.params.FetchZeroOptinContentRequestParams;
import com.facebook.zero.protocol.results.FetchZeroOptinContentRequestResult;

/* loaded from: NativeOptinInterstitialActivity.class */
public class NativeOptinInterstitialActivity extends FbFragmentActivity implements CallerContextable {
    public static final CallerContext A0I = CallerContext.A08(NativeOptinInterstitialActivity.class, "zero_optin_interstitial");
    public LinearLayout A00;
    public ProgressBar A01;
    public ScrollView A02;
    public 1I7 A03;
    public 1I7 A04;
    public FbDraweeView A05;
    public FacepileView A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public FbButton A0A;
    public FbButton A0B;
    public FbTextView A0C;
    public FbTextView A0D;
    public FbTextView A0E;
    public FbTextView A0F;
    public FetchZeroOptinContentRequestResult A0G;
    public final 53A A0H = (53A) 1Bi.A03(49474);

    public static void A12(NativeOptinInterstitialActivity nativeOptinInterstitialActivity) {
        if (nativeOptinInterstitialActivity.A0G != null) {
            C2121Dea c2121Dea = new C2121Dea(nativeOptinInterstitialActivity, 1);
            FetchZeroOptinContentRequestResult fetchZeroOptinContentRequestResult = nativeOptinInterstitialActivity.A0G;
            c2121Dea.A0B(fetchZeroOptinContentRequestResult.mOptinDeclineTitle);
            c2121Dea.A0A(fetchZeroOptinContentRequestResult.mOptinDeclineConfirmText);
            DKS.A01(c2121Dea, fetchZeroOptinContentRequestResult.mOptinDeclineButtonConfirmText, nativeOptinInterstitialActivity, 95);
            c2121Dea.A0F(FK6.A00(nativeOptinInterstitialActivity, 94), nativeOptinInterstitialActivity.A0G.mOptinDeclineButtonCancelText);
            c2121Dea.A04();
        }
    }

    public static void A15(NativeOptinInterstitialActivity nativeOptinInterstitialActivity) {
        nativeOptinInterstitialActivity.A00.setVisibility(8);
        nativeOptinInterstitialActivity.A02.setVisibility(8);
        nativeOptinInterstitialActivity.A01.setVisibility(0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A09 = 7zL.A0R(this, 32811);
        this.A03 = (1I7) 1Hv.A02(this, 65731);
        this.A04 = DKD.A0H(this);
        this.A08 = 1BQ.A02(16464);
        this.A07 = 7zL.A0R(this, 32812);
        setTheme(2132608263);
        setContentView(2132542809);
        this.A01 = (ProgressBar) A2c(2131366133);
        this.A02 = (ScrollView) A2c(2131366131);
        this.A0F = (FbTextView) A2c(2131366138);
        this.A0E = (FbTextView) A2c(2131366123);
        this.A05 = (FbDraweeView) A2c(2131366130);
        this.A0D = (FbTextView) A2c(2131366127);
        this.A06 = (FacepileView) A2c(2131366126);
        this.A0C = (FbTextView) A2c(2131366124);
        this.A00 = (LinearLayout) A2c(2131366117);
        FbButton fbButton = (FbButton) A2c(2131366118);
        this.A0A = fbButton;
        FXq.A01(fbButton, this, ActionId.ASNYC_FAILED);
        FbButton fbButton2 = (FbButton) A2c(2131366120);
        this.A0B = fbButton2;
        FXq.A01(fbButton2, this, ActionId.ASYNC_FAIL);
        this.A0G = null;
        A15(this);
        3sU r0 = (3sU) 4YU.A0p(this.A07);
        CarrierAndSimMccMnc A00 = ((3sT) 4YU.A0p(this.A09)).A00();
        C00i c00i = this.A09;
        c00i.getClass();
        3sU.A02(RequestPriority.INTERACTIVE, r0, new FetchZeroOptinContentRequestParams(A00, DKE.A0s(c00i), C0A8.A07(getResources())), FwK.A01(this, 51), 1BJ.A00(423), true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        A12(this);
    }
}
