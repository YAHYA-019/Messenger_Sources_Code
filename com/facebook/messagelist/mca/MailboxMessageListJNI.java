package com.facebook.messagelist.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMessageListJNI.class */
public class MailboxMessageListJNI {
    static {
        C0il.A0B("mailboxmessagelistjni");
    }

    public static final native Object dispatchCqlOIIIJJO(int i, int i2, int i3, int i4, long j, long j2, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
