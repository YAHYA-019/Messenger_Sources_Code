package com.facebook.pushnotifications.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxPushNotificationsJNI.class */
public class MailboxPushNotificationsJNI {
    static {
        C0il.A0B("mailboxpushnotificationsjni");
    }

    public static final native Object dispatchCqlOIJOOOOOOOOOOOOOOOOOOOOOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, Object obj23, Object obj24);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native Object dispatchDasmOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
