package com.facebook.zero.messenger.semi.activity;

import X.04J;
import X.0FI;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1vL;
import X.2BQ;
import X.2BX;
import X.AbG;
import X.DKD;
import X.DKE;
import X.DR5;
import android.widget.TextView;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ZeroMessengerNuxActivity.class */
public final class ZeroMessengerNuxActivity extends FbFragmentActivity {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public 04J A08;
    public 1vL A09;
    public 2BX A0A;
    public final 2BQ A0G = DKE.A0h();
    public final 1Br A0C = 1Bq.A00(49880);
    public final 1Br A0E = 1Bq.A00(49293);
    public final 1Br A0B = 1BK.A0C();
    public final QuickPerformanceLogger A0F = DKE.A0d();
    public final AtomicInteger A0H = DKD.A14();
    public final 1Br A0D = AbG.A0M();
    public final DR5 A0I = new DR5(this, 3);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        this.A0F.markerEnd(238949807, (short) 2);
        super.A2l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0144, code lost:
    
        if (r0.A05("zero_messaging_stickers_placeholder") == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fb  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.messenger.semi.activity.ZeroMessengerNuxActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1607482788);
        super.onResume();
        this.A0F.markerPoint(238947887, this.A0H.get(), "nux_is_interactable");
        0FI.A07(-1289465585, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(1866120339);
        super.onStart();
        this.A0F.markerPoint(238947887, this.A0H.get(), "nux_is_shown");
        0FI.A07(-1925981933, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i == 20) {
            this.A0F.markerPoint(238947887, this.A0H.get(), "nux_ui_hidden");
        }
    }
}
