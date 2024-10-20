package com.facebook.messenger.mcp.integration;

import X.C0il;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;
import com.facebook.msys.mci.AccountSession;

/* loaded from: MCPPluginsRegistryIntegration.class */
public class MCPPluginsRegistryIntegration {
    static {
        C0il.A0B("messengermcppluginregistryintegrationjni");
    }

    public static native void nativeDestroyMCPPluginsRegistry();

    public static native void nativePreregisterMCPPluginsRegistry(MessengerSessionlessMCPContext messengerSessionlessMCPContext);

    public static native void nativeRegisterAppAccountScope(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext);
}
