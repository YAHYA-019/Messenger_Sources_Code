package com.facebook.notificationsettings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxNotificationSettingsJNI.class */
public class MailboxNotificationSettingsJNI {
    static {
        C0il.A0B("mailboxnotificationsettingsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
