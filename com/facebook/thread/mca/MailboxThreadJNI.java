package com.facebook.thread.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadJNI.class */
public class MailboxThreadJNI {
    static {
        C0il.A0B("mailboxthreadjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOIJJJOOO(int i, int i2, long j, long j2, long j3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchOIJJJOOOZZZZ(int i, int i2, long j, long j2, long j3, Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native Object dispatchOIJJJOOZ(int i, int i2, long j, long j2, long j3, Object obj, Object obj2, boolean z);

    public static final native Object dispatchOIJJJOOZZZZ(int i, int i2, long j, long j2, long j3, Object obj, Object obj2, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native void dispatchVIIIIJJOOOOOOOOOOOOZZZZZZZZZZZZZZZZZZZZZZ(int i, int i2, int i3, int i4, int i5, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22);

    public static final native void dispatchVIJJOOOZ(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3, boolean z);

    public static final native void dispatchVIOO(int i, int i2, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
