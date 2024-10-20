package com.facebook.mediareceiverfetch.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMediaReceiverFetchJNI.class */
public class MailboxMediaReceiverFetchJNI {
    static {
        C0il.A0B("mailboxmediareceiverfetchjni");
    }

    public static final native Object dispatchCqlOIIJOOOOOOO(int i, int i2, int i3, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
