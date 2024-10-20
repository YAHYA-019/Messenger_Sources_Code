package X;

import android.os.PowerManager;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Hfe.class */
public final class Hfe {
    public final PowerManager A00;
    public final C0dr A01;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final ScheduledExecutorService A03;

    public Hfe() {
        PowerManager powerManager = (PowerManager) 1Hv.A02(GOp.A09(), 100179);
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16461);
        this.A00 = powerManager;
        this.A01 = c0dr;
        this.A03 = scheduledExecutorService;
    }
}
