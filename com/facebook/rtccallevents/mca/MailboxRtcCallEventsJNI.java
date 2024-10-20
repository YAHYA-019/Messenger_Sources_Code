package com.facebook.rtccallevents.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxRtcCallEventsJNI.class */
public class MailboxRtcCallEventsJNI {
    static {
        C0il.A0B("mailboxrtccalleventsjni");
    }

    public static final native Object dispatchCqlOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOIJOOOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
