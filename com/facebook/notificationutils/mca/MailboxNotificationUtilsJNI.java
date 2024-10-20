package com.facebook.notificationutils.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxNotificationUtilsJNI.class */
public class MailboxNotificationUtilsJNI {
    static {
        C0il.A0B("mailboxnotificationutilsjni");
    }

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
