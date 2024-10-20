package com.facebook.threaddetails.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadDetailsJNI.class */
public class MailboxThreadDetailsJNI {
    static {
        C0il.A0B("mailboxthreaddetailsjni");
    }

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVIJJOOO(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVIJOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
