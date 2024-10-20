package com.facebook.accountsyncedfields.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAccountSyncedFieldsJNI.class */
public class MailboxAccountSyncedFieldsJNI {
    static {
        C0il.A0B("mailboxaccountsyncedfieldsjni");
    }

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
