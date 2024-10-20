package com.facebook.cowatch.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCowatchJNI.class */
public class MailboxCowatchJNI {
    static {
        C0il.A0B("mailboxcowatchjni");
    }

    public static final native Object dispatchOJJJOO(int i, long j, long j2, long j3, Object obj, Object obj2);

    public static final native Object dispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
