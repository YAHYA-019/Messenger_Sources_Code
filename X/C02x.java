package X;

import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.lang.Thread;

/* renamed from: X.02x, reason: invalid class name */
/* loaded from: 02x.class */
public final class C02x implements C0iO {
    public static C02x A07;
    public final 0gK A01;
    public final C02v A02;
    public final 0nK A03;
    public final 0jH A04;
    public final 0Wl A05;
    public final Object A06 = new Object();
    public int A00 = 1;

    public C02x(0gK r302, C02v c02v, 0nK r304, 0jH r305, 0Wl r306) {
        this.A04 = r305;
        this.A01 = r302;
        this.A02 = c02v;
        this.A05 = r306;
        this.A03 = r304;
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
        return 0iP.A0D;
    }

    @Override // X.C0iO
    public void start() {
        C0ix.A00("JavascriptCrashDetector");
        A07 = this;
        if (0cQ.A01() != null) {
            0cQ.A03(new 0pH(this, 1), 100);
        } else {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0ik
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    0nK r0 = C02x.this.A03;
                    11T.A0H(thread, th);
                    r0.A00.A3j(thread, th);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }
}
