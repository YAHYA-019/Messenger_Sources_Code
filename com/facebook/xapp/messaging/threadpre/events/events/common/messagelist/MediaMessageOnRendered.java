package com.facebook.xapp.messaging.threadpre.events.events.common.messagelist;

import X.7zQ;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: MediaMessageOnRendered.class */
public final class MediaMessageOnRendered extends PRELoggingEvent {
    public static final List A01 = 7zQ.A13();
    public final String A00;

    public MediaMessageOnRendered(int i, String str) {
        super(i);
        this.A00 = str;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "media_message_render";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MediaMessageOnRendered";
    }

    public List B1L() {
        return A01;
    }
}
