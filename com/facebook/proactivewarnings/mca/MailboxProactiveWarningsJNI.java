package com.facebook.proactivewarnings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxProactiveWarningsJNI.class */
public class MailboxProactiveWarningsJNI {
    static {
        C0il.A0B("mailboxproactivewarningsjni");
    }

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
