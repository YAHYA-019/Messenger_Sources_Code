package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.11T;
import X.C0il;
import X.C2450Gdr;
import X.HGx;
import X.Hy3;
import X.I2f;
import X.JEQ;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.jni.HybridData;

/* loaded from: PersistenceServiceModule.class */
public final class PersistenceServiceModule extends ServiceModule {
    public static final HGx Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HGx] */
    static {
        C0il.A0B("arpersistenceservice");
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }

    public static final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        if (i2f == null) {
            return null;
        }
        Hy3 hy3 = C2450Gdr.A05;
        if (!i2f.A08.containsKey(hy3)) {
            return null;
        }
        C2450Gdr c2450Gdr = (C2450Gdr) i2f.A01(hy3);
        11T.A0F(c2450Gdr, 1);
        PersistenceServiceDelegateHybrid AJu = c2450Gdr.A04.AJu();
        PersistenceServiceDelegateHybrid AJu2 = c2450Gdr.A03.AJu();
        PersistenceServiceDelegateHybrid AJu3 = c2450Gdr.A00.AJu();
        JEQ jeq = c2450Gdr.A01;
        PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid = null;
        PersistenceServiceDelegateHybrid AJu4 = jeq != null ? jeq.AJu() : null;
        JEQ jeq2 = c2450Gdr.A02;
        if (jeq2 != null) {
            persistenceServiceDelegateHybrid = jeq2.AJu();
        }
        HybridData initHybrid = PersistenceServiceConfigurationHybrid.initHybrid(AJu, AJu2, AJu3, AJu4, persistenceServiceDelegateHybrid);
        11T.A0D(initHybrid);
        return new ServiceConfiguration(initHybrid);
    }
}
