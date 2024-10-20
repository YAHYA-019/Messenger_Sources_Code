package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.C0il;
import X.HGl;
import X.Hi2;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper;
import com.facebook.jni.HybridData;

/* loaded from: WorldTrackerDataProviderConfigurationHybrid.class */
public final class WorldTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final HGl Companion = new Object();
    public final Hi2 configuration;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HGl, java.lang.Object] */
    static {
        C0il.A0B("worldtrackerdataprovider");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WorldTrackerDataProviderConfigurationHybrid(X.Hi2 r302) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.A01
            r303 = r0
            r0 = r302
            int r0 = r0.A02
            r304 = r0
            r0 = r302
            boolean r0 = r0.A05
            r305 = r0
            r0 = r302
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r0 = r0.A03
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r302
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper r0 = r0.A04
            r307 = r0
            r0 = r307
            X.11T.A0A(r0)
            r0 = r302
            java.lang.String r0 = r0.A00
            r308 = r0
            r0 = r308
            X.11T.A0A(r0)
            r0 = r303
            r1 = r304
            r2 = r305
            r3 = 1
            r4 = 0
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = 0
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r309 = r0
            r0 = r309
            X.11T.A0D(r0)
            r0 = r301
            r1 = r309
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.configuration = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid.<init>(X.Hi2):void");
    }

    public static final native HybridData initHybrid(int i, int i2, boolean z, boolean z2, int i3, DeviceConfig deviceConfig, WorldTrackingDataProviderDelegateWrapper worldTrackingDataProviderDelegateWrapper, String str, boolean z3);
}
