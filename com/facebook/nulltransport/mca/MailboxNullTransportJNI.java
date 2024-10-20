package com.facebook.nulltransport.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxNullTransportJNI.class */
public class MailboxNullTransportJNI {
    static {
        C0il.A0B("mailboxnulltransportjni");
    }

    public static final native Object dispatchCqlOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
