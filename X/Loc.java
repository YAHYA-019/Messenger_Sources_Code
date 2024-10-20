package X;

import android.content.ComponentName;

/* loaded from: Loc.class */
public final class Loc implements Runnable {
    public static final String __redex_internal_original_name = "zzax";
    public final /* synthetic */ ComponentName A00;
    public final /* synthetic */ LFj A01;

    public Loc(ComponentName componentName, LFj lFj) {
        this.A01 = lFj;
        this.A00 = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K6i k6i = this.A01.A02;
        ComponentName componentName = this.A00;
        L0g.A00();
        if (k6i.A00 != null) {
            k6i.A00 = null;
            k6i.A0D("Disconnected from device AnalyticsService", componentName);
            K6c k6c = ((LCw) k6i).A00.A06;
            L9t.A02(k6c);
            k6c.A0I();
            L0g.A00();
            K6k k6k = k6c.A00;
            L0g.A00();
            k6k.A0I();
            LCw.A0A(k6k, "Service disconnected", 2);
        }
    }
}
