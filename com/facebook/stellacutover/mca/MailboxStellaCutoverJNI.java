package com.facebook.stellacutover.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStellaCutoverJNI.class */
public class MailboxStellaCutoverJNI {
    static {
        C0il.A0B("mailboxstellacutoverjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
