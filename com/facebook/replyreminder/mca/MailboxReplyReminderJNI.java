package com.facebook.replyreminder.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxReplyReminderJNI.class */
public class MailboxReplyReminderJNI {
    static {
        C0il.A0B("mailboxreplyreminderjni");
    }

    public static final native Object dispatchCqlOIJJOO(int i, int i2, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchCqlOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOOZ(int i, long j, Object obj, Object obj2, boolean z);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
