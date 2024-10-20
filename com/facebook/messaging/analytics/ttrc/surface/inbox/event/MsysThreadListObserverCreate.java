package com.facebook.messaging.analytics.ttrc.surface.inbox.event;

import X.11T;
import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: MsysThreadListObserverCreate.class */
public final class MsysThreadListObserverCreate extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysThreadListObserverCreate(String str, String str2) {
        super("query/thread_list/observer_create", str2);
        11T.A0F(str, 1);
        this.A00 = str;
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public String A3Z() {
        return "com.facebook.messaging.analytics.ttrc.surface.inbox.event.MsysThreadListObserverCreate";
    }

    @Override // com.facebook.xapp.messaging.pre.event.PRELoggingEvent
    public List B1L() {
        return A01;
    }
}
