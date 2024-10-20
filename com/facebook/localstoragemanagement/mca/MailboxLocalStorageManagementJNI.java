package com.facebook.localstoragemanagement.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxLocalStorageManagementJNI.class */
public class MailboxLocalStorageManagementJNI {
    static {
        C0il.A0B("mailboxlocalstoragemanagementjni");
    }

    public static final native void dispatchVIOOZ(int i, int i2, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
