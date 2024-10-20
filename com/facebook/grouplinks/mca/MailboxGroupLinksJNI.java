package com.facebook.grouplinks.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxGroupLinksJNI.class */
public class MailboxGroupLinksJNI {
    static {
        C0il.A0B("mailboxgrouplinksjni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOIJOOOOOOOZ(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native List getHeaderFields();
}
