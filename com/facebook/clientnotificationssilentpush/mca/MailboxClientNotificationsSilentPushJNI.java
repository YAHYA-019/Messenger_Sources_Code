package com.facebook.clientnotificationssilentpush.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxClientNotificationsSilentPushJNI.class */
public class MailboxClientNotificationsSilentPushJNI {
    static {
        C0il.A0B("mailboxclientnotificationssilentpushjni");
    }

    public static final native Object dispatchCqlOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();
}
