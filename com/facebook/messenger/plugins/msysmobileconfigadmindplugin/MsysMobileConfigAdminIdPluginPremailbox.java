package com.facebook.messenger.plugins.msysmobileconfigadmindplugin;

import X.11T;
import X.1Br;
import X.1GD;
import X.2yD;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;

/* loaded from: MsysMobileConfigAdminIdPluginPremailbox.class */
public final class MsysMobileConfigAdminIdPluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysMobileConfigAdminIdPluginPremailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(messengerSessionedMCPContext);
        11T.A0F(messengerSessionedMCPContext, 1);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigadmindplugin.Premailbox
    public boolean MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetBoolean(long j, boolean z) {
        if (z) {
            1Br.A07(this.mAppContext.mobileConfigAdminId$delegate).AZr(1GD.A06, j);
        }
        return 2yD.A03(1Br.A07(this.mAppContext.mobileConfigAdminId$delegate), j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigadmindplugin.Premailbox
    public double MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetDouble(long j, boolean z) {
        return 1Br.A07(this.mAppContext.mobileConfigAdminId$delegate).AiH(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigadmindplugin.Premailbox
    public int MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt32(long j, boolean z) {
        return (int) 1Br.A07(this.mAppContext.mobileConfigAdminId$delegate).Av9(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigadmindplugin.Premailbox
    public long MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetInt64(long j, boolean z) {
        return 1Br.A07(this.mAppContext.mobileConfigAdminId$delegate).Av9(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigadmindplugin.Premailbox
    public String MsysMobileConfigAdminIdImpl_MCIMobileConfigExtensionAdminIdGetString(long j, boolean z) {
        return 1Br.A07(this.mAppContext.mobileConfigAdminId$delegate).BDB(z ? 1GD.A06 : 1GD.A07, j);
    }

    @Override // com.facebook.messenger.plugins.msysmobileconfigadmindplugin.Premailbox
    public void MsysMobileConfigAdminIdPluginPremailboxExtensionsDestroy() {
    }
}
