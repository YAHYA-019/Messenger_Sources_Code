package com.facebook.rtc.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxRTCJNI.class */
public class MailboxRTCJNI {
    static {
        C0il.A0B("mailboxrtcjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
