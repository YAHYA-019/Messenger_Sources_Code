package com.facebook.proactivewarningsnoncore.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxProactiveWarningsNonCoreJNI.class */
public class MailboxProactiveWarningsNonCoreJNI {
    static {
        C0il.A0B("mailboxproactivewarningsnoncorejni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
