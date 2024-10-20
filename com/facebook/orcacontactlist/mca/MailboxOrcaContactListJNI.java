package com.facebook.orcacontactlist.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxOrcaContactListJNI.class */
public class MailboxOrcaContactListJNI {
    static {
        C0il.A0B("mailboxorcacontactlistjni");
    }

    public static final native Object dispatchCqlOIIOOOOOOOOZZZZZZZZZZZ(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
