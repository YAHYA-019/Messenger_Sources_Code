package com.facebook.hotreload.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxHotReloadJNI.class */
public class MailboxHotReloadJNI {
    static {
        C0il.A0B("mailboxhotreloadjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native void dispatchVOZ(int i, Object obj, boolean z);

    public static final native List getHeaderFields();
}
