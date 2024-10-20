package com.facebook.ardelivery.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxArDeliveryJNI.class */
public class MailboxArDeliveryJNI {
    static {
        C0il.A0B("mailboxardeliveryjni");
    }

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOOOOOOOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, boolean z);

    public static final native List getHeaderFields();
}
