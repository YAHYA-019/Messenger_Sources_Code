package com.facebook.reaction.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxReactionJNI.class */
public class MailboxReactionJNI {
    static {
        C0il.A0B("mailboxreactionjni");
    }

    public static final native Object dispatchDasmOJJJOOOOO(int i, long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();
}
