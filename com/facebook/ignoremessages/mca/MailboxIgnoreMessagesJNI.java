package com.facebook.ignoremessages.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxIgnoreMessagesJNI.class */
public class MailboxIgnoreMessagesJNI {
    static {
        C0il.A0B("mailboxignoremessagesjni");
    }

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
