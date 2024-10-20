package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;

/* renamed from: X.4qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qg.class */
public final class C09554qg implements 1aR {
    public 1Mw A00;
    public final C00i A01;
    public final AbstractC00401az A02;
    public final C1Zg A03;

    public C09554qg() {
        C1Zg c1Zg = (C1Zg) 1Bn.A0A(33057);
        1Mw r0 = (1Mw) 1Bn.A0A(67127);
        this.A03 = c1Zg;
        this.A02 = c1Zg.A00("stale_removal");
        this.A00 = r0;
        this.A01 = new 1BQ(68406);
    }

    public /* bridge */ /* synthetic */ void CAv(1Z6 r302, 1Yu r303, File file) {
        1ZA r0 = (1ZA) r303;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) this.A01.get();
        try {
            lightweightQuickPerformanceLogger.markerStart(38469637);
            if (lightweightQuickPerformanceLogger.isMarkerOn(38469637, true)) {
                lightweightQuickPerformanceLogger.markerAnnotate(38469637, "feature", r302.A03);
                lightweightQuickPerformanceLogger.markerAnnotate(38469637, "plugin", "stale_removal");
            }
            1BK.A1E(this.A03.A01).execute(new SEK(r302, this, r0, file));
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(38469637, (short) 2);
        }
    }
}
