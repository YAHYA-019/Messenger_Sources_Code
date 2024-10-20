package com.facebook.xapp.messaging.threadpre.events.events.common.messagelist;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: MessageListDataFetchEnd.class */
public final class MessageListDataFetchEnd extends PRELoggingEndEvent {
    public static final List A00 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    public MessageListDataFetchEnd(int i) {
        super(i);
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchEnd";
    }

    public List B1L() {
        return A00;
    }
}
