package com.facebook.messenger.plugins.MsysExperimentPlugin;

import X.1BK;
import X.1GD;
import X.2yD;
import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;

/* loaded from: MsysExperimentPluginSessionless.class */
public class MsysExperimentPluginSessionless extends Sessionless {
    public MsysExperimentPluginSessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        super(messengerSessionlessMCPContext);
    }

    @Override // com.facebook.messenger.plugins.MsysExperimentPlugin.Sessionless
    public int MsysExperimentPluginImpl_MsysExperimentMCIDatabaseHealthSamplingRate(int i, boolean z) {
        2yD A0N = 1BK.A0N(this.mSessionlessAppContext.sessionlessMobileConfig);
        long Auy = z ? A0N.Auy(18583266928299728L) : A0N.Av9(1GD.A07, 18583266928299728L);
        return Auy > 2147483647L ? (-1) >>> 1 : (int) Auy;
    }

    @Override // com.facebook.messenger.plugins.MsysExperimentPlugin.Sessionless
    public boolean MsysExperimentPluginImpl_MsysExperimentUseComputeMD5V2(boolean z, boolean z2) {
        2yD r0 = (2yD) this.mSessionlessAppContext.sessionlessMobileConfig.get();
        return z2 ? r0.AZk(18311266649002881L) : r0.AZr(1GD.A07, 18311266649002881L);
    }
}
