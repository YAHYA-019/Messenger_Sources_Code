package com.facebook.jewelnotification.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxJewelNotificationJNI.class */
public class MailboxJewelNotificationJNI {
    static {
        C0il.A0B("mailboxjewelnotificationjni");
    }

    public static final native Object dispatchCqlOIJJO(int i, int i2, long j, long j2, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
