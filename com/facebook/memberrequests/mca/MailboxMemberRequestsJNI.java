package com.facebook.memberrequests.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMemberRequestsJNI.class */
public class MailboxMemberRequestsJNI {
    static {
        C0il.A0B("mailboxmemberrequestsjni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVJOOOZ(int i, long j, Object obj, Object obj2, Object obj3, boolean z);

    public static final native void dispatchVJOOZ(int i, long j, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
