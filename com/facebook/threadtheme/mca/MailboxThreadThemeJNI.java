package com.facebook.threadtheme.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadThemeJNI.class */
public class MailboxThreadThemeJNI {
    static {
        C0il.A0B("mailboxthreadthemejni");
    }

    public static final native Object dispatchOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native void dispatchVJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static final native List getHeaderFields();
}
