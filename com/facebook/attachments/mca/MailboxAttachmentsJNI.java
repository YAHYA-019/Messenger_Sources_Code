package com.facebook.attachments.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAttachmentsJNI.class */
public class MailboxAttachmentsJNI {
    static {
        C0il.A0B("mailboxattachmentsjni");
    }

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
