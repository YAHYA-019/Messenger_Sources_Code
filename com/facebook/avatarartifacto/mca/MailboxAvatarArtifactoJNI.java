package com.facebook.avatarartifacto.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxAvatarArtifactoJNI.class */
public class MailboxAvatarArtifactoJNI {
    static {
        C0il.A0B("mailboxavatarartifactojni");
    }

    public static final native Object dispatchCqlOIIOOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchOIIOOOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}
