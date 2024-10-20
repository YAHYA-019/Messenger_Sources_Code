package com.facebook.threadmembers.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadMembersJNI.class */
public class MailboxThreadMembersJNI {
    static {
        C0il.A0B("mailboxthreadmembersjni");
    }

    public static final native Object dispatchDasmOIJOOZ(int i, int i2, long j, Object obj, Object obj2, boolean z);

    public static final native Object dispatchDasmOJJOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJJOOZ(int i, long j, long j2, Object obj, Object obj2, boolean z);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
