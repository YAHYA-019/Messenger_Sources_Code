package com.facebook.messaging.analytics.ttrc.surface.appstart.events;

import X.0Pz;
import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: IntentHandled.class */
public final class IntentHandled extends PRELoggingEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");

    public IntentHandled(Integer num) {
        super(0Pz.A0W("intent/", num.intValue() != 0 ? "THREAD_VIEW" : "INBOX"));
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return "com.facebook.messaging.analytics.ttrc.surface.appstart.events.IntentHandled";
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A00;
    }
}
