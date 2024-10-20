package com.facebook.messagingprivacysettings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMessagingPrivacySettingsJNI.class */
public class MailboxMessagingPrivacySettingsJNI {
    static {
        C0il.A0B("mailboxmessagingprivacysettingsjni");
    }

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
