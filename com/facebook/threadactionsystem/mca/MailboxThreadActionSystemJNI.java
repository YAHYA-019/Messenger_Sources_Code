package com.facebook.threadactionsystem.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadActionSystemJNI.class */
public class MailboxThreadActionSystemJNI {
    static {
        C0il.A0B("mailboxthreadactionsystemjni");
    }

    public static final native Object dispatchDasmOJJJOOO(int i, long j, long j2, long j3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOJJOOZ(int i, long j, long j2, Object obj, Object obj2, boolean z);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
