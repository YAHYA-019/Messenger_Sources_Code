package com.facebook.messenger.plugins.msysmobileconfigsessionedplugin;

import X.11T;
import X.1GD;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;

/* loaded from: MsysMobileConfigSessionedPluginPremailbox.class */
public final class MsysMobileConfigSessionedPluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysMobileConfigSessionedPluginPremailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(messengerSessionedMCPContext);
        11T.A0F(messengerSessionedMCPContext, 1);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigsessionedplugin.Premailbox
    public boolean MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBoolean(long j, boolean z) {
        return this.mAppContext.getMobileConfig().AZr(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigsessionedplugin.Premailbox
    public double MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDouble(long j, boolean z) {
        return this.mAppContext.getMobileConfig().AiH(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigsessionedplugin.Premailbox
    public int MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32(long j, boolean z) {
        return (int) this.mAppContext.getMobileConfig().Av9(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigsessionedplugin.Premailbox
    public long MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64(long j, boolean z) {
        return this.mAppContext.getMobileConfig().Av9(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigsessionedplugin.Premailbox
    public String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString(long j, boolean z) {
        return this.mAppContext.getMobileConfig().BDB(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigsessionedplugin.Premailbox
    public void MsysMobileConfigSessionedPluginPremailboxExtensionsDestroy() {
    }
}
