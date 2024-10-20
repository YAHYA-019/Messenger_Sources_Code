package com.facebook.threadcapability.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadCapabilityJNI.class */
public class MailboxThreadCapabilityJNI {
    static {
        C0il.A0B("mailboxthreadcapabilityjni");
    }

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
