package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.11T;
import X.C2445Gdm;
import X.Qz2;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: PlatformEventsDataProviderConfigurationHybrid.class */
public final class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final Qz2 Companion = new Object();
    public final C2445Gdm configuration;
    public final PlatformEventsServiceObjectsWrapper objectsWrapper;

    public PlatformEventsDataProviderConfigurationHybrid(C2445Gdm c2445Gdm) {
        11T.A0F(c2445Gdm, 1);
        this.configuration = c2445Gdm;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = new PlatformEventsServiceObjectsWrapper(c2445Gdm.A01, c2445Gdm.A00);
        this.objectsWrapper = platformEventsServiceObjectsWrapper;
        this.mHybridData = initHybrid(platformEventsServiceObjectsWrapper);
    }

    public static final native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);
}
