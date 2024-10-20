package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.6ud, reason: invalid class name */
/* loaded from: 6ud.class */
public final class C6ud implements Runnable {
    public static final String __redex_internal_original_name = "QPLDataNavigationLogger$11";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C06474gz A01;

    public C6ud(C06474gz c06474gz, int i) {
        this.A01 = c06474gz;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((LightweightQuickPerformanceLogger) this.A01.A07.get()).markerAnnotate(25821186, this.A00, "is_from_datafetch_helper", true);
    }
}
