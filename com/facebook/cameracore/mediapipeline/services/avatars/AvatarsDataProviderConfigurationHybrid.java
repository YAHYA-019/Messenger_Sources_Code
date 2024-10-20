package com.facebook.cameracore.mediapipeline.services.avatars;

import X.C0il;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: AvatarsDataProviderConfigurationHybrid.class */
public class AvatarsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AvatarsDataProviderConfigurationHybrid $redex_init_class = null;

    static {
        C0il.A0B("avatarsdataprovider");
    }

    public static native HybridData initHybrid(String str, String str2, int i, AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge, AvatarsNativeInputDelegate avatarsNativeInputDelegate);
}
