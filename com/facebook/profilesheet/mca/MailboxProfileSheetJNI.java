package com.facebook.profilesheet.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxProfileSheetJNI.class */
public class MailboxProfileSheetJNI {
    static {
        C0il.A0B("mailboxprofilesheetjni");
    }

    public static final native Object dispatchDasmOJJJOO(int i, long j, long j2, long j3, Object obj, Object obj2);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
