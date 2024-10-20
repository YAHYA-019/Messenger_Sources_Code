package com.facebook.recentmessages.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxRecentMessagesJNI.class */
public class MailboxRecentMessagesJNI {
    static {
        C0il.A0B("mailboxrecentmessagesjni");
    }

    public static final native Object dispatchCqlOJOZ(int i, long j, Object obj, boolean z);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
