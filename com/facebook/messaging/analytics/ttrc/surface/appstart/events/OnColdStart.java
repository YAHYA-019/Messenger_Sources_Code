package com.facebook.messaging.analytics.ttrc.surface.appstart.events;

import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: OnColdStart.class */
public final class OnColdStart extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final long A00;

    public OnColdStart(long j) {
        super("cold_start");
        this.A00 = j;
    }
}
