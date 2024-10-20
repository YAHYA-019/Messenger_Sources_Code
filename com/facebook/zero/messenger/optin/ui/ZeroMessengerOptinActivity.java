package com.facebook.zero.messenger.optin.ui;

import X.0FI;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1tJ;
import X.2BQ;
import X.7zM;
import X.7zP;
import X.AbG;
import X.C00i;
import X.C2yk;
import X.DKD;
import X.DKE;
import X.DR5;
import android.os.Bundle;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ZeroMessengerOptinActivity.class */
public final class ZeroMessengerOptinActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public final 1Br A04 = 7zM.A0f(this);
    public final 1Br A07 = 1Bu.A00(33101);
    public final 1Br A03 = 1Bu.A00(98477);
    public final 2BQ A08 = DKE.A0h();
    public final 1Br A01 = 1Bq.A00(32832);
    public final 1Br A05 = 7zM.A0S();
    public final AtomicInteger A09 = DKD.A14();
    public final 1Br A02 = 1BK.A0D();
    public final 1Br A06 = AbG.A0M();
    public final DR5 A0A = new DR5(this, 2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.messenger.optin.ui.ZeroMessengerOptinActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        setTheme(2132608263);
        Window window = getWindow();
        if (window != null) {
            C00i c00i = this.A04.A00;
            C2yk.A00(window, 7zM.A11(c00i).BDl());
            1tJ.A06(window, 7zM.A11(c00i).BDl());
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-756206139);
        super.onResume();
        7zP.A0e(this.A05).markerPoint(238958692, this.A09.get(), "nux_is_interactable");
        0FI.A07(750067684, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(148466271);
        super.onStart();
        7zP.A0e(this.A05).markerPoint(238958692, this.A09.get(), "nux_is_shown");
        0FI.A07(-1383143516, A00);
    }
}
