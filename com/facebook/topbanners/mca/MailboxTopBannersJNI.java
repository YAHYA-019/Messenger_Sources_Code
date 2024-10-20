package com.facebook.topbanners.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxTopBannersJNI.class */
public class MailboxTopBannersJNI {
    static {
        C0il.A0B("mailboxtopbannersjni");
    }

    public static final native Object dispatchCqlOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchOIJOOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
