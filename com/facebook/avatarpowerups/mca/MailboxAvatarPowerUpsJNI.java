package com.facebook.avatarpowerups.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAvatarPowerUpsJNI.class */
public class MailboxAvatarPowerUpsJNI {
    static {
        C0il.A0B("mailboxavatarpowerupsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
