package X;

import android.app.Application;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* renamed from: X.00H, reason: invalid class name */
/* loaded from: 00H.class */
public final class C00H implements C0iO {
    public final int A00;
    public final Application A01;
    public final 0gK A02;
    public final 0jH A03;
    public final C15h A04;
    public final boolean A05;

    public C00H(Application application, 0gK r303, 0jH r304, C15h c15h, int i, boolean z) {
        this.A01 = application;
        this.A03 = r304;
        this.A02 = r303;
        this.A05 = z;
        this.A00 = i;
        this.A04 = c15h;
    }

    public static void A00(0gG r301, 0gK r302, C0gq c0gq) {
        C0iO A07 = r302.A07(C00H.class);
        if (A07 != null) {
            r302.A08(r301, c0gq, A07);
            return;
        }
        C0iy.A00().Bwu("NativeCrashDetector.addExtraCollector", AnonymousClass001.A0T("Unable to add extra collector to NativeCrashDetector"), 0gG.A00(r301, c0gq));
        0fH.A0n("lacrima", "Cannot find registered detector");
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
        return 0iP.A0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x03bd, code lost:
    
        if (X.C0gy.A01(X.C0gz.NATIVE, r0.A01) == false) goto L74;
     */
    @Override // X.C0iO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00H.start():void");
    }
}
