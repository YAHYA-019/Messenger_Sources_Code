package com.facebook.friendstab.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFriendsTabJNI.class */
public class MailboxFriendsTabJNI {
    static {
        C0il.A0B("mailboxfriendstabjni");
    }

    public static final native Object dispatchCqlOIOZ(int i, int i2, Object obj, boolean z);

    public static final native List getHeaderFields();
}
