package com.facebook.messaging.analytics.perf.events.events;

import X.11T;
import X.1BK;
import X.4YT;
import X.7zO;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: AIBotSuggestedPromptsQueryStart.class */
public final class AIBotSuggestedPromptsQueryStart extends PRELoggingStartEvent {
    public static final List A01 = 7zO.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadKey A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIBotSuggestedPromptsQueryStart(ThreadKey threadKey) {
        super(1BK.A01(threadKey));
        11T.A0F(threadKey, 1);
        this.A00 = threadKey;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return 4YT.A00(1509);
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "/start";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.AIBotSuggestedPromptsQueryStart";
    }

    public List B1L() {
        return A01;
    }
}
