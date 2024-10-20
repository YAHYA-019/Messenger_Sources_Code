package com.facebook.polls.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxPollsJNI.class */
public class MailboxPollsJNI {
    static {
        C0il.A0B("mailboxpollsjni");
    }

    public static final native Object dispatchCqlOJJO(int i, long j, long j2, Object obj);

    public static final native Object dispatchDasmOJJOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
