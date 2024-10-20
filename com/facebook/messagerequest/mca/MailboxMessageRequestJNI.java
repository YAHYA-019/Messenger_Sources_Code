package com.facebook.messagerequest.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMessageRequestJNI.class */
public class MailboxMessageRequestJNI {
    static {
        C0il.A0B("mailboxmessagerequestjni");
    }

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
