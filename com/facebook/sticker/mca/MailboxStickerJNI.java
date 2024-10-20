package com.facebook.sticker.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStickerJNI.class */
public class MailboxStickerJNI {
    static {
        C0il.A0B("mailboxstickerjni");
    }

    public static final native Object dispatchCqlOJJOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOOZZ(int i, long j, Object obj, Object obj2, boolean z, boolean z2);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native Object dispatchDasmODIIIOOOOOZZZ(int i, double d, int i2, int i3, int i4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, boolean z3);

    public static final native Object dispatchDasmODIIJOOOO(int i, double d, int i2, int i3, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
