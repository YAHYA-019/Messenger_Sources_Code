package com.facebook.cutover.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCutoverJNI.class */
public class MailboxCutoverJNI {
    static {
        C0il.A0B("mailboxcutoverjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOOZ(int i, long j, Object obj, Object obj2, boolean z);

    public static final native Object dispatchCqlOJOZ(int i, long j, Object obj, boolean z);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
