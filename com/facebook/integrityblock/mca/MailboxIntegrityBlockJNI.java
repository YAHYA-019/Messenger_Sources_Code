package com.facebook.integrityblock.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxIntegrityBlockJNI.class */
public class MailboxIntegrityBlockJNI {
    static {
        C0il.A0B("mailboxintegrityblockjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
