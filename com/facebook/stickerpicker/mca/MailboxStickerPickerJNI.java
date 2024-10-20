package com.facebook.stickerpicker.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStickerPickerJNI.class */
public class MailboxStickerPickerJNI {
    static {
        C0il.A0B("mailboxstickerpickerjni");
    }

    public static final native Object dispatchCqlOJJO(int i, long j, long j2, Object obj);

    public static final native Object dispatchCqlOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchCqlOJJOOZZZZ(int i, long j, long j2, Object obj, Object obj2, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmODIIIIOO(int i, double d, int i2, int i3, int i4, int i5, Object obj, Object obj2);

    public static final native Object dispatchDasmODIIJOO(int i, double d, int i2, int i3, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
