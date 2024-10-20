package com.facebook.papaya.mldw;

import X.C0il;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: Event.class */
public final class Event {
    public static final Event $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0il.A0B("papaya-mldw");
    }

    public Event(long j, ImmutableMap immutableMap) {
        this.mHybridData = initHybrid(j, immutableMap);
    }

    public static native HybridData initHybrid(long j, Map map);
}
