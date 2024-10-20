package com.facebook.wearable.common.comms.hera.shared.engine;

import X.JHE;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioApi;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi;
import com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreApi;

/* loaded from: IHeraClientCallEngine.class */
public interface IHeraClientCallEngine extends IHeraCallEngine {
    FeatureAudioApi getFeatureAudioApi();

    FeatureCameraApi getFeatureCameraApi();

    FeatureCoreApi getFeatureCoreApi();

    JHE getRemoteManagementEndpoint();

    void registerCameras();

    void registerDevice();

    void setRemoteManagementEndpoint(JHE jhe);
}
