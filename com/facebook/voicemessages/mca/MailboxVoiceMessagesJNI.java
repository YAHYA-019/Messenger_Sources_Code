package com.facebook.voicemessages.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxVoiceMessagesJNI.class */
public class MailboxVoiceMessagesJNI {
    static {
        C0il.A0B("mailboxvoicemessagesjni");
    }

    public static final native Object dispatchCqlODJOO(int i, double d, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
