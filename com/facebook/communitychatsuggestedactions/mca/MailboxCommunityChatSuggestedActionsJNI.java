package com.facebook.communitychatsuggestedactions.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxCommunityChatSuggestedActionsJNI.class */
public class MailboxCommunityChatSuggestedActionsJNI {
    static {
        C0il.A0B("mailboxcommunitychatsuggestedactionsjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOJOOOZ(int i, long j, Object obj, Object obj2, Object obj3, boolean z);

    public static final native Object dispatchCqlOJOZ(int i, long j, Object obj, boolean z);

    public static final native List getHeaderFields();
}
