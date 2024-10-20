package com.facebook.avatarsinfo.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAvatarsInfoJNI.class */
public class MailboxAvatarsInfoJNI {
    static {
        C0il.A0B("mailboxavatarsinfojni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
