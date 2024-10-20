package com.facebook.messenger.plugins.msysisdialtoneproviderplugin;

import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    public MessengerSessionlessMCPContext mSessionlessAppContext;

    public Sessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        this.mSessionlessAppContext = messengerSessionlessMCPContext;
    }

    private boolean MsysIsDialtoneProviderPluginImpl_MsysIsDialtoneProviderIsDialtoneJNI() {
        return MsysIsDialtoneProviderPluginImpl_MsysIsDialtoneProviderIsDialtone();
    }

    public abstract boolean MsysIsDialtoneProviderPluginImpl_MsysIsDialtoneProviderIsDialtone();
}
