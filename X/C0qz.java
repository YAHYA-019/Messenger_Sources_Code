package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.0qz, reason: invalid class name */
/* loaded from: 0qz.class */
public final class C0qz implements C1A0 {
    public final LightweightQuickPerformanceLogger A00;

    public C0qz(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        11T.A0F(lightweightQuickPerformanceLogger, 1);
        this.A00 = lightweightQuickPerformanceLogger;
    }

    @Override // X.C1A0
    public void Btd(int i, String str) {
        this.A00.markerAnnotate(11341239, i, "dex_loaded", true);
    }

    @Override // X.C1A0
    public void C3z(int i, String str, String[] strArr) {
        11T.A0F(strArr, 2);
        this.A00.markerAnnotate(11341239, i, "dependent_modules", strArr);
    }

    @Override // X.C1A0
    public void C4i(int i, String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        short s = 3;
        if (z) {
            s = 2;
        }
        lightweightQuickPerformanceLogger.markerEnd(11341239, i, s);
    }

    @Override // X.C1A0
    public void C4j(int i, String str) {
        11T.A0F(str, 1);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        lightweightQuickPerformanceLogger.markerStart(11341239, i);
        lightweightQuickPerformanceLogger.markerAnnotate(11341239, i, "module_name", str);
    }

    @Override // X.C1A0
    public void C4k(String str) {
    }

    @Override // X.C1A0
    public void C8Q(int i, String str) {
        this.A00.markerAnnotate(11341239, i, "native_lib_loaded", true);
    }
}
