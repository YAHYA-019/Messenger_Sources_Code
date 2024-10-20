package com.facebook.badgecount.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxBadgeCountJNI.class */
public class MailboxBadgeCountJNI {
    static {
        C0il.A0B("mailboxbadgecountjni");
    }

    public static final native Object dispatchCqlOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
