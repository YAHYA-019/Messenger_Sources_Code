package com.facebook.inboxfolders.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxInboxFoldersJNI.class */
public class MailboxInboxFoldersJNI {
    static {
        C0il.A0B("mailboxinboxfoldersjni");
    }

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchOIOO(int i, int i2, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
