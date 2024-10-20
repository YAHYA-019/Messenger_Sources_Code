package com.facebook.sdktransport.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxSDKTransportJNI.class */
public class MailboxSDKTransportJNI {
    static {
        C0il.A0B("mailboxsdktransportjni");
    }

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
