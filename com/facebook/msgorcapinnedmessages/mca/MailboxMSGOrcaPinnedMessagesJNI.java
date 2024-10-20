package com.facebook.msgorcapinnedmessages.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMSGOrcaPinnedMessagesJNI.class */
public class MailboxMSGOrcaPinnedMessagesJNI {
    static {
        C0il.A0B("mailboxmsgorcapinnedmessagesjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOIJJJOOO(int i, int i2, long j, long j2, long j3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIJJOOO(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIOOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchOIJOOZ(int i, int i2, long j, Object obj, Object obj2, boolean z);

    public static final native void dispatchVIJOOOOOZZZZ(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
