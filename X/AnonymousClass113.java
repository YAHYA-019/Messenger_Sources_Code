package X;

import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.113, reason: invalid class name */
/* loaded from: 113.class */
public final class AnonymousClass113 implements C0iO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C0fa A03;
    public final 0gK A04;
    public final 0jH A05;
    public final C15h A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final /* synthetic */ 0tA A0A;

    public AnonymousClass113(C0fa c0fa, 0gK r303, 0jH r304, 0tA r305, C15h c15h, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A0A = r305;
        this.A05 = r304;
        this.A04 = r303;
        this.A09 = z;
        this.A02 = i;
        this.A07 = z2;
        this.A00 = i2;
        this.A08 = z3;
        this.A01 = i3;
        this.A06 = c15h;
        this.A03 = c0fa;
    }

    public static void A00(final AnonymousClass113 anonymousClass113, int i, long j) {
        C0qh A00 = C0qh.A00();
        if (i > 0) {
            C0qh.A01(C0g6.A16, A00, i);
        }
        C0qh.A01(C0g6.A3E, A00, j / 1000);
        C0qh.A01(C0g6.A1X, A00, System.currentTimeMillis() / 1000);
        A00.A05(C0g6.A4x, "unexplained");
        if (C0iz.A03) {
            A00.A02(C0g6.A0C, true);
        }
        int i2 = C0gp.A01;
        if (i2 == 2 || C0gp.A00()) {
            0gK r0 = anonymousClass113.A04;
            C0gq c0gq = C0gq.CRITICAL_REPORT;
            r0.A0E(c0gq, anonymousClass113);
            r0.A09(A00, c0gq, anonymousClass113);
            r0.A0D(c0gq, anonymousClass113);
            return;
        }
        if (i2 == 1) {
            0gK r02 = anonymousClass113.A04;
            C0gq c0gq2 = C0gq.CRITICAL_REPORT;
            r02.A0E(c0gq2, anonymousClass113);
            r02.A09(A00, c0gq2, anonymousClass113);
            Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: X.0ih
                public static final String __redex_internal_original_name = "UnexplainedAppDeathEarlyDetector$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass113 anonymousClass1132 = AnonymousClass113.this;
                    if (0gK.A0K.contains("UnexplainedAppDeathDetector")) {
                        return;
                    }
                    anonymousClass1132.A04.A0D(C0gq.CRITICAL_REPORT, anonymousClass1132);
                }
            }, 1200L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r0.toLowerCase(java.util.Locale.US).contains("remove task") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ java.lang.Boolean A01(long r302, long r304) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto L96
            r0 = 15000(0x3a98, double:7.411E-320)
            r307 = r0
            r0 = r304
            r1 = r307
            long r0 = r0 + r1
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 > 0) goto L96
            X.0hH r0 = X.0hH.A03
            r309 = r0
            r0 = r309
            if (r0 == 0) goto La2
            r0 = r309
            int r0 = r0.A01()
            r310 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r311 = r0
            r0 = 30
            r306 = r0
            r0 = r311
            r1 = r306
            if (r0 < r1) goto L96
            r0 = r310
            if (r0 == 0) goto L96
            r0 = r301
            X.0fa r0 = r0.A03
            r1 = r310
            X.0FL r0 = r0.A00(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L96
            r0 = r309
            java.lang.String r0 = r0.A08()
            r312 = r0
            r0 = r309
            int r0 = r0.A03()
            r311 = r0
            r0 = 10
            r306 = r0
            r0 = r311
            r1 = r306
            if (r0 != r1) goto L96
            r0 = r312
            if (r0 == 0) goto L96
            java.util.Locale r0 = java.util.Locale.US
            r309 = r0
            r0 = r312
            r1 = r309
            java.lang.String r0 = r0.toLowerCase(r1)
            r313 = r0
            java.lang.String r0 = "remove task"
            r309 = r0
            r0 = r313
            r1 = r309
            boolean r0 = r0.contains(r1)
            r306 = r0
            r0 = 1
            r311 = r0
            r0 = r306
            if (r0 != 0) goto L9c
        L96:
            r0 = 0
            r311 = r0
            r0 = 0
            r313 = r0
        L9c:
            r0 = r311
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        La2:
            java.lang.String r0 = "Did you call PreviousSessionHelper.init?"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass113.A01(long, long):java.lang.Boolean");
    }

    @Override // X.C0iO
    public /* synthetic */ int getHealthEventSamplingRate() {
        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A0V;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */
    @Override // X.C0iO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass113.start():void");
    }
}
