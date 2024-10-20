package com.facebook.wearable.common.comms.hera.shared.tcp;

import X.11T;
import X.JR2;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider;

/* loaded from: TcpClientTransportProvider.class */
public final class TcpClientTransportProvider implements INativeTransportProvider {
    public final int localNodeId;
    public final HybridData mHybridData;
    public final String remoteHost;
    public final int remotePort;

    public TcpClientTransportProvider(String str, int i, int i2) {
        11T.A0F(str, 1);
        this.remoteHost = str;
        this.remotePort = i;
        this.localNodeId = i2;
        HeraNativeLoader.load();
        this.mHybridData = initHybrid(str, i, i2);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(String str, int i, int i2);

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public String getIdentifier() {
        return JR2.A0U(this);
    }

    public final String getRemoteHost() {
        return this.remoteHost;
    }

    public final int getRemotePort() {
        return this.remotePort;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public native boolean start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public native void stop();
}
