package com.facebook.filteredthreadsranges.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFilteredThreadsRangesJNI.class */
public class MailboxFilteredThreadsRangesJNI {
    static {
        C0il.A0B("mailboxfilteredthreadsrangesjni");
    }

    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchDasmOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOIJOOOOOOOOOOOZZ(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, boolean z, boolean z2);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
