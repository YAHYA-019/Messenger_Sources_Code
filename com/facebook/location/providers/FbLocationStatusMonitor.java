package com.facebook.location.providers;

import X.0Pz;
import X.0S2;
import X.1Bi;
import X.1EC;
import X.1HN;
import X.1Hv;
import X.1I7;
import X.1PA;
import X.3gY;
import X.5DP;
import X.A1t;
import X.C02333uu;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: FbLocationStatusMonitor.class */
public final class FbLocationStatusMonitor {
    public 1PA A00;
    public 5DP A01;
    public ListenableFuture A02;
    public final 1I7 A03;
    public final 1I7 A04;
    public final C02333uu A05;
    public final 1HN A06;
    public final FbSharedPreferences A07;
    public final 1EC A08;
    public static final String A0A = 0Pz.A0W(FbLocationStatusMonitor.class.getCanonicalName(), ".ACTION_STATUS_STATE_CHANGED");
    public static final String A09 = 0Pz.A0W(FbLocationStatusMonitor.class.getCanonicalName(), ".ACTION_STATUS_CHANGED");

    public FbLocationStatusMonitor() {
        C02333uu c02333uu = (C02333uu) 1Bi.A03(131080);
        1I7 r0 = (1I7) 1Hv.A02(FbInjector.A00(), 65729);
        1I7 r02 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1EC r03 = (1EC) 1Bi.A03(16433);
        this.A06 = new A1t(this, 0);
        this.A05 = c02333uu;
        this.A03 = r0;
        this.A04 = r02;
        this.A07 = fbSharedPreferences;
        this.A08 = r03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r301 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r0.A01 != r301.A01) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (r302.A01.equals(r301) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        r0 = new android.content.Intent(com.facebook.location.providers.FbLocationStatusMonitor.A09);
        r0.putExtra(X.DKB.A00(539), r307);
        r302.A04.CkS(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.5DP r301, com.facebook.location.providers.FbLocationStatusMonitor r302) {
        /*
            r0 = r302
            X.3uu r0 = r0.A05
            r303 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r304
            r2 = 0
            X.5DP r0 = r0.A01(r1, r2)
            r306 = r0
            r0 = r302
            r1 = r306
            r0.A01 = r1
            r0 = r301
            if (r0 == 0) goto L35
            r0 = r306
            java.lang.Integer r0 = r0.A01
            r304 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A01
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L4e
        L35:
            r0 = 1
            r307 = r0
            r0 = r302
            X.1I7 r0 = r0.A04
            r304 = r0
            java.lang.String r0 = com.facebook.location.providers.FbLocationStatusMonitor.A0A
            r306 = r0
            r0 = r304
            r1 = r306
            r0.CkT(r1)
            r0 = r301
            if (r0 == 0) goto L61
        L4e:
            r0 = r302
            X.5DP r0 = r0.A01
            r306 = r0
            r0 = r306
            r1 = r301
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L93
        L61:
            java.lang.String r0 = com.facebook.location.providers.FbLocationStatusMonitor.A09
            r306 = r0
            android.content.Intent r0 = new android.content.Intent
            r304 = r0
            r0 = r304
            r1 = r306
            r0.<init>(r1)
            r0 = 539(0x21b, float:7.55E-43)
            r305 = r0
            r0 = r305
            java.lang.String r0 = X.DKB.A00(r0)
            r306 = r0
            r0 = r304
            r1 = r306
            r2 = r307
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r302
            X.1I7 r0 = r0.A04
            r306 = r0
            r0 = r306
            r1 = r304
            r0.CkS(r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.providers.FbLocationStatusMonitor.A00(X.5DP, com.facebook.location.providers.FbLocationStatusMonitor):void");
    }

    public static void A01(FbLocationStatusMonitor fbLocationStatusMonitor) {
        5DP r0 = fbLocationStatusMonitor.A01;
        fbLocationStatusMonitor.A01 = fbLocationStatusMonitor.A05.A01(0S2.A0C, false);
        if (fbLocationStatusMonitor.A02 == null) {
            fbLocationStatusMonitor.A02 = fbLocationStatusMonitor.A08.Cjg(new 3gY(r0, fbLocationStatusMonitor), TimeUnit.MILLISECONDS, 500L);
        }
    }
}
