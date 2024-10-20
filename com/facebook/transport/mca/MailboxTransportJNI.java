package com.facebook.transport.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxTransportJNI.class */
public class MailboxTransportJNI {
    static {
        C0il.A0B("mailboxtransportjni");
    }

    public static final native void dispatchVIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();
}
