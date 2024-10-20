package com.facebook.businessfeedback.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxBusinessFeedbackJNI.class */
public class MailboxBusinessFeedbackJNI {
    static {
        C0il.A0B("mailboxbusinessfeedbackjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();
}
