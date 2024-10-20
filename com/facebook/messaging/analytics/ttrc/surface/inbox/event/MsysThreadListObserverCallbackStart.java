package com.facebook.messaging.analytics.ttrc.surface.inbox.event;

import X.C0s8;
import X.C1qg;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: MsysThreadListObserverCallbackStart.class */
public final class MsysThreadListObserverCallbackStart extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final String A00;

    public MsysThreadListObserverCallbackStart(C1qg c1qg, String str) {
        super(c1qg);
        this.A00 = str;
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return "com.facebook.messaging.analytics.ttrc.surface.inbox.event.MsysThreadListObserverCallbackStart";
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A01;
    }
}
