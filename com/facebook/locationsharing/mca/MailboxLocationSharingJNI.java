package com.facebook.locationsharing.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxLocationSharingJNI.class */
public class MailboxLocationSharingJNI {
    static {
        C0il.A0B("mailboxlocationsharingjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmODDJJJJOO(int i, double d, double d2, long j, long j2, long j3, long j4, Object obj, Object obj2);

    public static final native Object dispatchDasmODDJJOO(int i, double d, double d2, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmODDOOO(int i, double d, double d2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native List getHeaderFields();
}
