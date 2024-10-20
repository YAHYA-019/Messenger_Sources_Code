package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.C0il;
import X.HGm;
import X.Hi2;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: WorldTrackerDataProviderModule.class */
public final class WorldTrackerDataProviderModule extends ServiceModule {
    public static final HGm Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HGm, java.lang.Object] */
    static {
        C0il.A0B("worldtrackerdataprovider");
    }

    public WorldTrackerDataProviderModule() {
        this.mHybridData = initHybrid();
    }

    private final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        Hi2 hi2;
        WorldTrackerDataProviderConfigurationHybrid worldTrackerDataProviderConfigurationHybrid = null;
        if (i2f != null && (hi2 = i2f.A04) != null) {
            worldTrackerDataProviderConfigurationHybrid = new WorldTrackerDataProviderConfigurationHybrid(hi2);
        }
        return worldTrackerDataProviderConfigurationHybrid;
    }
}
