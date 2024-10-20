package com.facebook.bots.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxBotsJNI.class */
public class MailboxBotsJNI {
    static {
        C0il.A0B("mailboxbotsjni");
    }

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
