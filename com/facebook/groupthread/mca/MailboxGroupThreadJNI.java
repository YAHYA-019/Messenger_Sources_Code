package com.facebook.groupthread.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxGroupThreadJNI.class */
public class MailboxGroupThreadJNI {
    static {
        C0il.A0B("mailboxgroupthreadjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
