package com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: RequestFetch.class */
public final class RequestFetch extends PRELoggingEndEvent {
    public static final List A01 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final String A00;

    public RequestFetch(int i, String str, String str2) {
        super(i);
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        sb.append(str2);
        sb.append('/');
        sb.append(str);
        this.A00 = sb.toString();
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.mailboxthreadsource.RequestFetch";
    }

    public List B1L() {
        return A01;
    }
}
