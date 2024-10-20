package com.facebook.reachabilitysettings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxReachabilitySettingsJNI.class */
public class MailboxReachabilitySettingsJNI {
    static {
        C0il.A0B("mailboxreachabilitysettingsjni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIIOOOOOZ(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
