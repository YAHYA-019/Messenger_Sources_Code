package com.facebook.zero.zerobalance.ui;

import X.0FI;
import X.1BQ;
import X.1Bi;
import X.1Iw;
import X.1Ql;
import X.4YU;
import X.7zL;
import X.AbI;
import X.AbJ;
import X.AbN;
import X.C00i;
import X.C0dp;
import X.C1rs;
import X.DKC;
import X.DKG;
import X.DuG;
import X.DzN;
import X.ED7;
import X.EyW;
import X.F8d;
import X.GGn;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.BitSet;

/* loaded from: AutoflexOptinInterstitial.class */
public class AutoflexOptinInterstitial extends FbFragmentActivity implements GGn {
    public final C00i A01 = 1BQ.A02(98467);
    public final C00i A00 = 1BQ.A02(98462);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        F8d.A00(this.A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1Iw A0W = 7zL.A0W(this);
        ED7 A01 = ED7.A01(this, AbJ.A0i());
        DuG duG = new DuG(A0W, new DzN());
        DzN dzN = duG.A01;
        dzN.A02 = this;
        BitSet bitSet = duG.A02;
        bitSet.set(0);
        dzN.A01 = A01;
        bitSet.set(1);
        dzN.A00 = 4YU.A0B(this).orientation;
        bitSet.set(2);
        C1rs.A03(bitSet, duG.A03);
        duG.A0J();
        setContentView(AbN.A0I(dzN, A0W));
        ((EyW) this.A01.get()).A02("optin_dialog_rendered");
        ((F8d) this.A00.get()).A0F.set(true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // X.GGn
    public void onDismiss() {
        FbSharedPreferences A0i = AbJ.A0i();
        C0dp A0B = AbI.A0B();
        1Ql edit = A0i.edit();
        edit.CaH(DKC.A0b(DKG.A0w().A04), A0B.now());
        edit.commit();
        ((EyW) this.A01.get()).A02("optin_dialog_dismissed");
        F8d.A00(this.A00);
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1041553479);
        super.onResume();
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 1Bi.A03(16520);
        int i = 238949013;
        if ("ZeroOlympusOptin".equals(ED7.A01(this, AbJ.A0i()).A0C)) {
            i = 238954299;
        }
        quickPerformanceLogger.markerPoint(i, "optin_screen_is_interactable");
        quickPerformanceLogger.markerEnd(i, (short) 2);
        0FI.A07(1634414095, A00);
    }
}
