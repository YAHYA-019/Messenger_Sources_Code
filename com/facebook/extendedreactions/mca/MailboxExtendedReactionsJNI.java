package com.facebook.extendedreactions.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxExtendedReactionsJNI.class */
public class MailboxExtendedReactionsJNI {
    static {
        C0il.A0B("mailboxextendedreactionsjni");
    }

    public static final native Object dispatchDasmOJJJOOO(int i, long j, long j2, long j3, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
