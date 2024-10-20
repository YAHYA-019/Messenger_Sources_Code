package com.facebook.cutoverinternal.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCutoverInternalJNI.class */
public class MailboxCutoverInternalJNI {
    static {
        C0il.A0B("mailboxcutoverinternaljni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
