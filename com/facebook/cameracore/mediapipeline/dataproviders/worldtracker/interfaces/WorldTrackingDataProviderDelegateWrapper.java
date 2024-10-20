package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.JCj;
import X.Qnh;

/* loaded from: WorldTrackingDataProviderDelegateWrapper.class */
public class WorldTrackingDataProviderDelegateWrapper {
    public final JCj mDelegate;

    public WorldTrackingDataProviderDelegateWrapper(JCj jCj) {
        this.mDelegate = jCj;
    }

    public void onWorldTrackingConfidenceUpdated(int i) {
        if (this.mDelegate == null || i < 0) {
            return;
        }
        Qnh.values();
    }
}
