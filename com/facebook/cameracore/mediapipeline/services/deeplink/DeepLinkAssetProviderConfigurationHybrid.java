package com.facebook.cameracore.mediapipeline.services.deeplink;

import X.GdY;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: DeepLinkAssetProviderConfigurationHybrid.class */
public class DeepLinkAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final GdY mConfiguration;

    public DeepLinkAssetProviderConfigurationHybrid(GdY gdY) {
        super(initHybrid(gdY.A00));
        this.mConfiguration = gdY;
    }

    public static native HybridData initHybrid(Map map);
}
