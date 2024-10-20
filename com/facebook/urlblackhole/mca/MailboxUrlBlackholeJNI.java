package com.facebook.urlblackhole.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxUrlBlackholeJNI.class */
public class MailboxUrlBlackholeJNI {
    static {
        C0il.A0B("mailboxurlblackholejni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native List getHeaderFields();
}
