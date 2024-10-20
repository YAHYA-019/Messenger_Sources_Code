package com.facebook.communitymessagingpresence.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCommunityMessagingPresenceJNI.class */
public class MailboxCommunityMessagingPresenceJNI {
    static {
        C0il.A0B("mailboxcommunitymessagingpresencejni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIJJOO(int i, int i2, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
