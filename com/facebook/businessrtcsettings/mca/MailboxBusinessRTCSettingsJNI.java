package com.facebook.businessrtcsettings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxBusinessRTCSettingsJNI.class */
public class MailboxBusinessRTCSettingsJNI {
    static {
        C0il.A0B("mailboxbusinessrtcsettingsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native List getHeaderFields();
}
