package com.facebook.rollcall.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxRollCallJNI.class */
public class MailboxRollCallJNI {
    static {
        C0il.A0B("mailboxrollcalljni");
    }

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJJOOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchDasmOJJOOZ(int i, long j, long j2, Object obj, Object obj2, boolean z);

    public static final native Object dispatchDasmOJOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
