package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import X.HFP;
import X.HGj;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;

/* loaded from: FaceTrackerDataProviderConfigurationHybrid.class */
public final class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final HGj Companion = new Object();
    public final HFP configuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FaceTrackerDataProviderConfigurationHybrid(X.HFP r302) {
        /*
            r301 = this;
            r0 = r302
            java.lang.Integer r0 = r0.A01
            r303 = r0
            r0 = r303
            int r0 = r0.intValue()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            r0 = 1
            r304 = r0
        L10:
            r0 = r302
            java.lang.String[] r0 = r0.A06
            r305 = r0
            r0 = r305
            X.11T.A0A(r0)
            r0 = r302
            java.lang.String[] r0 = r0.A05
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r302
            java.lang.String r0 = r0.A04
            r307 = r0
            r0 = r302
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler r0 = r0.A00
            r308 = r0
            r0 = r302
            java.lang.Integer r0 = r0.A02
            r309 = r0
            r0 = r302
            java.lang.Integer r0 = r0.A03
            r310 = r0
            r0 = r304
            r1 = r305
            r2 = r306
            r3 = r307
            r4 = r308
            r5 = 0
            r6 = r309
            r7 = r310
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2, r3, r4, r5, r6, r7)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.configuration = r1
            return
        L5b:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid.<init>(X.HFP):void");
    }

    public static final native HybridData initHybrid(int i, String[] strArr, String[] strArr2, String str, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler, boolean z, Integer num, Integer num2);
}
