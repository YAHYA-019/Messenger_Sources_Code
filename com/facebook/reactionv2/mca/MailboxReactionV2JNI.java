package com.facebook.reactionv2.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxReactionV2JNI.class */
public class MailboxReactionV2JNI {
    static {
        C0il.A0B("mailboxreactionv2jni");
    }

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOIJJJJJOOOOOOZ(int i, int i2, long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z);

    public static final native Object dispatchDasmOIJJJJOOOO(int i, int i2, long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
