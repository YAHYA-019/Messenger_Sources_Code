package com.facebook.familycentersupervision.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFamilyCenterSupervisionJNI.class */
public class MailboxFamilyCenterSupervisionJNI {
    static {
        C0il.A0B("mailboxfamilycentersupervisionjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOJJOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
