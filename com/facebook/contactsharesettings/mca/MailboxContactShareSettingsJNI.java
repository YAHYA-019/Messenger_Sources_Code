package com.facebook.contactsharesettings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxContactShareSettingsJNI.class */
public class MailboxContactShareSettingsJNI {
    static {
        C0il.A0B("mailboxcontactsharesettingsjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
