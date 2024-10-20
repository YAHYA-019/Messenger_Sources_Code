package com.facebook.copresence.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCopresenceJNI.class */
public class MailboxCopresenceJNI {
    static {
        C0il.A0B("mailboxcopresencejni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOIIJOO(int i, int i2, int i3, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
