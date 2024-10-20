package com.facebook.orcathreadsettings.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxOrcaThreadSettingsJNI.class */
public class MailboxOrcaThreadSettingsJNI {
    static {
        C0il.A0B("mailboxorcathreadsettingsjni");
    }

    public static final native Object dispatchOIJJOOO(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
