package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: OpenGroupThread.class */
public final class OpenGroupThread extends PRELoggingEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final long A00;
    public final ThreadKey A01;

    public OpenGroupThread(ThreadKey threadKey, long j) {
        super(threadKey.A0u().hashCode());
        this.A01 = threadKey;
        this.A00 = j;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.OpenGroupThread";
    }

    public List B1L() {
        return A02;
    }
}
