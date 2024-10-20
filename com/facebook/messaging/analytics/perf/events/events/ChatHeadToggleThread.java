package com.facebook.messaging.analytics.perf.events.events;

import X.7zQ;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: ChatHeadToggleThread.class */
public final class ChatHeadToggleThread extends PRELoggingEvent {
    public static final List A03 = 7zQ.A13();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public ChatHeadToggleThread(String str, String str2, int i, boolean z) {
        super(i);
        this.A01 = str;
        this.A02 = z;
        this.A00 = str2;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "chat_head_toggle_thread";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.ChatHeadToggleThread";
    }

    public List B1L() {
        return A03;
    }
}
