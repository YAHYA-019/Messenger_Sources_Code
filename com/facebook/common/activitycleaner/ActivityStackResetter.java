package com.facebook.common.activitycleaner;

import X.1BQ;
import X.AbstractC05764eu;
import X.C00i;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ActivityStackResetter.class */
public final class ActivityStackResetter {
    public WeakReference A00;
    public final C00i A02 = 1BQ.A02(16433);
    public final C00i A01 = 1BQ.A02(16817);
    public final C00i A03 = 1BQ.A02(84488);
    public final AtomicReference A04 = new AtomicReference(null);

    public static void A00(ActivityStackResetter activityStackResetter) {
        Future future = (Future) activityStackResetter.A04.getAndSet(null);
        if (future != null) {
            future.cancel(true);
        }
        AbstractC05764eu.A00.remove(ActivityStackResetter.class.getName());
        activityStackResetter.A00 = null;
    }
}
