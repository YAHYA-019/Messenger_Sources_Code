package com.facebook.aibots.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAIBotsJNI.class */
public class MailboxAIBotsJNI {
    static {
        C0il.A0B("mailboxaibotsjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOZ(int i, long j, Object obj, boolean z);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
