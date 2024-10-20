package com.facebook.messaging.analytics.perf.events.events;

import X.11T;
import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: AIBotSuggestedPromptsQueryEnd.class */
public final class AIBotSuggestedPromptsQueryEnd extends PRELoggingEndEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadKey A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIBotSuggestedPromptsQueryEnd(ThreadKey threadKey) {
        super(threadKey.A0u().hashCode());
        11T.A0F(threadKey, 1);
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.AIBotSuggestedPromptsQueryEnd";
    }

    public List B1L() {
        return A01;
    }
}
