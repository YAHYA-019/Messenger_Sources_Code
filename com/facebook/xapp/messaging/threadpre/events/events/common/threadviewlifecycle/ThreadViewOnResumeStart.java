package com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle;

import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: ThreadViewOnResumeStart.class */
public final class ThreadViewOnResumeStart extends PRELoggingStartEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadKey A00;

    public ThreadViewOnResumeStart(ThreadKey threadKey, int i) {
        super(i);
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnResumeStart";
    }

    public List B1L() {
        return A01;
    }
}
