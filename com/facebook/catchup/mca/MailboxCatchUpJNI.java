package com.facebook.catchup.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCatchUpJNI.class */
public class MailboxCatchUpJNI {
    static {
        C0il.A0B("mailboxcatchupjni");
    }

    public static final native Object dispatchCqlOIJJO(int i, int i2, long j, long j2, Object obj);

    public static final native Object dispatchCqlOJJO(int i, long j, long j2, Object obj);

    public static final native List getHeaderFields();
}
