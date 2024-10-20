package com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: MailboxRequestDataEnd.class */
public final class MailboxRequestDataEnd extends PRELoggingEndEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final int A00;
    public final int A01;

    public MailboxRequestDataEnd(int i, int i2, int i3) {
        super(i);
        this.A01 = i2;
        this.A00 = i3;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.MailboxRequestDataEnd";
    }

    public List B1L() {
        return A02;
    }
}
