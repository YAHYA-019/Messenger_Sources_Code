package com.facebook.msgpinnedmessages.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMSGPinnedMessagesJNI.class */
public class MailboxMSGPinnedMessagesJNI {
    static {
        C0il.A0B("mailboxmsgpinnedmessagesjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOJJO(int i, long j, long j2, Object obj);

    public static final native Object dispatchDasmOIJJJOOO(int i, int i2, long j, long j2, long j3, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIJJOOO(int i, int i2, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIOOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchOIJOOZ(int i, int i2, long j, Object obj, Object obj2, boolean z);

    public static final native void dispatchVIJJJO(int i, int i2, long j, long j2, long j3, Object obj);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
