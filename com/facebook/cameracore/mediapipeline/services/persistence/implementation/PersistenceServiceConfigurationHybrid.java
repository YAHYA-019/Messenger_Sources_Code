package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.HGw;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.jni.HybridData;

/* loaded from: PersistenceServiceConfigurationHybrid.class */
public final class PersistenceServiceConfigurationHybrid extends ServiceConfiguration {
    public static final HGw Companion = new Object();

    public static final native HybridData initHybrid(PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid2, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid3, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid4, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid5);
}
