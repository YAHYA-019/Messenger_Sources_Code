package com.facebook.messaging.analytics.perf.events.events;

import X.1BJ;
import X.7zO;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: AIBotNuxCreateViewStart.class */
public final class AIBotNuxCreateViewStart extends PRELoggingStartEvent {
    public static final List A00 = 7zO.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "ai_bot_nux_create_view";
    }

    public String A3Z() {
        return 1BJ.A00(366);
    }

    public List B1L() {
        return A00;
    }
}
