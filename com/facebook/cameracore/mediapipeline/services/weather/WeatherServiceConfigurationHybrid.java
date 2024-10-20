package com.facebook.cameracore.mediapipeline.services.weather;

import X.C2444Gdl;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: WeatherServiceConfigurationHybrid.class */
public class WeatherServiceConfigurationHybrid extends ServiceConfiguration {
    public final C2444Gdl mConfiguration;

    public WeatherServiceConfigurationHybrid(C2444Gdl c2444Gdl) {
        super(initHybrid(c2444Gdl.A00));
        this.mConfiguration = c2444Gdl;
    }

    public static native HybridData initHybrid(WeatherServiceDataSource weatherServiceDataSource);
}
