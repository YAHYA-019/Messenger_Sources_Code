package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces;

/* loaded from: FaceTrackerDataProviderConfig.class */
public class FaceTrackerDataProviderConfig {
    public final int executionMode;
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;
    public final boolean useLazyFaceTracker;
    public final boolean useSynchronousFaceTracker;

    public FaceTrackerDataProviderConfig() {
        this(30000, 70000, 15000, false, false, 0);
    }

    public FaceTrackerDataProviderConfig(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = 70000;
        this.frameProcessorTimeToLive = 15000;
        this.useSynchronousFaceTracker = z;
        this.useLazyFaceTracker = z2;
        this.executionMode = i4;
    }

    public int getExecutionMode() {
        return this.executionMode;
    }

    public boolean getUseLazyFaceTracker() {
        return this.useLazyFaceTracker;
    }

    public boolean getUseSynchronousFaceTracker() {
        return this.useSynchronousFaceTracker;
    }
}
