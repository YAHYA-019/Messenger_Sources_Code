package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C2434Gdb;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: CameraControlServiceConfigurationHybrid.class */
public class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C2434Gdb mConfiguration;

    public CameraControlServiceConfigurationHybrid(C2434Gdb c2434Gdb) {
        super(initHybrid(c2434Gdb.A00));
        this.mConfiguration = c2434Gdb;
    }

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);
}
