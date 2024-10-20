package com.facebook.blescan;

import X.0fH;
import X.C3e6;
import X.L2g;
import X.RQn;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: BleScanOperation.class */
public final class BleScanOperation extends C3e6 {
    public RQn A00;
    public L2g A01;
    public boolean A02;
    public final Context A03;
    public final ScheduledExecutorService A04;

    public BleScanOperation(Context context, L2g l2g, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = scheduledExecutorService;
        this.A03 = context;
        this.A01 = l2g;
    }

    public static void A00(BleScanOperation bleScanOperation) {
        boolean z;
        bleScanOperation.A02 = false;
        bleScanOperation.A00 = null;
        L2g l2g = bleScanOperation.A01;
        if (l2g != null) {
            synchronized (l2g) {
                z = l2g.A09;
            }
            if (z) {
                try {
                    bleScanOperation.A01.A01();
                } catch (Exception e) {
                    0fH.A0r("com.facebook.blescan.BleScanOperation", "Exception stopping BLE scanning", e);
                }
            }
            bleScanOperation.A01 = null;
        }
    }
}
