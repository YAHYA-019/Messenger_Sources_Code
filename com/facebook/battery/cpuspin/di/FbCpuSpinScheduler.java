package com.facebook.battery.cpuspin.di;

import X.0fH;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.2yD;
import X.5DV;
import X.5DW;
import X.5Da;
import X.5Db;
import X.5Dd;
import X.5De;
import X.C00i;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: FbCpuSpinScheduler.class */
public final class FbCpuSpinScheduler {
    public static boolean A04;
    public static boolean A05;
    public final 5Da A00;
    public final 5Da A01;
    public final 5De A02;
    public final C00i A03 = new 1BQ(16616);

    public FbCpuSpinScheduler() {
        5DV r0 = (5DV) 1Bi.A03(49594);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bn.A0A(49595);
        5DW r02 = (5DW) 1Bn.A0A(49596);
        C00i c00i = r0.A00;
        long Auy = ((2yD) c00i.get()).Auy(36592133519638971L);
        long Auy2 = ((2yD) c00i.get()).Auy(36592133519573434L);
        0fH.A0W(Long.valueOf(Auy), FbCpuSpinScheduler.class, "Initializing CPU spin detector with config FG period = %d, BG period = %d", Long.valueOf(Auy2));
        this.A01 = new 5Da("foreground", ((2yD) c00i.get()).Auy(36592133519966654L), ((2yD) c00i.get()).Auy(36592133519770044L), Auy);
        this.A00 = new 5Da("background", ((2yD) c00i.get()).Auy(36592133520032191L), ((2yD) c00i.get()).Auy(36592133519901117L), Auy2);
        this.A02 = new 5De(((2yD) c00i.get()).AZk(2342153667757343566L) ? new 5Db(this) : new 5Dd(), r02, scheduledExecutorService);
    }
}
