package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.HfZ;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces.HandTrackingDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider;
import com.facebook.cameracore.mediapipeline.sessionrecording.interfaces.SessionRecordingConfig;
import com.facebook.cameracore.mediapipeline.sessionreplay.interfaces.SessionReplayConfig;

/* loaded from: EffectServiceHostConfig.class */
public class EffectServiceHostConfig {
    public final FaceTrackerDataProviderConfig mFaceTrackerDataProviderConfig;
    public final FrameBrightnessDataProviderConfig mFrameBrightnessDataProviderConfig;
    public final SlamLibraryProvider mSlamLibraryProvider;
    public final WorldTrackerDataProviderConfigWithSlam mWorldTrackerDataProviderConfigWithSlam;

    public EffectServiceHostConfig(HfZ hfZ) {
        this.mFaceTrackerDataProviderConfig = hfZ.A01;
        this.mFrameBrightnessDataProviderConfig = hfZ.A02;
        this.mWorldTrackerDataProviderConfigWithSlam = hfZ.A00;
        this.mSlamLibraryProvider = hfZ.A03;
    }

    public int getConfigType() {
        return 0;
    }

    public FaceTrackerDataProviderConfig getFaceTrackerDataProviderConfig() {
        return this.mFaceTrackerDataProviderConfig;
    }

    public FrameBrightnessDataProviderConfig getFrameBrightnessDataProviderConfig() {
        return this.mFrameBrightnessDataProviderConfig;
    }

    public HandTrackingDataProviderConfig getHandTrackingDataProviderConfig() {
        return null;
    }

    public SessionRecordingConfig getSessionRecordingConfig() {
        return null;
    }

    public SessionReplayConfig getSessionReplayConfig() {
        return null;
    }

    public SlamLibraryProvider getSlamLibraryProvider() {
        return this.mSlamLibraryProvider;
    }

    public WorldTrackerDataProviderConfigWithSlam getWorldTrackerDataProviderConfigWithSlam() {
        return this.mWorldTrackerDataProviderConfigWithSlam;
    }

    public boolean isGalleryPickerEnabled() {
        return false;
    }
}
