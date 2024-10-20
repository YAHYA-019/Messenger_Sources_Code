package com.facebook.facebooktam.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFacebookTamJNI.class */
public class MailboxFacebookTamJNI {
    static {
        C0il.A0B("mailboxfacebooktamjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
