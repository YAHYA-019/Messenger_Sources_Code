package com.facebook.messaging.analytics.ttrc.surface.inbox.event;

import X.0Pz;
import X.11T;
import X.C0s8;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;
import java.util.List;

/* loaded from: MsysThreadListObserverCallbackFail.class */
public final class MsysThreadListObserverCallbackFail extends PRELoggingEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.pre.event.PRELoggingEvent");
    public final String A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysThreadListObserverCallbackFail(String str, String str2) {
        super(0Pz.A0j("query/thread_list/observer_callback/", str, "/fail"));
        11T.A0F(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }
}
