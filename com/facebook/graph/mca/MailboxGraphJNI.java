package com.facebook.graph.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxGraphJNI.class */
public class MailboxGraphJNI {
    static {
        C0il.A0B("mailboxgraphjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
