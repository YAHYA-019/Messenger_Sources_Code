package X;

import com.facebook.device.resourcemonitor.ResourceMonitor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Vy, reason: invalid class name */
/* loaded from: 3Vy.class */
public final class C3Vy implements InterfaceC07964le {
    public final int A00;
    public final Object A01;

    public C3Vy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC07964le
    public final void CIz(boolean z) {
        switch (this.A00) {
            case 0:
                C08124ly c08124ly = (C08124ly) this.A01;
                String str = C08124ly.A07;
                0fH.A0D(C08124ly.class, z ? "onScreenOn" : "onScreenOff");
                if (!z) {
                    c08124ly.A05 = 1BL.A08(c08124ly.A04);
                }
                c08124ly.A01.CkT(z ? C08124ly.A06 : C08124ly.A07);
                return;
            case 1:
                ResourceMonitor resourceMonitor = (ResourceMonitor) this.A01;
                resourceMonitor.A01 = z;
                if (z) {
                    ResourceMonitor.A00(resourceMonitor);
                    return;
                } else {
                    ResourceMonitor.A01(resourceMonitor);
                    return;
                }
            default:
                String A00 = 4YT.A00(699);
                if (!z) {
                    0fH.A0j(A00, "Received a screen off event.");
                    C08104lw c08104lw = (C08104lw) this.A01;
                    if (c08104lw.A01 == null) {
                        c08104lw.A01 = c08104lw.A0E.schedule(c08104lw.A0D, 15000L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    return;
                }
                0fH.A0j(A00, "Received a screen on event.");
                C08104lw c08104lw2 = (C08104lw) this.A01;
                ScheduledFuture scheduledFuture = c08104lw2.A01;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    c08104lw2.A01 = null;
                    return;
                }
                return;
        }
    }
}
