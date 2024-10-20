package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.C0il;
import X.HPI;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: LocationDataProviderModule.class */
public class LocationDataProviderModule extends ServiceModule {
    static {
        C0il.A0B("locationdataprovider");
    }

    public LocationDataProviderModule() {
        this.mHybridData = initHybrid();
    }

    public static native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        HPI hpi;
        if (i2f == null || (hpi = i2f.A03) == null) {
            return null;
        }
        return new LocationDataProviderConfigurationHybrid(hpi);
    }
}
