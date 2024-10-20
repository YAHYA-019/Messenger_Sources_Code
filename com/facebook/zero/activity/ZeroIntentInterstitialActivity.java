package com.facebook.zero.activity;

import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1JF;
import X.1iF;
import X.1lN;
import X.48U;
import X.4YU;
import X.AbH;
import X.AnonymousClass000;
import X.C00i;
import X.C0Aj;
import X.C0et;
import X.C2xd;
import X.C67J;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKF;
import X.E9O;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: ZeroIntentInterstitialActivity.class */
public class ZeroIntentInterstitialActivity extends FbFragmentActivity implements 1lN {
    public Intent A00;
    public C0et A01;
    public C00i A02;
    public C67J A03;
    public String A04;
    public boolean A05;
    public int A06;
    public C2xd A07;
    public final C00i A0A = 1BQ.A01();
    public final C00i A09 = DKF.A0M();
    public final C00i A0C = AbH.A0D();
    public final C00i A0B = DKD.A0N();
    public final C00i A08 = 1BQ.A00();

    public static void A12(ZeroIntentInterstitialActivity zeroIntentInterstitialActivity) {
        Intent intent = zeroIntentInterstitialActivity.A00;
        if (intent != null) {
            Uri data = intent.getData();
            if (C0Aj.A06(data) && 1JF.A0B(data.getQueryParameter("no_warn_external"))) {
                Uri.Builder buildUpon = data.buildUpon();
                buildUpon.appendQueryParameter("no_warn_external", ConstantsKt.CAMERA_ID_BACK);
                intent.setData(buildUpon.build());
            }
            intent.putExtra("zero_dialog_shown", true);
            if (zeroIntentInterstitialActivity.A05) {
                try {
                    DKC.A0f(zeroIntentInterstitialActivity.A0C).A00().A09(zeroIntentInterstitialActivity, intent, zeroIntentInterstitialActivity.A06);
                } catch (ActivityNotFoundException unused) {
                    0fH.A0S(ZeroIntentInterstitialActivity.class, "Activity not found for intent: [%s]", new Object[]{intent});
                }
            } else {
                try {
                    DKC.A0f(zeroIntentInterstitialActivity.A0C).A00().A0A(zeroIntentInterstitialActivity, intent);
                } catch (ActivityNotFoundException unused2) {
                    0fH.A0S(ZeroIntentInterstitialActivity.class, "Activity not found for intent: [%s]", new Object[]{intent});
                }
                zeroIntentInterstitialActivity.finish();
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.activity.ZeroIntentInterstitialActivity.A2y(android.os.Bundle):void");
    }

    public void A3B() {
        C00i c00i = this.A02;
        if (c00i != null && DKE.A1X(c00i) && 1BK.A0N(this.A08).AZk(36310675733939093L)) {
            4YU.A0K(this.A02).A0I("switch_to_paid_mode");
        }
        4YU.A0d(this.A0B).A01("url_interstitial");
        if (this.A00.getAction() == null || !this.A00.getAction().equals("android.intent.action.SEND") || this.A00.getType() == null || !this.A00.getType().startsWith("video/")) {
            A12(this);
            return;
        }
        C2xd c2xd = this.A07;
        c2xd.getClass();
        c2xd.A0M(this).AHR(new E9O(this, 1), 48U.A00(this, new String[]{AnonymousClass000.A00(4)}));
    }

    public String AWg() {
        return 1BJ.A00(2160);
    }

    public Long Am7() {
        return 453586272481763L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }
}
