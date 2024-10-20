package com.facebook.common.keyguard;

import X.0S2;
import X.0SG;
import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1CO;
import X.1Gz;
import X.1Hv;
import X.AbH;
import X.C00i;
import X.C01o;
import X.C1xf;
import X.GOo;
import X.IgR;
import X.LKo;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.keyguard.KeyguardPendingIntentActivity;

/* loaded from: KeyguardPendingIntentActivity.class */
public class KeyguardPendingIntentActivity extends FbFragmentActivity implements C1xf {
    public PendingIntent A00;
    public Handler A01;
    public 1Gz A02;
    public KeyguardManager A03;
    public final 1CO A05 = (1CO) 1Bi.A03(16387);
    public final C00i A06 = 1BQ.A01();
    public final C00i A04 = AbH.A0P();

    public static void A12(final KeyguardPendingIntentActivity keyguardPendingIntentActivity) {
        1Gz r0 = keyguardPendingIntentActivity.A02;
        if (r0 != null) {
            keyguardPendingIntentActivity.unregisterReceiver(r0);
            keyguardPendingIntentActivity.A02 = null;
        }
        if (keyguardPendingIntentActivity.A03.inKeyguardRestrictedInputMode()) {
            1BK.A09(keyguardPendingIntentActivity.A06).D0v("KeyguardPendingIntentActivity_inKeyguardRestrictedInputMode", "Keyguard should not be enabled");
            keyguardPendingIntentActivity.finish();
            return;
        }
        View decorView = keyguardPendingIntentActivity.getWindow().getDecorView();
        decorView.invalidate();
        if (keyguardPendingIntentActivity.A05.AZk(72339739030390887L)) {
            0SG.A00(decorView, new Runnable() { // from class: X.Ip0
                public static final String __redex_internal_original_name = "KeyguardPendingIntentActivity$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    KeyguardPendingIntentActivity keyguardPendingIntentActivity2 = KeyguardPendingIntentActivity.this;
                    keyguardPendingIntentActivity2.A01.postDelayed(new Ip2(keyguardPendingIntentActivity2), 400L);
                }
            });
        } else {
            decorView.getViewTreeObserver().addOnPreDrawListener(new LKo(keyguardPendingIntentActivity, decorView, 2));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1Gz r0 = this.A02;
        if (r0 != null) {
            unregisterReceiver(r0);
            this.A02 = null;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        overridePendingTransition(0, 0);
        this.A03 = (KeyguardManager) 1Hv.A02(this, 100176);
        this.A01 = new Handler();
        try {
            this.A00 = (PendingIntent) getIntent().getParcelableExtra("EXTRA_PENDING_INTENT");
        } catch (RuntimeException e) {
            1BK.A09(this.A06).D0v("KeyguardPendingIntentActivity_getParcelableExtra_exception", e.getMessage());
            finish();
        }
        if (this.A00 == null) {
            finish();
        }
        if (!this.A03.inKeyguardRestrictedInputMode()) {
            A12(this);
            return;
        }
        C01o c01o = new C01o(new IgR(this, 0), "android.intent.action.USER_PRESENT");
        this.A02 = c01o;
        GOo.A15(c01o, this, "android.intent.action.USER_PRESENT");
    }

    @Override // X.C1xf
    public Integer Ac6() {
        return 0S2.A01;
    }
}
