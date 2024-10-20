package com.facebook.forwardratelimit.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxForwardRateLimitJNI.class */
public class MailboxForwardRateLimitJNI {
    static {
        C0il.A0B("mailboxforwardratelimitjni");
    }

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchOIOO(int i, int i2, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
