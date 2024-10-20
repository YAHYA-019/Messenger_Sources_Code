package com.facebook.messaging.analytics.ttrc.surface.appstart.events;

import X.1BJ;
import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: OnPossibleWarmStart.class */
public final class OnPossibleWarmStart extends PRELoggingEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return 1BJ.A00(1146);
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A00;
    }
}
