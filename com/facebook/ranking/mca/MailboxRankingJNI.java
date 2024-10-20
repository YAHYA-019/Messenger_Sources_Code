package com.facebook.ranking.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxRankingJNI.class */
public class MailboxRankingJNI {
    static {
        C0il.A0B("mailboxrankingjni");
    }

    public static final native Object dispatchCqlOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOIOOOOOOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static final native Object dispatchDasmOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native Object dispatchDasmOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native List getHeaderFields();
}
