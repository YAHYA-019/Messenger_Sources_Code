package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.C2440Gdh;
import X.HGt;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: MultipeerServiceConfigurationHybrid.class */
public final class MultipeerServiceConfigurationHybrid extends ServiceConfiguration {
    public static final HGt Companion = new Object();
    public final C2440Gdh configuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultipeerServiceConfigurationHybrid(X.C2440Gdh r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r302
            X.JCl r0 = r0.A00
            r303 = r0
            com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge r0 = new com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r304
            r1 = r303
            r0.delegate = r1
            r0 = r304
            com.facebook.jni.HybridData r0 = initHybrid(r0)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.configuration = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceConfigurationHybrid.<init>(X.Gdh):void");
    }

    public static final native HybridData initHybrid(MultipeerServiceDelegateBridge multipeerServiceDelegateBridge);
}
