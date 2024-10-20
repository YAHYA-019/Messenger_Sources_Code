package com.facebook.userprefsbool.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxUserPrefsBoolJNI.class */
public class MailboxUserPrefsBoolJNI {
    static {
        C0il.A0B("mailboxuserprefsbooljni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native List getHeaderFields();
}
