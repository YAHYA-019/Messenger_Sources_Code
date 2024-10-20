package com.facebook.magicalmessenger.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMagicalMessengerJNI.class */
public class MailboxMagicalMessengerJNI {
    static {
        C0il.A0B("mailboxmagicalmessengerjni");
    }

    public static final native Object dispatchCqlOIJJOOO(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOIJOO(int i, int i2, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
