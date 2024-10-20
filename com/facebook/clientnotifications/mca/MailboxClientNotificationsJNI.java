package com.facebook.clientnotifications.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxClientNotificationsJNI.class */
public class MailboxClientNotificationsJNI {
    static {
        C0il.A0B("mailboxclientnotificationsjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
