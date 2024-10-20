package com.facebook.mantle.api;

import X.7zT;
import X.C0il;
import com.facebook.msys.mca.Mailbox;

/* loaded from: MantleApi.class */
public final class MantleApi {
    public static final MantleApi INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.mantle.api.MantleApi, java.lang.Object] */
    static {
        C0il.A0B("mantle-api");
    }

    public static final void deleteModel(Mailbox mailbox, String str, String str2) {
        7zT.A1S(mailbox, str, str2);
        nativeDeleteModel(mailbox, str, str2);
    }

    public static final native void nativeDeleteModel(Object obj, String str, String str2);
}
