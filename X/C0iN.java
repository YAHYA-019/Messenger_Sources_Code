package X;

import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0iN, reason: invalid class name */
/* loaded from: 0iN.class */
public final class C0iN implements C0iO {
    public final 0gK A00;
    public final int A01;
    public final 0jH A02;
    public final C15h A03;
    public final boolean A04;

    public C0iN(0gK r302, 0jH r303, C15h c15h, int i, boolean z) {
        this.A02 = r303;
        this.A00 = r302;
        this.A03 = c15h;
        this.A04 = z;
        this.A01 = i;
    }

    public static void A00(C0iN c0iN, File file, File file2, int i) {
        File A0D = AnonymousClass001.A0D(file, "anr_state.txt");
        C0qh A00 = C0qh.A00();
        if (i > 0) {
            C0qh.A01(C0g6.A16, A00, i);
        }
        C0qh.A01(C0g6.A3E, A00, (file2 != null ? file2.lastModified() : A0D.lastModified()) / 1000);
        C0qh.A01(C0g6.A1X, A00, System.currentTimeMillis() / 1000);
        if (file2 != null) {
            A00.A06(0gD.A02, C0gq.CRITICAL_REPORT, file2);
        }
        if (C0iz.A03) {
            A00.A02(C0g6.A0C, true);
        }
        int i2 = C0gp.A01;
        if (i2 == 2 || C0gp.A00()) {
            0gK r0 = c0iN.A00;
            C0gq c0gq = C0gq.CRITICAL_REPORT;
            r0.A0E(c0gq, c0iN);
            r0.A09(A00, c0gq, c0iN);
            r0.A0D(c0gq, c0iN);
            return;
        }
        if (i2 == 1) {
            0gK r02 = c0iN.A00;
            C0gq c0gq2 = C0gq.CRITICAL_REPORT;
            r02.A0E(c0gq2, c0iN);
            r02.A09(A00, c0gq2, c0iN);
            Executors.newScheduledThreadPool(1).schedule((Runnable) new 0iY(c0iN), 1200L, TimeUnit.MILLISECONDS);
        }
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
        return 0iP.A04;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    @Override // X.C0iO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0iN.start():void");
    }
}
