package com.facebook.searchaibots.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxSearchAiBotsJNI.class */
public class MailboxSearchAiBotsJNI {
    static {
        C0il.A0B("mailboxsearchaibotsjni");
    }

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchDasmOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields();
}
