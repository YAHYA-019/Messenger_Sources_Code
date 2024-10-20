package com.facebook.messaging.analytics.perf.events.events;

import X.1BJ;
import X.7zO;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: AIBotNuxCreateViewEnd.class */
public final class AIBotNuxCreateViewEnd extends PRELoggingEndEvent {
    public static final List A00 = 7zO.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "ai_bot_nux_create_view";
    }

    public String A3Z() {
        return 1BJ.A00(365);
    }

    public List B1L() {
        return A00;
    }
}
