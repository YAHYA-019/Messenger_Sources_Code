package com.facebook.securemessage.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxSecureMessageJNI.class */
public class MailboxSecureMessageJNI {
    static {
        C0il.A0B("mailboxsecuremessagejni");
    }

    public static final native Object dispatchCqlOJJJO(int i, long j, long j2, long j3, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchOIJJOO(int i, int i2, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native void dispatchVOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native void dispatchVOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static final native void dispatchVOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static final native void dispatchVOOOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static final native void dispatchVOOOOOOOZZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z, boolean z2);

    public static final native void dispatchVOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native void dispatchVOOOZZZ(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3);

    public static final native void dispatchVOOZZ(int i, Object obj, Object obj2, boolean z, boolean z2);

    public static final native void dispatchVOOZZZZ(int i, Object obj, Object obj2, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native void dispatchVOZ(int i, Object obj, boolean z);

    public static final native List getHeaderFields();
}
