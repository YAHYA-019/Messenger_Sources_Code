package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: MessageRowGenerationStart.class */
public final class MessageRowGenerationStart extends PRELoggingStartEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.MessageRowGenerationStart";
    }

    public List B1L() {
        return A00;
    }
}
