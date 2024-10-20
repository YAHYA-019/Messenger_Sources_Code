package com.facebook.memories.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMemoriesJNI.class */
public class MailboxMemoriesJNI {
    static {
        C0il.A0B("mailboxmemoriesjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIJOOOOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native Object dispatchDasmOIOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOJOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOOOOZ(int i, Object obj, Object obj2, Object obj3, boolean z);

    public static final native Object dispatchOIJOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchOIOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchOJJJOO(int i, long j, long j2, long j3, Object obj, Object obj2);

    public static final native Object dispatchOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchOJJOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVIJJJOO(int i, int i2, long j, long j2, long j3, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native List getHeaderFields();
}
