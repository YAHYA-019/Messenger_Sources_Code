package com.facebook.callhistory.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCallHistoryJNI.class */
public class MailboxCallHistoryJNI {
    static {
        C0il.A0B("mailboxcallhistoryjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
