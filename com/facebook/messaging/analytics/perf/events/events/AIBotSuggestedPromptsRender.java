package com.facebook.messaging.analytics.perf.events.events;

import X.11T;
import X.1BK;
import X.7zQ;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: AIBotSuggestedPromptsRender.class */
public final class AIBotSuggestedPromptsRender extends PRELoggingEvent {
    public static final List A02 = 7zQ.A13();
    public final int A00;
    public final ThreadKey A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIBotSuggestedPromptsRender(ThreadKey threadKey, int i) {
        super(1BK.A01(threadKey));
        11T.A0F(threadKey, 1);
        this.A01 = threadKey;
        this.A00 = i;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "suggested_prompts/render";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.AIBotSuggestedPromptsRender";
    }

    public List B1L() {
        return A02;
    }
}
