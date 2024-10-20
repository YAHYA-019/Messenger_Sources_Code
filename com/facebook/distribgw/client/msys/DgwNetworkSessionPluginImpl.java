package com.facebook.distribgw.client.msys;

import X.11T;
import X.C0il;
import X.C1eS;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.jni.HybridData;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: DgwNetworkSessionPluginImpl.class */
public final class DgwNetworkSessionPluginImpl {
    public static final C1eS Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1eS, java.lang.Object] */
    static {
        C0il.A0B("msysdgw-jni");
    }

    public DgwNetworkSessionPluginImpl(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService) {
        11T.A0F(scheduledExecutorService, 2);
        this.mHybridData = initHybrid(dGWClient, scheduledExecutorService);
    }

    public static final native HybridData initHybrid(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService);

    private final native void registerSessionHybrid(Object obj, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8);

    private final native boolean registerSessionHybridWithAccountSession(Object obj, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, boolean z8);

    private final native void startConnectionForUserImpl(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, boolean z5);

    private final native void unregisterSessionHybrid(Object obj);

    private final native void unregisterSessionHybridImpl(Object obj, Object obj2);

    public final native int getConnectionState(String str);

    public final void register(Mailbox mailbox, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        registerSessionHybrid(mailbox, "", "", j, z, z2, true, z4, false, z6, z7, z8);
    }

    public final boolean registerWithAccountSession(AccountSession accountSession, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6) {
        return registerSessionHybridWithAccountSession(accountSession, "", "", j, z, z2, true, z4, false, false, false, str, z6);
    }

    public final void startConnectionForUser(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, boolean z5) {
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        startConnectionForUserImpl(str, str2, "", z, z2, false, z4, str4, z5);
    }

    public final void unregister(NetworkSession networkSession, AuthData authData) {
        unregisterSessionHybridImpl(networkSession, authData);
    }
}
