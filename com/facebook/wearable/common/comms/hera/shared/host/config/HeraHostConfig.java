package com.facebook.wearable.common.comms.hera.shared.host.config;

import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHostEventLogger;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import kotlin.jvm.functions.Function1;

/* loaded from: HeraHostConfig.class */
public final class HeraHostConfig extends C04v {
    public final AudioIntegrationType audioIntegrationType;
    public final Function1 callEngineFactory;
    public final boolean enableFusionCamera;
    public final HeraContext heraContext;
    public final IHeraHostEventLogger heraHostEventLogger;

    public HeraHostConfig(HeraContext heraContext, boolean z, AudioIntegrationType audioIntegrationType, Function1 function1, IHeraHostEventLogger iHeraHostEventLogger) {
        7zR.A1N(heraContext, audioIntegrationType);
        this.heraContext = heraContext;
        this.enableFusionCamera = z;
        this.audioIntegrationType = audioIntegrationType;
        this.callEngineFactory = function1;
        this.heraHostEventLogger = iHeraHostEventLogger;
    }

    public static /* synthetic */ HeraHostConfig copy$default(HeraHostConfig heraHostConfig, HeraContext heraContext, boolean z, AudioIntegrationType audioIntegrationType, Function1 function1, IHeraHostEventLogger iHeraHostEventLogger, int i, Object obj) {
        if ((i & 1) != 0) {
            heraContext = heraHostConfig.heraContext;
        }
        if ((i & 2) != 0) {
            z = heraHostConfig.enableFusionCamera;
        }
        if ((i & 4) != 0) {
            audioIntegrationType = heraHostConfig.audioIntegrationType;
        }
        if ((i & 8) != 0) {
            function1 = heraHostConfig.callEngineFactory;
        }
        if ((i & 16) != 0) {
            iHeraHostEventLogger = heraHostConfig.heraHostEventLogger;
        }
        return heraHostConfig.copy(heraContext, z, audioIntegrationType, function1, iHeraHostEventLogger);
    }

    public final HeraContext component1() {
        return this.heraContext;
    }

    public final boolean component2() {
        return this.enableFusionCamera;
    }

    public final AudioIntegrationType component3() {
        return this.audioIntegrationType;
    }

    public final Function1 component4() {
        return this.callEngineFactory;
    }

    public final IHeraHostEventLogger component5() {
        return this.heraHostEventLogger;
    }

    public final HeraHostConfig copy(HeraContext heraContext, boolean z, AudioIntegrationType audioIntegrationType, Function1 function1, IHeraHostEventLogger iHeraHostEventLogger) {
        4YV.A1N(heraContext, audioIntegrationType);
        return new HeraHostConfig(heraContext, z, audioIntegrationType, function1, iHeraHostEventLogger);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HeraHostConfig)) {
                return false;
            }
            HeraHostConfig heraHostConfig = (HeraHostConfig) obj;
            if (!11T.A0O(this.heraContext, heraHostConfig.heraContext) || this.enableFusionCamera != heraHostConfig.enableFusionCamera || this.audioIntegrationType != heraHostConfig.audioIntegrationType || !11T.A0O(this.callEngineFactory, heraHostConfig.callEngineFactory) || !11T.A0O(this.heraHostEventLogger, heraHostConfig.heraHostEventLogger)) {
                return false;
            }
        }
        return true;
    }

    public final AudioIntegrationType getAudioIntegrationType() {
        return this.audioIntegrationType;
    }

    public final Function1 getCallEngineFactory() {
        return this.callEngineFactory;
    }

    public final boolean getEnableFusionCamera() {
        return this.enableFusionCamera;
    }

    public final HeraContext getHeraContext() {
        return this.heraContext;
    }

    public final IHeraHostEventLogger getHeraHostEventLogger() {
        return this.heraHostEventLogger;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.audioIntegrationType, (1BL.A03(this.heraContext) + AnonymousClass002.A00(this.enableFusionCamera ? 1 : 0)) * 31) + AnonymousClass001.A02(this.callEngineFactory)) * 31) + 4YU.A03(this.heraHostEventLogger);
    }

    public String toString() {
        return super.toString();
    }
}
