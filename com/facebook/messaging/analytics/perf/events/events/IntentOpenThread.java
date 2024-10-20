package com.facebook.messaging.analytics.perf.events.events;

import X.1BK;
import X.7zQ;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: IntentOpenThread.class */
public final class IntentOpenThread extends PRELoggingEvent {
    public static final List A01 = 7zQ.A13();
    public final ThreadKey A00;

    public IntentOpenThread(ThreadKey threadKey) {
        super(1BK.A01(threadKey));
        this.A00 = threadKey;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "intent/open_thread";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.IntentOpenThread";
    }

    public List B1L() {
        return A01;
    }
}
