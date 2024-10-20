package com.facebook.inthreadbanner.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxInThreadBannerJNI.class */
public class MailboxInThreadBannerJNI {
    static {
        C0il.A0B("mailboxinthreadbannerjni");
    }

    public static final native Object dispatchCqlOJJO(int i, long j, long j2, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
