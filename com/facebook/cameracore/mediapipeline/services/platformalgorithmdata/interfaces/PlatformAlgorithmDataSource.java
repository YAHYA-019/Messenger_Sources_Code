package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces;

import X.NAK;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

/* loaded from: PlatformAlgorithmDataSource.class */
public interface PlatformAlgorithmDataSource {
    void closeSession();

    void registerListener(NAK nak);

    void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}
