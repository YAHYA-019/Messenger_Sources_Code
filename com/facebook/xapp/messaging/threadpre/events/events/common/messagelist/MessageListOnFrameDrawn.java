package com.facebook.xapp.messaging.threadpre.events.events.common.messagelist;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: MessageListOnFrameDrawn.class */
public final class MessageListOnFrameDrawn extends PRELoggingEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final Boolean A00;

    public MessageListOnFrameDrawn(Boolean bool, int i) {
        super(i);
        this.A00 = bool;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListOnFrameDrawn";
    }

    public List B1L() {
        return A01;
    }
}
