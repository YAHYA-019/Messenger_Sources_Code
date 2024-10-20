package com.facebook.threadattachments.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxThreadAttachmentsJNI.class */
public class MailboxThreadAttachmentsJNI {
    static {
        C0il.A0B("mailboxthreadattachmentsjni");
    }

    public static final native Object dispatchDasmOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
