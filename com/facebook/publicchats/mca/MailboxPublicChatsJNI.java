package com.facebook.publicchats.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxPublicChatsJNI.class */
public class MailboxPublicChatsJNI {
    static {
        C0il.A0B("mailboxpublicchatsjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOIOOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
