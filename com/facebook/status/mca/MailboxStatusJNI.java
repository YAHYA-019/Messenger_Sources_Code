package com.facebook.status.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStatusJNI.class */
public class MailboxStatusJNI {
    static {
        C0il.A0B("mailboxstatusjni");
    }

    public static final native Object dispatchCqlOIIIO(int i, int i2, int i3, int i4, Object obj);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchCqlOJJJJO(int i, long j, long j2, long j3, long j4, Object obj);

    public static final native Object dispatchCqlOJJJOOO(int i, long j, long j2, long j3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIIJOOOOOOOOOOOOOOOOOZZ(int i, int i2, int i3, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, boolean z, boolean z2);

    public static final native Object dispatchDasmOIJOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIOOOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
