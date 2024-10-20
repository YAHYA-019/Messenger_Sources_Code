package com.facebook.xapp.messaging.threadpre.events.events.common.messagelist;

import X.C0s8;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: MessageListDataFetchStart.class */
public final class MessageListDataFetchStart extends PRELoggingStartEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadKey A00;

    public MessageListDataFetchStart(ThreadKey threadKey, int i) {
        super(i);
        this.A00 = threadKey;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchStart";
    }

    public List B1L() {
        return A01;
    }
}
