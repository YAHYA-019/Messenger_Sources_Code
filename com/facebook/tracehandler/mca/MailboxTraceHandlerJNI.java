package com.facebook.tracehandler.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxTraceHandlerJNI.class */
public class MailboxTraceHandlerJNI {
    static {
        C0il.A0B("mailboxtracehandlerjni");
    }

    public static final native void dispatchVIIOOOOOOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static final native void dispatchVIIOOOOOOOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static final native List getHeaderFields();
}
