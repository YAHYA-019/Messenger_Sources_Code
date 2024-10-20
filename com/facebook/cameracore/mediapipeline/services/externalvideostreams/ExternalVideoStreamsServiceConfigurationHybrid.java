package com.facebook.cameracore.mediapipeline.services.externalvideostreams;

import X.GdV;
import X.Qz7;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.externalvideostreamsdelegate.ExternalVideoStreamsDelegateManager;
import com.facebook.jni.HybridData;

/* loaded from: ExternalVideoStreamsServiceConfigurationHybrid.class */
public abstract class ExternalVideoStreamsServiceConfigurationHybrid extends ServiceConfiguration {
    public static final Qz7 Companion = new Object();
    public final GdV serviceConfiguration;

    public static final native HybridData initHybrid(ExternalVideoStreamsDelegateManager externalVideoStreamsDelegateManager);
}
