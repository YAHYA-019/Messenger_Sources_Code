package com.facebook.messaging.analytics.ttrc.surface.inbox.event;

import X.0Pz;
import X.11T;
import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: MsysThreadListObserverCallbackEnd.class */
public final class MsysThreadListObserverCallbackEnd extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysThreadListObserverCallbackEnd(String str) {
        super(0Pz.A0W("query/thread_list/observer_callback/", str), "_end");
        11T.A0F(str, 1);
        this.A00 = str;
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return "com.facebook.messaging.analytics.ttrc.surface.inbox.event.MsysThreadListObserverCallbackEnd";
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A01;
    }
}
