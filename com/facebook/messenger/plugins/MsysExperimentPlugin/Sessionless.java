package com.facebook.messenger.plugins.MsysExperimentPlugin;

import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    public MessengerSessionlessMCPContext mSessionlessAppContext;

    public Sessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        this.mSessionlessAppContext = messengerSessionlessMCPContext;
    }

    private int MsysExperimentPluginImpl_MsysExperimentMCIDatabaseHealthSamplingRateJNI(int i, boolean z) {
        return MsysExperimentPluginImpl_MsysExperimentMCIDatabaseHealthSamplingRate(i, z);
    }

    private boolean MsysExperimentPluginImpl_MsysExperimentUseComputeMD5V2JNI(boolean z, boolean z2) {
        return MsysExperimentPluginImpl_MsysExperimentUseComputeMD5V2(z, z2);
    }

    public abstract int MsysExperimentPluginImpl_MsysExperimentMCIDatabaseHealthSamplingRate(int i, boolean z);

    public abstract boolean MsysExperimentPluginImpl_MsysExperimentUseComputeMD5V2(boolean z, boolean z2);
}
