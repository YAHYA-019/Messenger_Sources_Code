package com.facebook.analyticslogging.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAnalyticsLoggingJNI.class */
public class MailboxAnalyticsLoggingJNI {
    static {
        C0il.A0B("mailboxanalyticsloggingjni");
    }

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
