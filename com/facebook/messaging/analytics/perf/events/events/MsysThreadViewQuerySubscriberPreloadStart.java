package com.facebook.messaging.analytics.perf.events.events;

import X.1BK;
import X.4YT;
import X.7zO;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: MsysThreadViewQuerySubscriberPreloadStart.class */
public final class MsysThreadViewQuerySubscriberPreloadStart extends PRELoggingStartEvent {
    public static final List A00 = 7zO.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    public MsysThreadViewQuerySubscriberPreloadStart(ThreadKey threadKey) {
        super(1BK.A01(threadKey));
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return 4YT.A00(1315);
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.MsysThreadViewQuerySubscriberPreloadStart";
    }

    public List B1L() {
        return A00;
    }
}
