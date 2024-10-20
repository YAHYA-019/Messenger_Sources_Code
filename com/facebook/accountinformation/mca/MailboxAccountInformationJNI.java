package com.facebook.accountinformation.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAccountInformationJNI.class */
public class MailboxAccountInformationJNI {
    static {
        C0il.A0B("mailboxaccountinformationjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
