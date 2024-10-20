package com.facebook.communitymessagingtrending.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCommunityMessagingTrendingJNI.class */
public class MailboxCommunityMessagingTrendingJNI {
    static {
        C0il.A0B("mailboxcommunitymessagingtrendingjni");
    }

    public static final native Object dispatchCqlOIIIOZZ(int i, int i2, int i3, int i4, Object obj, boolean z, boolean z2);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchDasmOIIJJOO(int i, int i2, int i3, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
