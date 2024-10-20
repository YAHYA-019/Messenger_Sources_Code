package com.facebook.fxcal.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFXCALJNI.class */
public class MailboxFXCALJNI {
    static {
        C0il.A0B("mailboxfxcaljni");
    }

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
