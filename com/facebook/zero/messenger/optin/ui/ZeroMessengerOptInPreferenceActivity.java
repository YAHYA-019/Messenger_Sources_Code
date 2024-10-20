package com.facebook.zero.messenger.optin.ui;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1tJ;
import X.2BQ;
import X.2BX;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.C2yk;
import X.DKD;
import android.os.Bundle;
import android.view.Window;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ZeroMessengerOptInPreferenceActivity.class */
public final class ZeroMessengerOptInPreferenceActivity extends MessengerSettingActivity {
    public final 2BX A07 = (2BX) 1Bn.A0A(33101);
    public final 1Br A03 = 7zM.A0f(this);
    public final 1Br A01 = 1Bq.A00(16922);
    public final 1Br A00 = 1BK.A0E();
    public final 1Br A02 = 1Bq.A00(32832);
    public final 1Br A05 = 1Bq.A00(49880);
    public final 1Br A04 = 7zM.A0S();
    public final AtomicInteger A06 = DKD.A14();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (((X.2BQ) r0.get()).A05("auto_messenger_setting") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A12() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r303 = r0
            java.lang.String r0 = "semi_auto_messenger_setting"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3d
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.2BQ r0 = (X.2BQ) r0
            r303 = r0
            r0 = r303
            java.lang.String r1 = "auto_messenger_setting"
            boolean r0 = r0.A05(r1)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L40
        L3d:
            r0 = 1
            r305 = r0
        L40:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.messenger.optin.ui.ZeroMessengerOptInPreferenceActivity.A12():boolean");
    }

    public static final boolean A15(ZeroMessengerOptInPreferenceActivity zeroMessengerOptInPreferenceActivity) {
        return ((2BQ) 1Br.A0B(zeroMessengerOptInPreferenceActivity.A01)).A05("free_messenger_setting");
    }

    public static final boolean A16(ZeroMessengerOptInPreferenceActivity zeroMessengerOptInPreferenceActivity) {
        return ((2BQ) 1Br.A0B(zeroMessengerOptInPreferenceActivity.A01)).A05(1BJ.A00(226));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        QuickPerformanceLogger A0e = 7zP.A0e(this.A04);
        int i = this.A06.get();
        11T.A0F(A0e, 0);
        A0e.markerEnd(238956477, i, (short) 2);
        super.A2l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04b4  */
    /* JADX WARN: Type inference failed for: r0v281, types: [int[], int[][]] */
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.messenger.optin.ui.ZeroMessengerOptInPreferenceActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        setTheme(2132608263);
        Window window = getWindow();
        if (window != null) {
            1Br r0 = this.A03;
            C2yk.A00(window, 7zQ.A0m(r0).BDl());
            1tJ.A06(window, 7zQ.A0m(r0).BDl());
        }
    }
}
