package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.C0il;
import X.Hh4;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: AudioServiceModule.class */
public class AudioServiceModule extends ServiceModule {
    static {
        C0il.A0B("audiographservice");
    }

    public AudioServiceModule() {
        this.mHybridData = initHybrid();
    }

    public static native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        Hh4 hh4;
        if (i2f == null || (hh4 = i2f.A06) == null) {
            return null;
        }
        return new AudioServiceConfigurationHybrid(hh4);
    }
}
