package com.facebook.syncstates.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxSyncStatesJNI.class */
public class MailboxSyncStatesJNI {
    static {
        C0il.A0B("mailboxsyncstatesjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
