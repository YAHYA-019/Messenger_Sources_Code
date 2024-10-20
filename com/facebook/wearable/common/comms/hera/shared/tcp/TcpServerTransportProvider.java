package com.facebook.wearable.common.comms.hera.shared.tcp;

import X.11T;
import X.JR2;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider;

/* loaded from: TcpServerTransportProvider.class */
public final class TcpServerTransportProvider implements INativeTransportProvider {
    public final String listeningHost;
    public final int listeningPort;
    public final int localNodeId;
    public final HybridData mHybridData;

    public TcpServerTransportProvider(String str, int i, int i2) {
        11T.A0F(str, 1);
        this.listeningHost = str;
        this.listeningPort = i;
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

    public final String getListeningHost() {
        return this.listeningHost;
    }

    public final int getListeningPort() {
        return this.listeningPort;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public native boolean start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public native void stop();
}
