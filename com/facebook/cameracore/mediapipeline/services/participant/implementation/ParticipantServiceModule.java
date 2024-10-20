package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.C0il;
import X.C2441Gdi;
import X.HGv;
import X.Hy3;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: ParticipantServiceModule.class */
public final class ParticipantServiceModule extends ServiceModule {
    public static final HGv Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HGv] */
    static {
        C0il.A0B("participantservice");
    }

    public ParticipantServiceModule() {
        this.mHybridData = initHybrid();
    }

    public static final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        if (i2f == null) {
            return null;
        }
        Hy3 hy3 = C2441Gdi.A01;
        if (i2f.A08.containsKey(hy3)) {
            return new ParticipantServiceConfigurationHybrid((C2441Gdi) i2f.A01(hy3));
        }
        return null;
    }
}
