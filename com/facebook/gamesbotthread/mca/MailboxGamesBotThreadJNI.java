package com.facebook.gamesbotthread.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxGamesBotThreadJNI.class */
public class MailboxGamesBotThreadJNI {
    static {
        C0il.A0B("mailboxgamesbotthreadjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
