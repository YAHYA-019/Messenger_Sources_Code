package com.facebook.translation.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxTranslationJNI.class */
public class MailboxTranslationJNI {
    static {
        C0il.A0B("mailboxtranslationjni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native List getHeaderFields();
}
