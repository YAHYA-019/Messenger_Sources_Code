package com.facebook.threadlist.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadListJNI.class */
public class MailboxThreadListJNI {
    static {
        C0il.A0B("mailboxthreadlistjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
