package com.facebook.messaging.analytics.ttrc.surface.inbox.event;

import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: MsysThreadListObserverQueryEnd.class */
public final class MsysThreadListObserverQueryEnd extends PRELoggingEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return "com.facebook.messaging.analytics.ttrc.surface.inbox.event.MsysThreadListObserverQueryEnd";
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A00;
    }
}
