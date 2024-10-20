package com.facebook.reportingsdk.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxReportingSDKJNI.class */
public class MailboxReportingSDKJNI {
    static {
        C0il.A0B("mailboxreportingsdkjni");
    }

    public static final native void dispatchVIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVIJOOOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native void dispatchVJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native List getHeaderFields();
}
