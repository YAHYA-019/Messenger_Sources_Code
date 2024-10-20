package com.facebook.ohai;

import X.11T;
import X.C0il;
import X.C10544ts;
import com.facebook.jni.HybridData;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;

/* loaded from: OhaiPlugin.class */
public final class OhaiPlugin {
    public static final C10544ts Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4ts, java.lang.Object] */
    static {
        C0il.A0B("msysohai-jni");
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void registerSessionHybrid(Object obj, String str, double d, double d2, boolean z, double d3, boolean z2, String str2, boolean z3, String str3, double d4, boolean z4);

    private final native void unregisterSessionHybrid(Object obj, Object obj2);

    public final void register(Mailbox mailbox, String str, double d, double d2, boolean z, double d3, boolean z2, String str2, boolean z3, String str3, double d4, boolean z4) {
        11T.A0F(mailbox, 0);
        11T.A0F(str, 1);
        11T.A0F(str2, 7);
        11T.A0F(str3, 9);
        registerSessionHybrid(mailbox, str, d, d2, z, d3, z2, str2, z3, str3, d4, z4);
    }

    public final void unregister(NetworkSession networkSession, AuthData authData) {
        11T.A0F(networkSession, 0);
        11T.A0F(authData, 1);
        unregisterSessionHybrid(networkSession, authData);
    }
}
