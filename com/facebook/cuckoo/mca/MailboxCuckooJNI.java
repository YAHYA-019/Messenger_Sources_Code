package com.facebook.cuckoo.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCuckooJNI.class */
public class MailboxCuckooJNI {
    static {
        C0il.A0B("mailboxcuckoojni");
    }

    public static final native Object dispatchCqlOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOOZ(int i, Object obj, boolean z);

    public static final native Object dispatchDasmOIIOOOOZ(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
