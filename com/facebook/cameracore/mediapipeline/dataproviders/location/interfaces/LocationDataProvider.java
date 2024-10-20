package com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces;

import X.L8r;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: LocationDataProvider.class */
public abstract class LocationDataProvider {
    public HybridData mHybridData;

    public abstract void getCurrentCityName(NativeDataPromise nativeDataPromise);

    public abstract LocationData getCurrentLocationData();

    public abstract void setDataSource(L8r l8r);
}
