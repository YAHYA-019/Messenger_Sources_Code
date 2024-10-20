package com.facebook.typingindicator.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxTypingIndicatorJNI.class */
public class MailboxTypingIndicatorJNI {
    static {
        C0il.A0B("mailboxtypingindicatorjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native void dispatchVOOOZZ(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2);

    public static final native List getHeaderFields();
}
