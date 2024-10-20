package com.facebook.events.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxEventsJNI.class */
public class MailboxEventsJNI {
    static {
        C0il.A0B("mailboxeventsjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
