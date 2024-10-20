package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: IsCutOverThread.class */
public final class IsCutOverThread extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final boolean A00;

    public IsCutOverThread(int i, boolean z) {
        super(i);
        this.A00 = z;
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.IsCutOverThread";
    }

    public List B1L() {
        return A01;
    }
}
