package com.facebook.sharing.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxSharingJNI.class */
public class MailboxSharingJNI {
    static {
        C0il.A0B("mailboxsharingjni");
    }

    public static final native Object dispatchCqlOIIOO(int i, int i2, int i3, Object obj, Object obj2);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
