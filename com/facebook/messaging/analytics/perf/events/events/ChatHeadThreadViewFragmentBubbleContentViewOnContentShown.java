package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: ChatHeadThreadViewFragmentBubbleContentViewOnContentShown.class */
public final class ChatHeadThreadViewFragmentBubbleContentViewOnContentShown extends PRELoggingEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "chat_head_on_content_shown";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.ChatHeadThreadViewFragmentBubbleContentViewOnContentShown";
    }

    public List B1L() {
        return A00;
    }
}
