package com.facebook.cameracore.mediapipeline.services.instruction;

import X.C2438Gdf;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: InstructionServiceConfigurationHybrid.class */
public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final C2438Gdf mConfiguration;

    public InstructionServiceConfigurationHybrid(C2438Gdf c2438Gdf) {
        super(initHybrid(c2438Gdf.A00));
        this.mConfiguration = c2438Gdf;
    }

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);
}
