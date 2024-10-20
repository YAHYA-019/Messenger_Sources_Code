package com.facebook.messaging.analytics.perf;

import X.1Bi;
import X.C00p;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: MessagingInteractionStateManager.class */
public final class MessagingInteractionStateManager {
    public final C00p A00 = new C00p(10);
    public final QuickPerformanceLogger A01 = (QuickPerformanceLogger) 1Bi.A03(16520);

    public static final void A00(MessagingInteractionStateManager messagingInteractionStateManager, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        C00p c00p = messagingInteractionStateManager.A00;
        synchronized (c00p) {
            c00p.A0C(j, true);
        }
    }

    public final void A01(int i, int i2, short s) {
        C00p c00p = this.A00;
        synchronized (c00p) {
            c00p.A0A((i2 & 4294967295L) | (i << 32));
        }
        this.A01.markerEnd(i, i2, s);
    }
}
