package com.facebook.contactupload.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxContactUploadJNI.class */
public class MailboxContactUploadJNI {
    static {
        C0il.A0B("mailboxcontactuploadjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOIIOOOOOOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static final native Object dispatchDasmOIOOOOOZ(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static final native List getHeaderFields();
}
