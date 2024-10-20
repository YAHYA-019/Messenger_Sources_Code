package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.1ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ax.class */
public final class C00381ax extends AbstractC00401az {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;
    public final C00361av A02;
    public final boolean A03;

    public C00381ax(C00361av c00361av, String str) {
        super(str);
        this.A01 = (LightweightQuickPerformanceLogger) C00361av.A03.get();
        this.A03 = C00361av.A02.A41;
        this.A02 = c00361av;
        this.A00 = str.hashCode();
    }
}
