package com.facebook.advancedcryptotransportdiskmanager.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAdvancedCryptoTransportDiskManagerJNI.class */
public class MailboxAdvancedCryptoTransportDiskManagerJNI {
    static {
        C0il.A0B("mailboxadvancedcryptotransportdiskmanagerjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native void dispatchVOOOOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z);

    public static final native void dispatchVOOOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z);

    public static final native void dispatchVOOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static final native void dispatchVOOOOZ(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native List getHeaderFields();
}
