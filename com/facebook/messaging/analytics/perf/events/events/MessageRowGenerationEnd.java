package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: MessageRowGenerationEnd.class */
public final class MessageRowGenerationEnd extends PRELoggingEndEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.MessageRowGenerationEnd";
    }

    public List B1L() {
        return A00;
    }
}
