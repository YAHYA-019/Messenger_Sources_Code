package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: ThreadViewParallelFetchEnd.class */
public final class ThreadViewParallelFetchEnd extends PRELoggingEndEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.ThreadViewParallelFetchEnd";
    }

    public List B1L() {
        return A00;
    }
}
