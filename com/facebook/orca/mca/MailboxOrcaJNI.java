package com.facebook.orca.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxOrcaJNI.class */
public class MailboxOrcaJNI {
    static {
        C0il.A0B("mailboxorcajni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native Object dispatchOIIIJOOOOOOOZZZZZZZZZZZZZZZZZZZZZZZZZZ(int i, int i2, int i3, int i4, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26);

    public static final native void dispatchVIIIJOOOOOO(int i, int i2, int i3, int i4, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native void dispatchVIIIJOOOOOOOOZZZZZZZZZZZZ(int i, int i2, int i3, int i4, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12);

    public static final native void dispatchVIOO(int i, int i2, Object obj, Object obj2);

    public static final native void dispatchVIOOOOOOOOOZZZZZZZZZZZZZZZZZZZZZZ(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOOOOZZZZZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    public static final native void dispatchVOOOOZZZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, boolean z3);

    public static final native List getHeaderFields();
}
