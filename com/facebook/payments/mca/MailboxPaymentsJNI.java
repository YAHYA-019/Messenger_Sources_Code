package com.facebook.payments.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxPaymentsJNI.class */
public class MailboxPaymentsJNI {
    static {
        C0il.A0B("mailboxpaymentsjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native void dispatchVOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static final native void dispatchVOOOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static final native List getHeaderFields();
}
