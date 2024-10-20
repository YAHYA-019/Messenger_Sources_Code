package com.facebook.messaging.msys.thread.bubbles.activity;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Od;
import X.1Q5;
import X.1Uv;
import X.1vE;
import X.2Oe;
import X.4YV;
import X.5JF;
import X.5oO;
import X.6CZ;
import X.7NA;
import X.7zM;
import X.AbG;
import X.AbH;
import X.AbK;
import X.C2j5;
import X.Cn0;
import X.DER;
import X.DIJ;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.fragment.MsysThreadViewActivity;

/* loaded from: StaxThreadViewBubblesActivity.class */
public final class StaxThreadViewBubblesActivity extends MsysThreadViewActivity implements DIJ, DER {
    public C2j5 bubblesGating;
    public 6CZ threadViewActivityGatingUtil;
    public final 1Br bubblesStateManager$delegate = 1Bq.A00(68467);
    public final 1Br authAppLockState$delegate = 1Bq.A00(66345);
    public final 1Br messagingIntentUris$delegate = AbG.A0Z();
    public final 1Br secureContextHelper$delegate = 7zM.A0M();
    public final 7NA dismissibleFragmentDelegate = new Cn0(this);
    public final 1Br messagesBroadcaster$delegate = 1Bq.A00(16688);
    public final 1Br appStateManager$delegate = 1Bq.A00(16616);
    public final 1Br unifiedBadgingGating$delegate = 1Bq.A00(83481);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2w(Context context) {
        this.bubblesGating = (C2j5) 1Bn.A0E(this, (1BY) null, 33230);
        this.threadViewActivityGatingUtil = (6CZ) 1Bn.A0A(66271);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Q5, java.lang.Object] */
    @Override // com.facebook.messaging.msys.thread.fragment.MsysThreadViewActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        View decorView;
        super.A2y(bundle);
        ((5oO) 1Br.A0B(this.bubblesStateManager$delegate)).A09(this);
        getIntent().getIntExtra("extra_from_bubble_notification_code", -1);
        ?? obj = new Object();
        2Oe A3B = A3B();
        if (A3B != null) {
            A3B.A1X((1Q5) obj);
        }
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        AbH.A1K(decorView, 0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        String str;
        super.A31(bundle);
        C2j5 c2j5 = this.bubblesGating;
        if (c2j5 == null) {
            str = "bubblesGating";
        } else {
            if (!c2j5.A01()) {
                0fH.A0j("StaxThreadViewBubblesActivity", "Uri called but bubbles not supported, finishing");
                finish();
            }
            ThreadKey threadKey = this.threadKey;
            if (threadKey == null) {
                return;
            }
            6CZ r0 = this.threadViewActivityGatingUtil;
            if (r0 != null) {
                if (r0.A01(threadKey)) {
                    return;
                }
                0fH.A18("StaxThreadViewBubblesActivity", "Uri called but bubbles not enabled for thread type %s, finishing", new Object[]{threadKey.A06});
                finish();
                return;
            }
            str = "threadViewActivityGatingUtil";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void CQ7() {
        2Oe A3B = A3B();
        if (A3B == null || !A3B.isThreadOpen) {
            return;
        }
        2Oe.A07(A3B);
    }

    public void CQI() {
        if (!((1Od) 1Br.A0B(this.appStateManager$delegate)).A0F() && ((5JF) 1Br.A0B(this.unifiedBadgingGating$delegate)).A00()) {
            0fH.A0j("StaxThreadViewBubblesActivity", "[badge] Updating app badge count from E2EE Bubble...");
            ((1Uv) 1Br.A0B(this.messagesBroadcaster$delegate)).A06();
        }
        C2j5 c2j5 = this.bubblesGating;
        if (c2j5 == null) {
            11T.A0L("bubblesGating");
            throw 0Q8.createAndThrow();
        }
        if (1Br.A07(c2j5.A03).AZk(36324668726792088L)) {
            0fH.A0j("StaxThreadViewBubblesActivity", "Need to redirect to full screen");
            1Br.A0B(this.messagingIntentUris$delegate);
            AbK.A0r(this.secureContextHelper$delegate).A0A(getBaseContext(), 4YV.A08("fb-messenger://threads"));
            finish();
        }
        2Oe A3B = A3B();
        if (A3B == null || A3B.isThreadOpen) {
            return;
        }
        2Oe.A08(A3B);
    }

    public void CQR() {
        ((1vE) 1Br.A0B(this.authAppLockState$delegate)).A07.set(true);
    }

    @Override // com.facebook.messaging.msys.thread.fragment.MsysThreadViewActivity, com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        2Oe A3B = A3B();
        if (A3B == null || !A3B.Bkd()) {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        String str;
        super.onPostResume();
        C2j5 c2j5 = this.bubblesGating;
        if (c2j5 == null) {
            str = "bubblesGating";
        } else {
            if (!c2j5.A01()) {
                0fH.A0j("StaxThreadViewBubblesActivity", "Bubble activity resumed but bubbles not supported, finishing");
                finish();
            }
            ThreadKey threadKey = this.threadKey;
            if (threadKey == null) {
                return;
            }
            6CZ r0 = this.threadViewActivityGatingUtil;
            if (r0 != null) {
                if (r0.A01(threadKey)) {
                    return;
                }
                0fH.A18("StaxThreadViewBubblesActivity", "Bubble activity resumed but bubbles not enabled for thread type %s, finishing", new Object[]{threadKey.A06});
                finish();
                return;
            }
            str = "threadViewActivityGatingUtil";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Q5, java.lang.Object] */
    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ?? obj = new Object();
            2Oe A3B = A3B();
            if (A3B != null) {
                A3B.A1X((1Q5) obj);
            }
        }
    }
}
