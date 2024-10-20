package com.facebook.messaging.analytics.perf.events.events;

import X.1BK;
import X.7zQ;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: BubblesToggleThread.class */
public final class BubblesToggleThread extends PRELoggingEvent {
    public static final List A02 = 7zQ.A13();
    public final String A00;
    public final ThreadKey A01;

    public BubblesToggleThread(ThreadKey threadKey, String str) {
        super(1BK.A01(threadKey));
        this.A01 = threadKey;
        this.A00 = str;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "bubbles_toggle_thread";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.BubblesToggleThread";
    }

    public List B1L() {
        return A02;
    }
}
