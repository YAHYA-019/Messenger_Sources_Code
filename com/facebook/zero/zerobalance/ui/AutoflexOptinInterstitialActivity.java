package com.facebook.zero.zerobalance.ui;

import X.1BQ;
import X.1BV;
import X.1iF;
import X.AbH;
import X.C00i;
import X.C0A2;
import X.CZF;
import X.DKE;
import X.ED7;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbTextView;

/* loaded from: AutoflexOptinInterstitialActivity.class */
public class AutoflexOptinInterstitialActivity extends FbFragmentActivity implements CallerContextable {
    public static final CallerContext A09 = CallerContext.A06(AutoflexOptinInterstitialActivity.class);
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public FbDraweeView A03;
    public FbButton A04;
    public FbTextView A05;
    public FbTextView A06;
    public FbTextView A07;
    public ED7 A08;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1BQ A0S = AbH.A0S();
        this.A01 = A0S;
        this.A00 = AbH.A0a();
        this.A02 = 1BV.A00(98479);
        this.A08 = ED7.A00(this, A0S);
        setContentView(2132541553);
        FbDraweeView fbDraweeView = (FbDraweeView) A2c(2131362277);
        this.A03 = fbDraweeView;
        fbDraweeView.A0G(C0A2.A03(this.A08.A07), A09);
        this.A07 = (FbTextView) A2c(2131362281);
        this.A05 = (FbTextView) A2c(2131362278);
        this.A04 = (FbButton) A2c(2131362279);
        this.A06 = (FbTextView) A2c(2131362280);
        this.A07.setText(this.A08.A0B);
        this.A05.setText(this.A08.A04);
        this.A04.setText(this.A08.A08);
        this.A06.setText(2131953054);
        this.A04.setOnClickListener(new CZF(this, 100));
        this.A06.setOnClickListener(new CZF(this, ActionId.ON_VIEW_CREATED_END));
    }
}
