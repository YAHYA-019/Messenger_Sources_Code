package com.facebook.presence.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxPresenceJNI.class */
public class MailboxPresenceJNI {
    static {
        C0il.A0B("mailboxpresencejni");
    }

    public static final native Object dispatchCqlOIIOZ(int i, int i2, int i3, Object obj, boolean z);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOZ(int i, Object obj, boolean z);

    public static final native Object dispatchDasmOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
