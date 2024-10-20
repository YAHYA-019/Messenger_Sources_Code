package X;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* renamed from: X.05n, reason: invalid class name */
/* loaded from: 05n.class */
public final class C05n implements C0iO {
    public final 0gK A00;
    public final 0iP A01;
    public final Application A02;

    public C05n(Application application, 0gK r303, 0iP r304) {
        this.A02 = application;
        this.A01 = r304;
        this.A00 = r303;
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
        return 0iP.A0J;
    }

    @Override // X.C0iO
    public void start() {
        0fH.A0l("lacrima", "start memory trim listener");
        this.A02.registerComponentCallbacks(new ComponentCallbacks2() { // from class: X.05p
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                if (i >= 80 || (i >= 10 && i <= 15)) {
                    C05n c05n = C05n.this;
                    0fH.A0h(Integer.valueOf(i), "lacrima", "memory trim level %d");
                    synchronized (c05n.A01) {
                        C0qh c0qh = new C0qh(null);
                        0gK r0 = c05n.A00;
                        r0.A0A(c0qh, C0gq.CRITICAL_REPORT, c05n);
                        r0.A0A(c0qh, C0gq.LARGE_REPORT, c05n);
                    }
                }
            }
        });
    }
}
