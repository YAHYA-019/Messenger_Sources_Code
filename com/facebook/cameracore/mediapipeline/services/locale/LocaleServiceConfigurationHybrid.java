package com.facebook.cameracore.mediapipeline.services.locale;

import X.C2439Gdg;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: LocaleServiceConfigurationHybrid.class */
public class LocaleServiceConfigurationHybrid extends ServiceConfiguration {
    public final C2439Gdg mConfiguration;

    public LocaleServiceConfigurationHybrid(C2439Gdg c2439Gdg) {
        super(initHybrid(c2439Gdg.A00));
        this.mConfiguration = c2439Gdg;
    }

    public static native HybridData initHybrid(LocaleDataSource localeDataSource);
}
