package com.facebook.photos.base.debug;

import X.0fH;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1NW;
import X.2Ia;
import X.2Ib;
import X.2Ie;
import X.2If;
import X.3bN;
import X.3bO;
import X.5CI;
import X.C00i;
import X.C0A9;
import X.C3Qe;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: DebugImageTracker.class */
public final class DebugImageTracker extends 2Ia implements 2Ib, 2Ie {
    public static final 2If A06 = new Object();
    public final 1Br A04 = 1Bq.A00(33013);
    public final 1Br A02 = 1Bq.A00(84488);
    public final 1Br A03 = 1Bq.A00(16385);
    public final 1Br A05 = 1Bq.A00(16520);
    public final C0A9 A00 = new C0A9(5000);
    public final C00i A01 = 1Bu.A00(16454);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        if (r309 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00(com.facebook.common.callercontext.CallerContext r302, X.5CI r303, X.C3le r304) {
        /*
            r301 = this;
            r0 = 0
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L79
            java.lang.String r0 = "No Extras"
            r306 = r0
            r0 = r301
            boolean r0 = A03(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L51
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r302
            if (r0 == 0) goto L73
            r0 = r302
            java.lang.String r0 = r0.A03
            r309 = r0
            r0 = r302
            com.facebook.common.callercontext.ContextChain r0 = r0.A01
            r308 = r0
        L2c:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = r0; r3 = r1; 
            r4 = 0
            r5 = r306
            r3[r4] = r5
            r3 = 1
            r4 = r309
            r2[r3] = r4
            r2 = 2
            r3 = r308
            r1[r2] = r3
            r306 = r0
            java.lang.String r0 = "DebugImageTracker-Error"
            r309 = r0
            java.lang.String r0 = "%s: %s %s"
            r308 = r0
            r0 = r309
            r1 = r308
            r2 = r306
            X.0fH.A14(r0, r1, r2)
        L51:
            r0 = r301
            X.00i r0 = r0.A01
            java.util.concurrent.Executor r0 = X.1BK.A1E(r0)
            r309 = r0
            X.3iK r0 = new X.3iK
            r308 = r0
            r0 = r308
            r1 = r305
            r2 = r302
            r3 = r304
            r4 = r301
            r0.<init>(r1, r2, r3, r4)
            r0 = r309
            r1 = r308
            r0.execute(r1)
            return
        L73:
            r0 = 0
            r309 = r0
            goto L2c
        L79:
            r0 = r303
            java.util.Map r0 = r0.A0B
            r308 = r0
            java.lang.String r0 = "uri_source"
            r306 = r0
            r0 = r308
            if (r0 == 0) goto L98
            r0 = r308
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            r309 = r0
            r0 = r309
            if (r0 != 0) goto Lae
        L98:
            r0 = r303
            java.util.Map r0 = r0.A0A
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lc8
            r0 = r308
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            r309 = r0
        Lae:
            r0 = r309
            boolean r0 = r0 instanceof android.net.Uri
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L51
            r0 = r309
            r305 = r0
            r0 = r309
            android.net.Uri r0 = (android.net.Uri) r0
            r305 = r0
            goto L51
        Lc8:
            r0 = 0
            r309 = r0
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.photos.base.debug.DebugImageTracker.A00(com.facebook.common.callercontext.CallerContext, X.5CI, X.3le):void");
    }

    public static final void A01(C3Qe c3Qe, DebugImageTracker debugImageTracker) {
        String str;
        if (c3Qe == null || !A03(debugImageTracker)) {
            return;
        }
        Locale locale = Locale.US;
        long j = -1;
        if (c3Qe.A00 != j) {
            if (c3Qe.A01 != j) {
                str = 1BK.A15(locale, "-%05.1fs", Arrays.copyOf(new Object[]{Double.valueOf((r0 - r0) / 1000.0d)}, 1));
                0fH.A0j("DebugImageTracker", 1BK.A15(locale, "(%s) %s %s \t->  %s %s \t|| %s", Arrays.copyOf(new Object[]{str, c3Qe.A07, c3Qe.A08, c3Qe.A0B, c3Qe.A0C, c3Qe.A0G}, 6)));
            }
        }
        str = "-N/A-";
        0fH.A0j("DebugImageTracker", 1BK.A15(locale, "(%s) %s %s \t->  %s %s \t|| %s", Arrays.copyOf(new Object[]{str, c3Qe.A07, c3Qe.A08, c3Qe.A0B, c3Qe.A0C, c3Qe.A0G}, 6)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (A03(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A02(int r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A05
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Br.A0B(r0)
            com.facebook.quicklog.QuickPerformanceLogger r0 = (com.facebook.quicklog.QuickPerformanceLogger) r0
            r304 = r0
            r0 = r304
            r1 = 42673451(0x28b252b, float:2.0445548E-37)
            r2 = r302
            boolean r0 = r0.isMarkerOn(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2b
            r0 = r301
            boolean r0 = A03(r0)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L30
        L2b:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L30:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.photos.base.debug.DebugImageTracker.A02(int):boolean");
    }

    public static final boolean A03(DebugImageTracker debugImageTracker) {
        return ((FbSharedPreferences) debugImageTracker.A04.A00.get()).AZn(1NW.A05, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (A03(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A04(com.facebook.photos.base.debug.DebugImageTracker r301) {
        /*
            r0 = 16385(0x4001, float:2.296E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2yD r0 = (X.2yD) r0
            r302 = r0
            r0 = 36315602050098385(0x8104d9000024d1, double:3.029471195449787E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2a
            r0 = r301
            boolean r0 = A03(r0)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L2d
        L2a:
            r0 = 0
            r305 = r0
        L2d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.photos.base.debug.DebugImageTracker.A04(com.facebook.photos.base.debug.DebugImageTracker):boolean");
    }

    public void C1M(CallerContext callerContext, 5CI r303, String str, int i, int i2, long j, long j2) {
        if (A04(this) || A02(i2)) {
            return;
        }
        A00(callerContext, r303, new 3bN(r303, this, str, i2, 0, j2));
    }

    public void C1N(CallerContext callerContext, 5CI r303, String str, int i, int i2, long j, long j2) {
        if (A04(this) || A02(i2)) {
            return;
        }
        A00(callerContext, r303, new 3bN(r303, this, str, i2, 1, j2));
    }

    public void C1O(CallerContext callerContext, ContextChain contextChain, 5CI r304, String str, String str2, int i, int i2, long j) {
        if (A04(this)) {
            return;
        }
        ((QuickPerformanceLogger) 1Br.A0B(this.A05)).markerStart(42673451, i2, j, TimeUnit.MILLISECONDS);
        if (A02(i2)) {
            return;
        }
        A00(callerContext, r304, new 3bO(contextChain, this, str2, str, i2, 0, j));
    }

    public void C1Q(CallerContext callerContext, 5CI r303, String str, String str2, int i, int i2, long j, long j2) {
        if (A04(this) || A02(i2)) {
            return;
        }
        A00(callerContext, r303, new 3bO(r303, this, str2, str, i2, 1, j2));
    }
}
