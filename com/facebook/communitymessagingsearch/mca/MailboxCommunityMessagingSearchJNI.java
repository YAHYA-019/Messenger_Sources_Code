package com.facebook.communitymessagingsearch.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCommunityMessagingSearchJNI.class */
public class MailboxCommunityMessagingSearchJNI {
    static {
        C0il.A0B("mailboxcommunitymessagingsearchjni");
    }

    public static final native Object dispatchCqlOIIOZZZZ(int i, int i2, int i3, Object obj, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
