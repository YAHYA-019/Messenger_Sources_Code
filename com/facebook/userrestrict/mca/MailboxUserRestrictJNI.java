package com.facebook.userrestrict.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxUserRestrictJNI.class */
public class MailboxUserRestrictJNI {
    static {
        C0il.A0B("mailboxuserrestrictjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
