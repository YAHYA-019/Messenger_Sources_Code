package com.facebook.composermenu.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxComposerMenuJNI.class */
public class MailboxComposerMenuJNI {
    static {
        C0il.A0B("mailboxcomposermenujni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
