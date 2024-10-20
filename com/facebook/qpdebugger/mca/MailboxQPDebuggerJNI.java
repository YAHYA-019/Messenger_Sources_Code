package com.facebook.qpdebugger.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxQPDebuggerJNI.class */
public class MailboxQPDebuggerJNI {
    static {
        C0il.A0B("mailboxqpdebuggerjni");
    }

    public static final native Object dispatchCqlOIIJO(int i, int i2, int i3, long j, Object obj);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
