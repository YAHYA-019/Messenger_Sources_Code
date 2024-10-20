package com.facebook.pinnedthreads.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxPinnedThreadsJNI.class */
public class MailboxPinnedThreadsJNI {
    static {
        C0il.A0B("mailboxpinnedthreadsjni");
    }

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
