package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.HPI;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;

/* loaded from: LocationDataProviderConfigurationHybrid.class */
public class LocationDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final HPI mConfiguration;

    public LocationDataProviderConfigurationHybrid(HPI hpi) {
        this.mHybridData = initHybrid();
        this.mConfiguration = hpi;
    }

    private LocationDataProvider createLocationDataProvider() {
        LocationDataProviderImpl locationDataProviderImpl = new LocationDataProviderImpl();
        this.mConfiguration.A00 = locationDataProviderImpl;
        return locationDataProviderImpl;
    }

    private native HybridData initHybrid();
}
