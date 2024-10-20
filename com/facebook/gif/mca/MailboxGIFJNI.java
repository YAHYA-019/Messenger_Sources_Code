package com.facebook.gif.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxGIFJNI.class */
public class MailboxGIFJNI {
    static {
        C0il.A0B("mailboxgifjni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIIOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
