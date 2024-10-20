package com.facebook.userprefsint.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxUserPrefsIntJNI.class */
public class MailboxUserPrefsIntJNI {
    static {
        C0il.A0B("mailboxuserprefsintjni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
