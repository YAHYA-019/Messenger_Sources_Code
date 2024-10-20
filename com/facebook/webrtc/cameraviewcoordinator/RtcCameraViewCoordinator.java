package com.facebook.webrtc.cameraviewcoordinator;

import com.facebook.cameracore.audiograph.AudioGraphClientProvider;

/* loaded from: RtcCameraViewCoordinator.class */
public interface RtcCameraViewCoordinator {
    void Clz(AudioGraphClientProvider audioGraphClientProvider);

    void suggestTargetFps(int i);

    int suggestVideoCaptureSettings(int i, int i2, int i3);

    void suggestVideoResolution(int i, int i2);
}
