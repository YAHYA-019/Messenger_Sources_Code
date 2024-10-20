package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1lL, reason: invalid class name */
/* loaded from: 1lL.class */
public final class C1lL implements Runnable {
    public static final String __redex_internal_original_name = "AppInitMetricTracker$onRequirementComplete$1$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1Bp A02;
    public final /* synthetic */ boolean A03;

    public C1lL(1Bp r302, int i, long j, boolean z) {
        this.A02 = r302;
        this.A01 = j;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1Bp r0 = this.A02;
        Integer num = r0.A00;
        if (num == null) {
            throw 1BK.A0h();
        }
        int intValue = num.intValue();
        long j = this.A01;
        int i = this.A00;
        boolean z = this.A03;
        C00j.A05("AppInitMetricTracker.onAppInitEnd", -617702276);
        try {
            C00i c00i = r0.A04.A00;
            ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "maxConcurrentInits", Runtime.getRuntime().availableProcessors() + 1);
            ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "isForeground", z);
            ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "coldStartMode", i);
            String A03 = C0di.A00().A03();
            if (A03 != null) {
                ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "processShortName", A03);
            }
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c00i.get();
            String str = 0FR.A05;
            if (str == null) {
                str = 0RF.A03;
            }
            lightweightQuickPerformanceLogger.markerAnnotate(intValue, "firstComponentName", str);
            ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "firstComponentType", (0FR.A05 != null || 0RF.A03 == null) ? 0FR.A06 : "provider");
            ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "tentativeFirstComponentIsAProviderName", 0RF.A03);
            ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(intValue, "firstIntentAction", 0FR.A07);
            r0.A02.A00.get();
            ((LightweightQuickPerformanceLogger) c00i.get()).markerEnd(intValue, (short) 2, j, TimeUnit.MILLISECONDS);
            C00j.A01(-1623019522);
        } catch (Throwable th) {
            C00j.A01(529763464);
            throw th;
        }
    }
}
