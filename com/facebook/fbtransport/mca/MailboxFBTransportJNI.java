package com.facebook.fbtransport.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFBTransportJNI.class */
public class MailboxFBTransportJNI {
    static {
        C0il.A0B("mailboxfbtransportjni");
    }

    public static final native Object dispatchCqlOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
