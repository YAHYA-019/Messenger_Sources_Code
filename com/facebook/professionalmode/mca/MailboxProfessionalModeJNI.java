package com.facebook.professionalmode.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxProfessionalModeJNI.class */
public class MailboxProfessionalModeJNI {
    static {
        C0il.A0B("mailboxprofessionalmodejni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
