package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.C2436Gdd;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: ExternalAssetProviderConfigurationHybrid.class */
public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final C2436Gdd mConfiguration;

    public ExternalAssetProviderConfigurationHybrid(C2436Gdd c2436Gdd) {
        this.mConfiguration = c2436Gdd;
        this.mHybridData = initHybrid(c2436Gdd.A00);
    }

    public static native HybridData initHybrid(ExternalAssetLocalDataSource externalAssetLocalDataSource);

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration
    public void destroy() {
        super.destroy();
    }
}
