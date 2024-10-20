package com.facebook.parentthreadutil.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxParentThreadUtilJNI.class */
public class MailboxParentThreadUtilJNI {
    static {
        C0il.A0B("mailboxparentthreadutiljni");
    }

    public static final native Object dispatchCqlOIOZ(int i, int i2, Object obj, boolean z);

    public static final native List getHeaderFields();
}
