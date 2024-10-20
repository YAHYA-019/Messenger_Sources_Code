package com.facebook.forwarding.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxForwardingJNI.class */
public class MailboxForwardingJNI {
    static {
        C0il.A0B("mailboxforwardingjni");
    }

    public static final native void dispatchVIIIJJJOOOOOOOOOOOOOZ(int i, int i2, int i3, int i4, long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, boolean z);

    public static final native void dispatchVJJOOOOOOOOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11);

    public static final native void dispatchVOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static final native List getHeaderFields();
}
