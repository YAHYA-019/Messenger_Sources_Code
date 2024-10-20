package com.facebook.featurelimits.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxFeatureLimitsJNI.class */
public class MailboxFeatureLimitsJNI {
    static {
        C0il.A0B("mailboxfeaturelimitsjni");
    }

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();
}
