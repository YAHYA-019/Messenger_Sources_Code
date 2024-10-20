package com.facebook.usercontrols.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxUserControlsJNI.class */
public class MailboxUserControlsJNI {
    static {
        C0il.A0B("mailboxusercontrolsjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
