package com.facebook.zero.optin.activity;

import X.0Pz;
import X.1JF;
import X.2OB;
import X.AnonymousClass001;
import X.DKF;
import X.FXq;
import android.text.Html;
import android.widget.ImageView;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.resources.ui.FbTextView;

/* loaded from: LightswitchOptinInterstitialActivity.class */
public class LightswitchOptinInterstitialActivity extends ZeroOptinInterstitialActivity implements CallerContextable {
    public static final CallerContext A02 = CallerContext.A08(LightswitchOptinInterstitialActivity.class, "lightswitch_optin_interstitial");
    public ImageView A00;
    public FbTextView A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.view.View] */
    @Override // com.facebook.zero.optin.activity.ZeroOptinInterstitialActivity
    public void A3F() {
        FbTextView fbTextView;
        FXq fXq;
        super.A3F();
        boolean A1O = AnonymousClass001.A1O(super.A01.getVisibility());
        this.A0C.setVisibility(8);
        if (!1JF.A0B(this.A0R)) {
            this.A0C.setText(this.A0R);
            this.A0C.setContentDescription(this.A0R);
            DKF.A11(this, this.A0C, 2132214020);
            if (1JF.A0B(this.A0E) || super.A00 == null) {
                fbTextView = this.A0C;
                fXq = null;
            } else {
                2OB r0 = this.A0C;
                String A0v = 0Pz.A0v("<font color=black>", this.A0R, " </font>", this.A0E);
                if (A0v == null) {
                    A0v = "";
                }
                r0.setText(Html.fromHtml(A0v));
                DKF.A11(this, this.A0C, 2132214379);
                fbTextView = this.A0C;
                fXq = FXq.A00(this, ActionId.SERVICE_ON_START_COMMAND);
            }
            fbTextView.setOnClickListener(fXq);
            this.A0C.setVisibility(0);
        } else if (!A1O) {
            super.A01.setVisibility(8);
            return;
        }
        super.A01.setVisibility(0);
    }
}
