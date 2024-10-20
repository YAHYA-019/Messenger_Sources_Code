package com.facebook.xapp.messaging.threadpre.events.events.common.messagelist;

import X.7zQ;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: MessageListDataFetchFail.class */
public final class MessageListDataFetchFail extends PRELoggingEvent {
    public static final List A00 = 7zQ.A13();

    public MessageListDataFetchFail(int i) {
        super(i);
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "message_list_data_fetch";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchFail";
    }

    public List B1L() {
        return A00;
    }
}
