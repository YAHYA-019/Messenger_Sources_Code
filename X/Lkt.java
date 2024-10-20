package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: Lkt.class */
public final class Lkt implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayFbLocationManager$ClientCallback$1";
    public final /* synthetic */ LcG A00;

    public Lkt(LcG lcG) {
        this.A00 = lcG;
    }

    @Override // java.lang.Runnable
    public void run() {
        short s;
        String str;
        String str2;
        Ju8 ju8 = this.A00.A00;
        synchronized (ju8) {
            if (ju8.A02) {
                s = 2;
                if (!ju8.A0H()) {
                    if (ju8.A0G() && ((LDH) ju8).A0C.A03()) {
                        str = "cached location used and minimizeLocationAccess";
                        0fH.A0j("GooglePlayFbLocationManager", str);
                        str2 = "end_reason";
                    } else {
                        C5ey c5ey = ((LDH) ju8).A0C.A05;
                        if (c5ey != null && c5ey.A00.AZk(36310714379600876L)) {
                            str = "OS Subscriptions are disabled";
                            0fH.A0j("GooglePlayFbLocationManager", str);
                            str2 = "end_reason";
                        }
                    }
                    ju8.A0D(str2, str);
                }
                0fH.A0j("GooglePlayFbLocationManager", "Subscribing to underlying OS Location Provider");
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = ((LDH) ju8).A0E;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerPoint(794437326, "os_subscribed");
                }
                ju8.A0F((short) 2);
                ju8.A06.execute(new Lks(ju8));
            } else {
                Ju8.A00(ju8, true);
                ju8.A0D("end_reason", "stopped");
                s = 3;
            }
            ju8.A0F(s);
        }
    }
}
