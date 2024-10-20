package com.facebook.quickreply.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxQuickReplyJNI.class */
public class MailboxQuickReplyJNI {
    static {
        C0il.A0B("mailboxquickreplyjni");
    }

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
