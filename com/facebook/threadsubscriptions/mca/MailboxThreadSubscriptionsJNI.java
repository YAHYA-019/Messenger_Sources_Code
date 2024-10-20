package com.facebook.threadsubscriptions.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadSubscriptionsJNI.class */
public class MailboxThreadSubscriptionsJNI {
    static {
        C0il.A0B("mailboxthreadsubscriptionsjni");
    }

    public static final native Object dispatchDasmOJJJJJOO(int i, long j, long j2, long j3, long j4, long j5, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
