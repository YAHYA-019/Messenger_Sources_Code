package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.HGs;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: ServiceMessageChannelHybrid.class */
public final class ServiceMessageChannelHybrid extends ServiceConfiguration {
    public static final HGs Companion = new Object();

    public static final native HybridData initHybrid(ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid, int i);
}
