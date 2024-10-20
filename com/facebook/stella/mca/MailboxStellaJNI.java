package com.facebook.stella.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStellaJNI.class */
public class MailboxStellaJNI {
    static {
        C0il.A0B("mailboxstellajni");
    }

    public static final native Object dispatchCqlODIIIOZ(int i, double d, int i2, int i3, int i4, Object obj, boolean z);

    public static final native Object dispatchCqlOIIO(int i, int i2, int i3, Object obj);

    public static final native Object dispatchCqlOIIOZ(int i, int i2, int i3, Object obj, boolean z);

    public static final native Object dispatchCqlOIOZZ(int i, int i2, Object obj, boolean z, boolean z2);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
