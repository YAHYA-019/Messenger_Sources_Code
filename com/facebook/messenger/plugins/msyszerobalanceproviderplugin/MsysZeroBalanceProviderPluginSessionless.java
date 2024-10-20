package com.facebook.messenger.plugins.msyszerobalanceproviderplugin;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.2C1;
import X.C06w;
import X.C06z;
import com.facebook.messenger.mcp.sessionlesscontext.MessengerSessionlessMCPContext;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;

/* loaded from: MsysZeroBalanceProviderPluginSessionless.class */
public final class MsysZeroBalanceProviderPluginSessionless extends Sessionless {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(MsysZeroBalanceProviderPluginSessionless.class, "holder", "getHolder()Lcom/facebook/zero/zerobalance/holder/ZeroBalanceStateHolder;", 0), new C06w(MsysZeroBalanceProviderPluginSessionless.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0)};
    public final 1Br holder$delegate;
    public final 1Br mobileConfig$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysZeroBalanceProviderPluginSessionless(MessengerSessionlessMCPContext messengerSessionlessMCPContext) {
        super(messengerSessionlessMCPContext);
        11T.A0F(messengerSessionlessMCPContext, 1);
        this.holder$delegate = 1Bq.A00(66331);
        this.mobileConfig$delegate = 1Bq.A00(16385);
    }

    private final ZeroBalancePingController getHolder() {
        return (ZeroBalancePingController) this.holder$delegate.A00.get();
    }

    private final 1CO getMobileConfig() {
        return (1CO) this.mobileConfig$delegate.A00.get();
    }

    @Override // com.facebook.messenger.plugins.msyszerobalanceproviderplugin.Sessionless
    public String MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderCopyZeroBalanceState() {
        if (getMobileConfig().AZk(36325179827310976L)) {
            return getHolder().A03().logEvent;
        }
        return null;
    }

    @Override // com.facebook.messenger.plugins.msyszerobalanceproviderplugin.Sessionless
    public boolean MsysZeroBalanceProviderPluginImpl_MsysZeroBalanceProviderIsZeroBalance() {
        2C1 A03;
        boolean z = false;
        if (getMobileConfig().AZk(36325179827310976L) && ((A03 = getHolder().A03()) == 2C1.A04 || A03 == 2C1.A02)) {
            z = true;
        }
        return z;
    }
}
