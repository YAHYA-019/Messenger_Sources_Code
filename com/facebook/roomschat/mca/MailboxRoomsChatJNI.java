package com.facebook.roomschat.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxRoomsChatJNI.class */
public class MailboxRoomsChatJNI {
    static {
        C0il.A0B("mailboxroomschatjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
