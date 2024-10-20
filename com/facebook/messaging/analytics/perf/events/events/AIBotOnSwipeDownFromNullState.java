package com.facebook.messaging.analytics.perf.events.events;

import X.11T;
import X.1BJ;
import X.1BK;
import X.4YT;
import X.7zQ;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: AIBotOnSwipeDownFromNullState.class */
public final class AIBotOnSwipeDownFromNullState extends PRELoggingEvent {
    public static final List A01 = 7zQ.A13();
    public final ThreadKey A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIBotOnSwipeDownFromNullState(ThreadKey threadKey) {
        super(1BK.A01(threadKey));
        11T.A0F(threadKey, 1);
        this.A00 = threadKey;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return 4YT.A00(1355);
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return 1BJ.A00(367);
    }

    public List B1L() {
        return A01;
    }
}
