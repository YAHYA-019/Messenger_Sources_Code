package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.L5D;
import X.L8r;
import X.LBf;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: LocationDataProviderImpl.class */
public class LocationDataProviderImpl extends LocationDataProvider {
    public L8r mDataSource;

    public LocationDataProviderImpl() {
        this.mHybridData = initHybrid();
    }

    private native HybridData initHybrid();

    private native void onLocationDataUpdatedNative(LocationData locationData);

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider
    public void getCurrentCityName(NativeDataPromise nativeDataPromise) {
        L8r l8r = this.mDataSource;
        if (l8r != null) {
            l8r.A04 = nativeDataPromise;
            l8r.A06 = false;
            String str = l8r.A05;
            if (str != null) {
                nativeDataPromise.setValue(str);
                l8r.A06 = true;
            }
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider
    public LocationData getCurrentLocationData() {
        L5D A01;
        L8r l8r = this.mDataSource;
        if (l8r != null) {
            return (!l8r.A04() || (A01 = LBf.A01(l8r.A0A, "LocationDataSource", -1969198078)) == null || A01.A05() == null) ? new LocationData(false, 0.0d, 0.0d, 0.0d) : L8r.A00(l8r, A01);
        }
        return null;
    }

    public void onLocationDataUpdated(LocationData locationData) {
        onLocationDataUpdatedNative(locationData);
    }

    public void release() {
        L8r l8r = this.mDataSource;
        if (l8r != null) {
            l8r.A00 = null;
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider
    public void setDataSource(L8r l8r) {
        L8r l8r2 = this.mDataSource;
        if (l8r != l8r2) {
            if (l8r2 != null) {
                l8r2.A00 = null;
            }
            this.mDataSource = l8r;
            l8r.A00 = this;
            if (l8r.A02 == null) {
                l8r.A02();
            }
        }
    }
}
