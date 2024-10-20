package com.facebook.loadgeneratorproxy.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxLoadGeneratorProxyJNI.class */
public class MailboxLoadGeneratorProxyJNI {
    static {
        C0il.A0B("mailboxloadgeneratorproxyjni");
    }

    public static final native void dispatchVIIIIOOOOOZZZ(int i, int i2, int i3, int i4, int i5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, boolean z3);

    public static final native void dispatchVIIIOOOZZZ(int i, int i2, int i3, int i4, Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3);

    public static final native void dispatchVIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
