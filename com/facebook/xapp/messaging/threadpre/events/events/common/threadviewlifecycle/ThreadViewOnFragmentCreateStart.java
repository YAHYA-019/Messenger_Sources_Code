package com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle;

import X.11T;
import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: ThreadViewOnFragmentCreateStart.class */
public final class ThreadViewOnFragmentCreateStart extends PRELoggingStartEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadKey A00;
    public final HeterogeneousMap A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadViewOnFragmentCreateStart(ThreadKey threadKey, HeterogeneousMap heterogeneousMap, int i) {
        super(i);
        11T.A0F(heterogeneousMap, 3);
        this.A00 = threadKey;
        this.A01 = heterogeneousMap;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnFragmentCreateStart";
    }

    public List B1L() {
        return A02;
    }
}
