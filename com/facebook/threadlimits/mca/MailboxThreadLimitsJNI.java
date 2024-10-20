package com.facebook.threadlimits.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadLimitsJNI.class */
public class MailboxThreadLimitsJNI {
    static {
        C0il.A0B("mailboxthreadlimitsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
