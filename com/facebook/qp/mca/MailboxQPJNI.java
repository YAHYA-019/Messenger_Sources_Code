package com.facebook.qp.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxQPJNI.class */
public class MailboxQPJNI {
    static {
        C0il.A0B("mailboxqpjni");
    }

    public static final native Object dispatchCqlOIIO(int i, int i2, int i3, Object obj);

    public static final native Object dispatchCqlOIIOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOIJJO(int i, int i2, long j, long j2, Object obj);

    public static final native Object dispatchCqlOIJJOO(int i, int i2, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchCqlOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIIIJOO(int i, int i2, int i3, int i4, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();
}
