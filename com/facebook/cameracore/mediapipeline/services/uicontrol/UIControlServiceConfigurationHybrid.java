package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.C2447Gdo;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: UIControlServiceConfigurationHybrid.class */
public class UIControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C2447Gdo mConfiguration;
    public final UIControlServiceDelegateWrapper mWrapper;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UIControlServiceConfigurationHybrid(X.C2447Gdo r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceDelegateWrapper r0 = r0.A01
            r303 = r0
            r0 = r303
            r1 = 0
            r2 = -1
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.mConfiguration = r1
            r0 = r301
            r1 = r303
            r0.mWrapper = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceConfigurationHybrid.<init>(X.Gdo):void");
    }

    public static native HybridData initHybrid(UIControlServiceDelegateWrapper uIControlServiceDelegateWrapper, float f, int i);
}
