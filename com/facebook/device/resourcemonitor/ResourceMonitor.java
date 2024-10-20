package com.facebook.device.resourcemonitor;

import X.0fH;
import X.1BQ;
import X.C00i;
import X.C3Vy;
import X.InterfaceC07964le;
import com.facebook.device.resourcemonitor.ResourceMonitor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: ResourceMonitor.class */
public final class ResourceMonitor {
    public boolean A00;
    public boolean A01;
    public ScheduledFuture A02;
    public final C00i A04 = new 1BQ(16464);
    public final Runnable A05 = new Runnable() { // from class: X.4ld
        public static final String __redex_internal_original_name = "ResourceMonitor$1";

        @Override // java.lang.Runnable
        public void run() {
            try {
                throw AnonymousClass001.A0Q("updateMemoryUsage");
            } catch (Exception e) {
                0fH.A0H(ResourceMonitor.class, "updateMemoryUsage throws", e);
            }
        }
    };
    public final InterfaceC07964le A03 = new C3Vy(this, 1);

    public static void A00(ResourceMonitor resourceMonitor) {
        synchronized (resourceMonitor) {
            if (resourceMonitor.A01 && resourceMonitor.A00 && resourceMonitor.A02 == null) {
                0fH.A0A(ResourceMonitor.class, "ResourceManager onStart");
                resourceMonitor.A02 = ((ScheduledExecutorService) resourceMonitor.A04.get()).scheduleAtFixedRate(resourceMonitor.A05, 0L, 3000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static void A01(ResourceMonitor resourceMonitor) {
        synchronized (resourceMonitor) {
            0fH.A0A(ResourceMonitor.class, "ResourceManager onStop");
            ScheduledFuture scheduledFuture = resourceMonitor.A02;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                resourceMonitor.A02 = null;
            }
        }
    }
}
