package com.facebook.wearable.common.comms.hera.shared.engine.config;

import X.11T;
import X.1BK;
import X.2aI;
import X.C00m;
import X.GOn;
import X.GOo;
import X.JHE;
import X.JJN;
import X.MQc;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy;
import com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy;
import com.meta.wearable.comms.calling.hera.engine.video.FeatureVideoProxy;

/* loaded from: HeraCallEngineConfigBuilder.class */
public final class HeraCallEngineConfigBuilder {
    public boolean enableRecorder;
    public String tag = "UNNAMED";
    public boolean includeProfilePicture = true;
    public final HeraContext heraContext = new HeraContext();

    public final HeraCallEngineConfig build() {
        return new HeraCallEngineConfig(this.tag, this.heraContext, this.includeProfilePicture, this.enableRecorder);
    }

    public final HeraCallEngineConfigBuilder setCallEngineConnectionsFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(MQc.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setCoroutineScopeFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(2aI.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setEnableRecorder(boolean z) {
        this.enableRecorder = z;
        return this;
    }

    public final HeraCallEngineConfigBuilder setFeatureAudioProxyFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(FeatureAudioProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setFeatureCameraInfraProxyFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(FeatureCameraInfraProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setFeatureCameraProviderProxyFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(FeatureCameraProviderProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setFeatureCoreProxyFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(FeatureCoreProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setFeatureVideoProxyFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(FeatureVideoProxy.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setIncludeProfilePicture(boolean z) {
        this.includeProfilePicture = z;
        return this;
    }

    public final HeraCallEngineConfigBuilder setRemoteManagementEndpointFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(JHE.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setRemoteRtcEndpointFactory(C00m c00m) {
        HeraContext A0j = GOo.A0j(this, c00m);
        String A18 = GOn.A18(JJN.class);
        if (A18 == null) {
            throw 1BK.A0h();
        }
        A0j.provide(A18, c00m);
        return this;
    }

    public final HeraCallEngineConfigBuilder setTag(String str) {
        11T.A0F(str, 0);
        this.tag = str;
        return this;
    }
}
