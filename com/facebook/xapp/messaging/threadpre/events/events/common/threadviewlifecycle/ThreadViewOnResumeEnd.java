package com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle;

import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: ThreadViewOnResumeEnd.class */
public final class ThreadViewOnResumeEnd extends PRELoggingEndEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadKey A00;

    public ThreadViewOnResumeEnd(ThreadKey threadKey, int i) {
        super(i);
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnResumeEnd";
    }

    public List B1L() {
        return A01;
    }
}
