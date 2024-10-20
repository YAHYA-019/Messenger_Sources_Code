package com.facebook.stellagroupthreads.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStellaGroupThreadsJNI.class */
public class MailboxStellaGroupThreadsJNI {
    static {
        C0il.A0B("mailboxstellagroupthreadsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
