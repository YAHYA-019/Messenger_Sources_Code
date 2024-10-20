package com.facebook.messaging.analytics.perf.events.events;

import X.7zQ;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: CallScreenOpenThread.class */
public final class CallScreenOpenThread extends PRELoggingEvent {
    public static final List A01 = 7zQ.A13();
    public final ThreadKey A00;

    public CallScreenOpenThread(ThreadKey threadKey, int i) {
        super(i);
        this.A00 = threadKey;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "show_thread";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.CallScreenOpenThread";
    }

    public List B1L() {
        return A01;
    }
}
