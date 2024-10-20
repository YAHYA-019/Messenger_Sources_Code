package com.facebook.mplwaisyncmonitor.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMPLWaiSyncMonitorJNI.class */
public class MailboxMPLWaiSyncMonitorJNI {
    static {
        C0il.A0B("mailboxmplwaisyncmonitorjni");
    }

    public static final native void dispatchVIIOOZ(int i, int i2, int i3, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
