package com.facebook.avatarquickreactions.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAvatarQuickReactionsJNI.class */
public class MailboxAvatarQuickReactionsJNI {
    static {
        C0il.A0B("mailboxavatarquickreactionsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
