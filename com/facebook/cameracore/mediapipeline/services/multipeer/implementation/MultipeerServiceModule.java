package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.C0il;
import X.C2440Gdh;
import X.HGu;
import X.Hy3;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: MultipeerServiceModule.class */
public final class MultipeerServiceModule extends ServiceModule {
    public static final HGu Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HGu] */
    static {
        C0il.A0B("multipeerservice");
    }

    public MultipeerServiceModule() {
        this.mHybridData = initHybrid();
    }

    public static final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        if (i2f == null) {
            return null;
        }
        Hy3 hy3 = C2440Gdh.A01;
        if (i2f.A08.containsKey(hy3)) {
            return new MultipeerServiceConfigurationHybrid((C2440Gdh) i2f.A01(hy3));
        }
        return null;
    }
}
