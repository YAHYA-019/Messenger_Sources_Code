package com.facebook.threadbans.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadBansJNI.class */
public class MailboxThreadBansJNI {
    static {
        C0il.A0B("mailboxthreadbansjni");
    }

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
