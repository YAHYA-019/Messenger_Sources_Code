package com.facebook.notes.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxNotesJNI.class */
public class MailboxNotesJNI {
    static {
        C0il.A0B("mailboxnotesjni");
    }

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
