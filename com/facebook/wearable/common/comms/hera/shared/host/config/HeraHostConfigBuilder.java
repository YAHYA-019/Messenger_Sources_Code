package com.facebook.wearable.common.comms.hera.shared.host.config;

import X.11T;
import X.1BK;
import X.2aI;
import X.AbstractC2326GOr;
import X.C00m;
import X.GOn;
import X.JHE;
import X.JLU;
import X.JLV;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHostEventLogger;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfigBuilder;
import com.facebook.wearable.common.comms.hera.shared.lifecycle.ILifecycleObserver;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy;
import kotlin.jvm.functions.Function1;

/* loaded from: HeraHostConfigBuilder.class */
public final class HeraHostConfigBuilder {
    public Function1 callEngineFactory;
    public boolean fusionCameraEnabled;
    public IHeraHostEventLogger heraHostEventLogger;
    public final HeraContext heraContext = new HeraContext();
    public AudioIntegrationType audioIntegrationType = AudioIntegrationType.DISABLED;

    public final HeraHostConfig build() {
        return new HeraHostConfig(this.heraContext, this.fusionCameraEnabled, this.audioIntegrationType, this.callEngineFactory, this.heraHostEventLogger);
    }

    public final HeraHostConfigBuilder setAudioEndpointFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(JLU.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setAudioIntegrationType(AudioIntegrationType audioIntegrationType) {
        11T.A0F(audioIntegrationType, 0);
        this.audioIntegrationType = audioIntegrationType;
        return this;
    }

    public final HeraHostConfigBuilder setCallEngineConfigBuilderFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(HeraCallEngineConfigBuilder.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setCallEngineFactory(Function1 function1) {
        11T.A0F(function1, 0);
        this.callEngineFactory = function1;
        return this;
    }

    public final HeraHostConfigBuilder setCameraOutputRotation(int i) {
        HeraContext heraContext = this.heraContext;
        CameraOutputRotation cameraOutputRotation = new CameraOutputRotation(i);
        String A18 = GOn.A18(CameraOutputRotation.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        heraContext.provide(A18, cameraOutputRotation);
        return this;
    }

    public final HeraHostConfigBuilder setCoroutineScopeFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(2aI.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setEventLogger(IHeraHostEventLogger iHeraHostEventLogger) {
        this.heraHostEventLogger = iHeraHostEventLogger;
        return this;
    }

    public final HeraHostConfigBuilder setFeatureAudioProxyFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(FeatureAudioProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setFeatureCameraInfraProxyFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(FeatureCameraInfraProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setFeatureCameraProviderProxyFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(FeatureCameraProviderProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setFusionCameraEnabled(boolean z) {
        this.fusionCameraEnabled = z;
        return this;
    }

    public final HeraHostConfigBuilder setLifecycleObserverFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(ILifecycleObserver.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setRemoteManagementEndpointFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(JHE.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setVideoBridgeFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(IHeraVideoBridge.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }

    public final HeraHostConfigBuilder setVideoEndpointFactory(C00m c00m) {
        HeraContext A0Z = AbstractC2326GOr.A0Z(this, c00m);
        String A18 = GOn.A18(JLV.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0Z.provide(A18, c00m);
        return this;
    }
}
