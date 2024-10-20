package com.facebook.ctmads.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCTMAdsJNI.class */
public class MailboxCTMAdsJNI {
    static {
        C0il.A0B("mailboxctmadsjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOOOOZZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2);

    public static final native List getHeaderFields();
}
